package com.mvc.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.service.BoardService;
import com.mvc.service.BoardServiceImpl;
import com.mvc.vo.Board;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class BoardController {
	// 1. 서비스에 정보 넘기니까 service가 있어야 함
	@Autowired
	BoardService service; // 인터페이스 타입을 가짐

	@GetMapping("/list")
	public String list(Model model) {
		ArrayList<Board> list = service.selectAll();
		model.addAttribute("list", list);

		return "list";
	}

	@GetMapping("/read")
	//public String read(HttpServletRequest request, Model model) {
	public String read(@RequestParam("num") String num, Model model) throws Exception {
//		if(num.equals("17")) {
//			throw new Exception();
//		}
		
		Board b = service.selectOne(num);

		model.addAttribute("b", b);
		return "read";

	}

	//화면만 출력하는 메서드
	@GetMapping("/insertForm")
	public String insertForm() {
		return "insertForm";
	}

	@PostMapping("/insertProcess")
	public String insertProcess(@ModelAttribute Board b) {		
		int x = service.insert(b);
		
		return "redirect:/list";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("num") String num) {
		service.delete(num);
		
		return "redirect:/list";
	}

	@PostMapping("/search")
	public String search(HttpServletRequest request, HttpServletResponse response, Model model) {
		String search = request.getParameter("search");
		String word = "%"+request.getParameter("word")+"%";
		
		ArrayList<Board> list = service.search(search,word);
		
		model.addAttribute("list", list);
		
		return "list";
	}
	
	@GetMapping("/txtest")
	public String txtest(Model model) {
		service.txtest();

		return "list";
	}

	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "exception 발생~ ㅜㅜ");
		mv.setViewName("error/error");
		return mv;
	}
}
