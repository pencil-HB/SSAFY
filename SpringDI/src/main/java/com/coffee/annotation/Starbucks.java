package com.coffee.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//@Autowired: 타입 기준으로 자동 주입 해줌.
//@Component: XML문서의 <bean> 태그를 대신하여 객체를 생성한다.

@Component("star")
public class Starbucks implements CoffeeShop{
	
	@Autowired
	@Qualifier("ame1")
	Americano ame;
	
	@Autowired
	@Qualifier("latte1")
	CafeLatte latte;

	@Override
	public void info() {
		System.out.println("Starbucks...");
		ame.info();
		latte.info(); 
	}
}
