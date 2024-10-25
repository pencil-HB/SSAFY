package com.board;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BoardAspect {
	
	@After("execution (String read(int))")
	public String doRead(JoinPoint jp) {
		System.out.println(jp.getArgs()[0]+"번 글을 읽었습니다.");
		return "";
	}
	
	@Before("execution (void *(int))")
	public void loginCheck(JoinPoint jp) {
		System.out.println("로그인 체크를 진행합니다.");
	}
}
