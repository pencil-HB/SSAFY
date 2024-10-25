package com.coffee.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// ApplicationContext: 객체 관리를 해주는 컨테이너
// AnnotationConfigApplicationContext: 자바 객체를 이용해서 객체를 생성해 주고 관리하는 컨테이너
public class CoffeeApp {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(CoffeeConfig.class);
		
		CoffeeShop shop1=(CoffeeShop)context.getBean("getStar");
		CoffeeShop shop2=(CoffeeShop)context.getBean("getMega");
		shop1.info();
		System.out.println();
		shop2.info();
	}

}
