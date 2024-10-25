package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		
		Car c = (Car)context.getBean("avante");
		
		c.setColor("red");
		System.out.println("color:" + c.getColor());
		
		System.out.println();
		System.out.println(c.count(13));
	}
}
