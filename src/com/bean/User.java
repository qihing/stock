package com.bean;

public class User {
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String account, String pwd, String pow) {
		super();
		this.account = account;
		this.pwd = pwd;
		this.pow = pow;
	}
	@Override
	public String toString() {
		return " {\"account\":\"" + account + "\", \"pwd\":\"" + pwd + "\", \"pow\":\"" + pow + "\"} ";
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPow() {
		return pow;
	}
	public void setPow(String pow) {
		this.pow = pow;
	}
	private String account;
	private String pwd;
	private String pow;

}
