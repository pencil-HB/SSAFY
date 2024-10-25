package com.ssafy.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	//디폴트 설정은 GET, Forward
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	@GetMapping
	public ModelAndView index () {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("index");
		mav.addObject("name", "hb");
		
		return mav;
	}
	
	//@RequestMapping(value = "/", method = RequestMethod.POST)
	@PostMapping
	public ModelAndView index2 () {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("index");
		mav.addObject("name", "hb");
		
		return mav;
	}

}
