package com.mvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionControllerAdvice {
	
	@ExceptionHandler(Exception.class)
	public String handleException(Exception ex, Model m) {
		m.addAttribute("msg", "계속 예외 발생!!!" + ex.toString());
		return "error/error";
	}
}
