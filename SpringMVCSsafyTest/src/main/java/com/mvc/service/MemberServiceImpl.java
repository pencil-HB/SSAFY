package com.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mvc.mapper.MemberMapper;
import com.mvc.vo.Member;

//@Component
@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberMapper mapper;

	@Override
	public Member check(Member u) {
		return mapper.check(u); //u 안에 id랑 pw들어있음
	}

}
