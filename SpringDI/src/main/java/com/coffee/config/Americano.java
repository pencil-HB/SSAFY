package com.coffee.config;

public class Americano implements Coffee {
	
	int price;
	String origin;
	
	public Americano(int price) {
		this.price = price;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void info() {
		System.out.println("Americano: 강렬한 에스프레소 샷과 뜨거운 물의 조화");
		System.out.println("가격: "+price);
		System.out.println("원산지: "+origin);
	}

}
