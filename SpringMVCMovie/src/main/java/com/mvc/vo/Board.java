package com.mvc.vo;

//vo: board 테이블 안의 레코드, 한 건의 정보를 표현하기 위한 클래스_pojo
public class Board {
	private String num;
	private String pass;
	private String name;
	private String wdate;
	private String title;
	private String content;
	private int count;
	
	Board(){}
	
	
	
	
	public Board(String pass, String name, String title, String content) {
		super();
		this.pass = pass;
		this.name = name;
		this.title = title;
		this.content = content;
	}




	public Board(String pass, String name, String content, int count) {
		super();
		this.pass = pass;
		this.name = name;
		this.content = content;
		this.count = count;
	}




	public Board(String num, String name, String wdate, String title, int count) {
		super();
		this.num = num;
		this.name = name;
		this.wdate = wdate;
		this.title = title;
		this.count = count;
	}




	public Board(String num, String pass, String name, String wdate, String title, String content, int count) {
		super();
		this.num = num;
		this.pass = pass;
		this.name = name;
		this.wdate = wdate;
		this.title = title;
		this.content = content;
		this.count = count;
	}




	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}




	@Override
	public String toString() {
		return "Board [num=" + num + ", pass=" + pass + ", name=" + name + ", wdate=" + wdate + ", title=" + title
				+ ", content=" + content + ", count=" + count + "]";
	}
	

}
