package com.mvc.dao;

import java.util.ArrayList;
import java.util.List;

import com.mvc.vo.Movie;
import com.mvc.vo.User;

public interface MovieDAO {
	public List<Movie> selectAll();
	public Movie selectOne(int id);
	public int insert(Movie m);
	public int delete(int id);
	public boolean check(User u);
}
