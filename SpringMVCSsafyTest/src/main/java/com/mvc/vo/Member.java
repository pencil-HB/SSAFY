package com.mvc.vo;

public class Member {
	private String id;
	private String name;
	private String password;
	private String join_date;
	public Member(String id, String name, String password, String join_date) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.join_date = join_date;
	}
	public Member(String id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public Member(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", password=" + password + ", join_date=" + join_date + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJoin_date() {
		return join_date;
	}
	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}
	
	
}
