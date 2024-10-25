package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//Aspect 객체 (  Pointcut(when) + Advice(what)  )

@Aspect
public class ColorAspect {
	
	@Before("execution(void set*(*))")
	public void colorTrack(JoinPoint jp) {
		System.out.println("before advice 시작!");
		System.out.println("Target:"+jp.getTarget().getClass().getName());
		System.out.println("method:"+jp.getSignature());
		System.out.println("args:"+jp.getArgs()[0]);
		System.out.println("before advice 시작!");
	}
	
	@After("execution(String get*())")
	public void colorAfterTrack(JoinPoint jp) {
		System.out.println("After death");
	}
	
	@Around("execution(int count(int))")
	public int doCount(ProceedingJoinPoint jp) throws Throwable {
		
		//1. 먼저 할 일
		System.out.println("세어봅시다");
		
		int n = (int) jp.proceed(); // 핵심 메소드 == count
		
		//2. 끝나고 할 일
		System.out.println("세기끝났다");
		
		return n;
	}
}
