package com.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;


import com.bean.Stock;
import com.util.JdbcUtil;

public class StockDao {
	QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
	//查看多个用户
	public List<Stock> showStock(){
		List<Stock> test = new ArrayList<Stock>();;
		String sql ;
		try {
		
			sql = "select * from d_stock";
			test = qr.query(sql, new BeanListHandler <Stock>(Stock.class));
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return test;
	}
	
	public List<Stock> showStock(String account){
		List<Stock> test = new ArrayList<Stock>();;
		String sql ;
		try {
		
			sql = "select * from d_Stock where account=?";
			test = qr.query(sql, new BeanListHandler <Stock>(Stock.class),account);
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return test;
	}
	//查看仓库
	
}
