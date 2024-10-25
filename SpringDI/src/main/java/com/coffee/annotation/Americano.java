package com.coffee.annotation;

public class Americano implements Coffee {
	int price;
	String origin;
	
	public void info() {
		System.out.println("Americano:강렬한 에스프레소 샷과 뜨거운 물의 조화");
		System.out.println("가격:"+price);
		System.out.println("원산지:"+origin);
	}

}
