package com.coffee2;

public class CoffeApp {
	public static void main(String[] args) {
		//Americano cof = new Americano(); // 커피앱.java 가 아메리카노에 의존하고 있다.
		Coffee cof = new CafeLatte();
		cof.info();
	}
}
