package com.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.bean.InStock;
import com.bean.Stock;
import com.util.JdbcUtil;

public class OutStockDao {
	QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
	//查看多个用户
	public List<InStock> showOutStock(String account){
		List<InStock> test = new ArrayList<InStock>();;
		String sql ;
		try {
		
			sql = "select d_outstock.id,d_stock.id idt,d_stock.name,d_outstock.int_time,d_outstock.num,d_outstock.peonum from d_stock,d_outstock where d_outstock.stockid=d_stock.id and d_outstock.peonum=?";
			test = qr.query(sql, new BeanListHandler <InStock>(InStock.class),account);
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return test;
	}
	public List<InStock> showOutStock(){
		List<InStock> test = new ArrayList<InStock>();;
		String sql ;
		try {
		
			sql = "select d_outstock.id,d_stock.id idt,d_stock.name,d_outstock.int_time,d_outstock.num,d_outstock.peonum from d_stock,d_outstock where d_outstock.stockid=d_stock.id ";
			test = qr.query(sql, new BeanListHandler <InStock>(InStock.class));
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return test;
	}
	//查看仓库
	
}
