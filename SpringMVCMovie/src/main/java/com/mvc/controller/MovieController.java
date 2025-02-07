package com.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mvc.service.MovieService;
import com.mvc.vo.Board;
import com.mvc.vo.Movie;
import com.mvc.vo.User;

import jakarta.servlet.http.HttpSession;

@Controller
public class MovieController {

	@Autowired
	MovieService service;

	@GetMapping("/list")
	public String list(Model model) {
		List<Movie> list = service.selectAll();
		model.addAttribute("list", list);

		return "list";
	}

	@GetMapping("/read")
	// public String read(HttpServletRequest request, Model model) {
	public String read(@RequestParam("id") int id, Model model) throws Exception {
		if (id == 17) {
			throw new Exception();
		}

		Movie m = service.selectOne(id);

		model.addAttribute("m", m);
		return "read";

	}

	// 화면만 출력하는 메서드
	@GetMapping("/insertForm")
	public String insertForm() {
		return "insertForm";
	}

	@PostMapping("/insertProcess")
	public String insertProcess(@ModelAttribute Movie m) throws Exception {
		int x = service.insert(m);

		if (x < 0) {
			throw new Exception();
		}

		return "redirect:/list";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id) throws Exception {
		int x = service.delete(id);

		if (x < 0) {
			throw new Exception();
		}

		return "redirect:/list";
	}
	
	@GetMapping("/loginForm")
	public String loginForm() throws Exception {
		
		return "loginForm";
	}
	
	@PostMapping(value = "/loginProcess")
	public String login2(HttpSession session, @RequestParam("id") String id, @RequestParam("pass") String pass, 
			//@RequestParam("admin") String admin, 
			RedirectAttributes ra) throws Exception {// id, pass 받아와서 db에 가서 체크 한 후에 세션에 저장
		
			User user = new User(id, pass);
			boolean flag = service.check(user);
			String url = "list";// ok

			if (flag) {// 로그인 성공
				session.setAttribute("user", user);
			} else { // 로그인 실패	
				//세션을 이용하기 때문. 단, 1회용이기 때문에 redirect 된후 사라진다.전달된 Parameter는 URL에 노출되지 않는다.post 형식으로
				ra.addFlashAttribute("errormsg", "ID/PW를 확인해 주세요!");//바로 ${errormsg}로 꺼내서 씀.addFlashAttribute 의 경우 데이타가 post 형식으로 전달이 된다.
				//ra.addAttribute("errormsg", "ID/PW를 입력해 주세요!");// 데이타가 URI에 노출. param으로 전달됨 ${param.errormsg}. get
				url = "loginForm";
			}
		
		return "redirect:/" + url;// view name
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) throws Exception {
		session.setAttribute("user", null);
		session.setAttribute("admin", null);
		
		return "redirect:/list";
	}
}
