package com.coffee.config;

public class Starbucks implements CoffeeShop {
	
	Americano ame;
	CafeLatte latte;

	public Starbucks(Americano ame, CafeLatte latte) {
		this.ame = ame;
		this.latte = latte;
	}

	@Override
	public void info() {
		System.out.println("Starbucks...");
		ame.info();
		latte.info();
	}

}
