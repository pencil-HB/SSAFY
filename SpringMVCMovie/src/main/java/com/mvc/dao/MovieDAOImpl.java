package com.mvc.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.vo.Movie;
import com.mvc.vo.User;

@Repository
public class MovieDAOImpl implements MovieDAO {

	static String conf = "Configuration.xml";
	static Reader reader;
	static SqlSession session;
	
	public MovieDAOImpl() throws IOException {
		reader = Resources.getResourceAsReader(conf);
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(reader);
		session = factory.openSession(true);
	}
	
	@Override
	public List<Movie> selectAll() {

		List<Movie> list = session.selectList("selectAll");
		
		return list;
	}
	@Override
	public Movie selectOne(int id) {
		
		Movie m = session.selectOne("selectOne", id);
		
		return m;
	}

	@Override
	public int insert(Movie m) {
		int res = session.insert("insert", m);
		return res;
	}
	
	@Override
	public int delete(int id) {
		int res = session.delete("delete", id);
		return res;
	}

	@Override
	public boolean check(User u) {
		String id = session.selectOne("loginCheck", u);

		if(id!=null) {
			return true;
		}
		else {
			return false;
		}
	}
}
