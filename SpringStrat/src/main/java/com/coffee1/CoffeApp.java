package com.coffee1;

public class CoffeApp {
	public static void main(String[] args) {
		//Americano cof = new Americano(); // 커피앱.java 가 아메리카노에 의존하고 있다.
		CafeLatte cof = new CafeLatte();
		cof.info();
	}
}
