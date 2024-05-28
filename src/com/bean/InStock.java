package com.bean;

public class InStock {
	
	public InStock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InStock(String id, String idt, String name, String int_time, String num, String peonum) {
		super();
		this.id = id;
		this.idt = idt;
		this.name = name;
		this.int_time = int_time;
		this.num = num;
		this.peonum = peonum;
	}
	@Override
	public String toString() {
		return " {\"id\":\"" + id + "\", \"idt\":\"" + idt + "\", \"name\":\"" + name + "\", \"int_time\":\"" + int_time
				+ "\", \"num\":\"" + num + "\", \"peonum\":\"" + peonum + "\"} ";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdt() {
		return idt;
	}
	public void setIdt(String idt) {
		this.idt = idt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInt_time() {
		return int_time;
	}
	public void setInt_time(String int_time) {
		this.int_time = int_time;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getPeonum() {
		return peonum;
	}
	public void setPeonum(String peonum) {
		this.peonum = peonum;
	}
	private String id;
	private String idt;
	private String name;
	private String int_time;
	private String num;
	private String peonum;
	
	

}
