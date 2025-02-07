package com.mybatis;

import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.event.ListDataEvent;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class CustomerAppDynamic {
	public static void main(String[] args) {
		String conf = "res/Configuration.xml";
		Reader reader;

		try {
			reader = Resources.getResourceAsReader(conf);
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(reader);
			SqlSession session = factory.openSession(true); // true로 설정시 오토커밋, 없을시 session.commit 해줘야댐

			Map<String, String> map = new HashMap<>();
			//map.put("fname", "a");
			//map.put("deptid", "30");
			//map.put("jobid", "IT_PROG");
			map.put("email", "A");
			
			
			
			//List<Customer> list = session.selectList("Customer.selectMore");
			//List<Customer> list = session.selectList("Customer.selectMore", map);
			//List<Customer> list = session.selectList("Customer.selectMore2", map);
			//List<Customer> list = session.selectList("Customer.selectMore3", map);
			
			String[] depts = {"20", "30", "50"};
			List<Customer> list = session.selectList("Customer.selectForEach", depts);
			
			

			for (Customer c : list) {
				System.out.println(c);
			}
			
			System.out.println(list.size());
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
