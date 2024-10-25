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
@WebFilter(filterName = "f2")
public class YourFilter implements Filter {
	
	public YourFilter() {
		System.out.println("YourFilter 생성!");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//HttpServletRequest req = (HttpServletRequest) request;

		//1. 사전처리 작업. 
		
		System.out.println("YourFilter 사전처리");
		
		chain.doFilter(request, response);
		
		//2. 사후처리 작업.
		System.out.println("YourFilter 사후처리");
	}

}
