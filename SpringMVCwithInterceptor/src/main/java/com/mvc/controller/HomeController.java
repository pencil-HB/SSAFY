package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;


//Controller : DispatcherServlet(Front Controller)로부터 전달 받음.
//http://localhost:8080

//이 클래스가 컨트롤러 클래스임을 표시한다.
//@RequestMapping : HandlerMapping의 역할을 함. 

//Controller안의 메소드에서 리턴하는 문자열은 논리적인 view의 이름이 된다.
@Controller
public class HomeController {
	
	//http://localhost:8080/SpringMVC(context root)/home 으로 간다.
	//@RequestMapping(value="/home", method=RequestMethod.GET)
	@GetMapping("/home")
	public String home(Model model) { // 메모리에 model 이라는 이름의 Model 타입이 있다면 자동으로 넣어주지만 없을 시 하나 새로 만들어서 넣어준다.
		model.addAttribute("city", "seattle");
		return "home";// 기본 forward 방식
	}
	
	@GetMapping("/")
	public String index(Model model) { // 메모리에 model 이라는 이름의 Model 타입이 있다면 자동으로 넣어주지만 없을 시 하나 새로 만들어서 넣어준다.
		model.addAttribute("name", "hb");
		return "index";// 기본 forward 방식
	}
	
}
