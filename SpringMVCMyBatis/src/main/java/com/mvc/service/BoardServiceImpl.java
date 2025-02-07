package com.mvc.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.mapper.BoardMapper;
import com.mvc.vo.Board;

//BoardService의 메소드를 구현한 객체
//컨트롤러에게서 들어온 요청을 처리함(mapper에게 넘김)
@Service
public class BoardServiceImpl implements BoardService {
	// 1. mapper한테 넘겨야하니까 mapper있어야함
	@Autowired
	BoardMapper mapper; //proxy 객체가 주입된다.

	@Override
	public ArrayList<Board> selectAll() {
		return mapper.selectAll();
	}

	@Override
	public Board selectOne(String num) {
		mapper.countUp(num);
		return mapper.selectOne(num);
	}

	@Override
	public int insert(Board b) {
		int res = mapper.insert(b);
		return res;

	}

	@Override
	public void delete(String num) {
		mapper.delete(num);

	}

	@Override
	public ArrayList<Board> search(String type, String word) {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("type", type);
		map.put("word", word);
		
		return mapper.search(map);

	}

	@Override
	@Transactional
	public void txtest() {
		mapper.txtest();
		mapper.txtest();
		
		return;
	}

}
