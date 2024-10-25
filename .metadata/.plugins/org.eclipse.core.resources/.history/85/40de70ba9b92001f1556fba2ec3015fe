package com.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mvc.mapper.UserMapper;
import com.mvc.vo.User;

//@Component
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper mapper;

	@Override
	public User check(User u) {
		return mapper.check(u); //u 안에 id랑 pw들어있음
	}

}
