package com.coffee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// xml 문서를 대신해서 필요한 객체를 생성하는 객체
@Configuration
public class CoffeeConfig {
	/*
	 * <bean id="getStarAme" class="~"></bean>
	 */
	
	@Bean
	public Americano getStarAme() {
		Americano a=new Americano(5000);
		a.setOrigin("Kenya");
		return a;
	}
	
	@Bean
	public CafeLatte getStarLatte() {
		CafeLatte a=new CafeLatte(6000);
		a.setOrigin("India");
		return a;
	}
	
	@Bean
	public Americano getMegaAme() {
		Americano a=new Americano(3500);
		a.setOrigin("Brazil");
		return a;
	}
	
	@Bean
	public CafeLatte getMegaLatte() {
		CafeLatte a=new CafeLatte(4000);
		a.setOrigin("Ethiopia");
		return a;
	}
	
	@Bean
	public Starbucks getStar() {
		return new Starbucks(getStarAme(), getStarLatte());
	}
	
	@Bean
	public MegaCoffee getMega() {
		MegaCoffee m=new MegaCoffee();
		m.setAme(getMegaAme());
		m.setLatte(getMegaLatte());
		return m;
	}
	
}
