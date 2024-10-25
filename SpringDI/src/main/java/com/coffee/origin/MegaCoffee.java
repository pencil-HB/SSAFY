package com.coffee.origin;

public class MegaCoffee implements CoffeeShop{
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
		System.out.println("MegaCoffe...");
		ame.info();
		latte.info(); 
	}

}
