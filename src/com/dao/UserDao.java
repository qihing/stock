package com.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;


import com.bean.User;
import com.util.JdbcUtil;

public class UserDao {
	QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
	//查看多个用户
	public List<User> showUser(){
		List<User> test = new ArrayList<User>();;
		String sql ;
		try {
		
			sql = "select * from d_user";
			test = qr.query(sql, new BeanListHandler <User>(User.class));
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return test;
	}
	
	public List<User> showUser(String account){
		List<User> test = new ArrayList<User>();;
		String sql ;
		try {
		
			sql = "select * from d_user where account=?";
			test = qr.query(sql, new BeanListHandler <User>(User.class),account);
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return test;
	}
	//查看仓库
	
}
