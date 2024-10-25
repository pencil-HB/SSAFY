package com.coffee.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//ApplicationContext : 객체 관리를 해주는 *컨테이너*
//ClassPathXmlApplicationContext : 클래스패스 위치에서 xml 문서를 읽어와서 객체를 생성해주고 관리하는 컨테이너

public class CoffeeApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("coffee2.xml");

		CoffeeShop sh1 = (CoffeeShop) context.getBean("star");
		CoffeeShop sh2 = (CoffeeShop) context.getBean("mega");

		sh1.info();
		System.out.println();
		sh2.info();
	}
}
