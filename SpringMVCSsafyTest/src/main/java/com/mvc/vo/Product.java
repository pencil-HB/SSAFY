package com.mvc.vo;

//vo: board 테이블 안의 레코드, 한 건의 정보를 표현하기 위한 클래스_pojo
public class Product {
	private String code;
	private String model;
	private String price;
	private String id;
	private String regist_date;
	private String detail;
	public Product(String code, String model, String price, String id, String regist_date, String detail) {
		super();
		this.code = code;
		this.model = model;
		this.price = price;
		this.id = id;
		this.regist_date = regist_date;
		this.detail = detail;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRegist_date() {
		return regist_date;
	}
	public void setRegist_date(String regist_date) {
		this.regist_date = regist_date;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "Product [code=" + code + ", model=" + model + ", price=" + price + ", id=" + id + ", regist_date="
				+ regist_date + ", detail=" + detail + "]";
	}
	
	
	
	
}
