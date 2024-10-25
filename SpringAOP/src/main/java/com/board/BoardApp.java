package com.board;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BoardApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("board.xml");
		
		Board b = (Board) context.getBean("free");
		
		b.read(4);
		b.delete(2);
		b.write(3);
	}
}
