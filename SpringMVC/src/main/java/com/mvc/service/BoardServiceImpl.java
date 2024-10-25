package com.mvc.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mvc.dao.BoardDAO;
import com.mvc.dao.BoardDAOImpl;
import com.mvc.vo.Board;

//BoardService의 메소드를 구현한 객체
//컨트롤러에게서 들어온 요청을 처리함(DAO에게 넘김)
@Service
public class BoardServiceImpl implements BoardService {
	// 1. dao한테 넘겨야하니까 dao있어야함
	@Autowired
	BoardDAO dao;

	@Override
	public ArrayList<Board> selectAll() {
		return dao.selectAll();
	}

	@Override
	public Board selectOne(String num) {
		dao.countUp(num);
		return dao.selectOne(num);
	}

	@Override
	public int insert(Board b) {
		int res = dao.insert(b);
		return res;

	}

	@Override
	public void delete(String num) {
		dao.delete(num);

	}

	@Override
	public ArrayList<Board> search(String type, String word) {
		return dao.search(type, word);

	}

}
