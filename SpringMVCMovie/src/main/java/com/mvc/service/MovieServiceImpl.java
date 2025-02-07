package com.mvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.MovieDAO;
import com.mvc.vo.Movie;
import com.mvc.vo.User;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieDAO dao;
	
	@Override
	public List<Movie> selectAll() {
		return dao.selectAll();
	}

	@Override
	public Movie selectOne(int id) {
		return dao.selectOne(id);
	}

	@Override
	public int insert(Movie m) {
		return dao.insert(m);
	}

	@Override
	public int delete(int id) {
		return dao.delete(id);
	}

	@Override
	public boolean check(User u) {
		return dao.check(u); //u 안에 id랑 pw들어있음
	}
}
