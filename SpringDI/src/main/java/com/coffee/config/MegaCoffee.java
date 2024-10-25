package com.coffee.config;

public class MegaCoffee implements CoffeeShop {
	
	Americano ame;
	CafeLatte latte;

	public void setAme(Americano ame) {
		this.ame = ame;
	}

	public void setLatte(CafeLatte latte) {
		this.latte = latte;
	}

	@Override
	public void info() {
		System.out.println("MegaCoffee...");
		ame.info();
		latte.info();
	}

}
