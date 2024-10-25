package com.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mvc.dao.UserDAO;
import com.mvc.dao.UserDAOImpl;
import com.mvc.vo.User;

//@Component
//@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDAO dao;

	@Override
	public boolean check(User u) {
		return dao.check(u); //u 안에 id랑 pw들어있음
	}

}
