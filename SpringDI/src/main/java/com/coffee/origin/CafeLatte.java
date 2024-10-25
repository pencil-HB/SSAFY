package com.coffee.origin;

public class CafeLatte implements Coffee{
	int price;
	String origin;
	
	public CafeLatte(int price) {
		this.price = price;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
	public void info() {
		System.out.println("CaffeLatte:에스프레소 샷과 따뜻한 우유와 거품으로 마무리된 음료");
		System.out.println("가격:"+price);
		System.out.println("원산지:"+origin);
	}

}
