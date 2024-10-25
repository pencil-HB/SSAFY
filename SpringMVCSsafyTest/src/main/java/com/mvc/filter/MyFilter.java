package com.mvc.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

//@WebFilter(urlPatterns = {"/read"})
@WebFilter(filterName = "f1")
public class MyFilter implements Filter {
	
	public MyFilter() {
		System.out.println("MyFilter 생성!");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//HttpServletRequest req = (HttpServletRequest) request;

		//1. 사전처리 작업. 
		
		System.out.println("MyFilter 사전처리");
		
		chain.doFilter(request, response);
		
		//2. 사후처리 작업.
		System.out.println("MyFilter 사후처리");
	}

}
