package com.coffee3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//ApplicationContext : 객체 관리를 해주는 *컨테이너*
//ClassPathXmlApplicationContext : 클래스패스 위치에서 xml 문서를 읽어와서 객체를 생성해주고 관리하는 컨테이너

public class CoffeApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("coffee.xml");
//		ApplicationContext context2 = new FileSystemXmlApplicationContext("c:\\test\\coffee.xml");
//		Coffee cof = (Coffee)context.getBean("cof1"); //new 안한다(context만들 때 만들어서 대기하게 됨). object 타입으로 준다.
//		Coffee cof2 = context.getBean("cof1", Coffee.class);
//		
//		System.out.println(cof);
//		System.out.println(cof2);
		
//		cof.info();
	}
}
