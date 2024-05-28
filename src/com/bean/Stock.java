package com.bean;

public class Stock {
	
	
	private String id;
	private String name;
	private String suppos;
	private String num;
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stock(String id, String name, String suppos, String num) {
		super();
		this.id = id;
		this.name = name;
		this.suppos = suppos;
		this.num = num;
	}
	@Override
	public String toString() {
		return " {\"id\":\"" + id + "\", \"name\":\"" + name + "\", \"suppos\":\"" + suppos + "\", \"num\":\"" + num
				+ "\"} ";
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
	public String getSuppos() {
		return suppos;
	}
	public void setSuppos(String suppos) {
		this.suppos = suppos;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
}
