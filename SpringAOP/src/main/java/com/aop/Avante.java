package com.aop;

//Target 객체
public class Avante implements Car{

	String color;
	

	@Override
	public void setColor(String color) {
		System.out.println("setColor 메소드 호출됨");
		this.color = color;
	}

	@Override
	public String getColor() {
		System.out.println("getColor 메소드 호출됨");
		return color;
	}

	@Override
	public int count(int num) {
		System.out.println("count 메소드 호출!");
		return ++num;
	}

}
