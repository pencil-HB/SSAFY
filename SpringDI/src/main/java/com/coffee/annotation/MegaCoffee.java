package com.coffee.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MegaCoffee implements CoffeeShop{
	
	@Autowired
	@Qualifier("ame2")
	Americano ame;
	
	@Autowired
	@Qualifier("latte2")
	CafeLatte latte;

	@Override
	public void info() {
		System.out.println("MegaCoffe...");
		ame.info();
		latte.info(); 
	}

}
