package com.mybatis;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListDataEvent;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class CustomerApp {
	/*
	 * public static void main(String[] args) { String conf =
	 * "res/Configuration.xml"; Reader reader;
	 * 
	 * try { reader = Resources.getResourceAsReader(conf); SqlSessionFactoryBuilder
	 * builder = new SqlSessionFactoryBuilder(); SqlSessionFactory factory =
	 * builder.build(reader); SqlSession session = factory.openSession(true); //
	 * true로 설정시 오토커밋, 없을시 session.commit 해줘야댐
	 * 
	 * int x = session.insert("insert", new Customer("333", "name", "address"));
	 * System.out.println(x+"건의 레코드 추가!");
	 * 
	 * List<Customer> list = session.selectList("selectAll");
	 * 
	 * for (Customer c : list) { System.out.println(c); }
	 * 
	 * int y = session.delete("delete", "333"); System.out.println(y+"건의 레코드 삭제!");
	 * 
	 * Customer c1 = session.selectOne("selectOne", "113");
	 * c1.setAddress("seattle"); session.update("update", c1);
	 * 
	 * list = session.selectList("selectAll");
	 * 
	 * for (Customer c : list) { System.out.println(c); }
	 * 
	 * Customer c = session.selectOne("selectOne", "311"); System.out.println(c);
	 * 
	 * System.out.println();
	 * 
	 * Object slist; slist= session.selectList("selectIdNameDeptName");
	 * 
	 * 
	 * System.out.println("--------"); for (Object o : (List) slist) {
	 * System.out.println(o); } System.out.println("--------");
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } }
	 */
}
