package com.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.base.BaseDao;
import com.bean.InStock;
import com.bean.Stock;
import com.util.JdbcUtil;

public class InStockDao {
	QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
	//查看多个用户
	public List<InStock> showInStock(String account){
		List<InStock> test = new ArrayList<InStock>();;
		String sql ;
		try {
		
			sql = "select d_instock.id,d_stock.id idt,d_stock.name,d_instock.int_time,d_instock.num,d_instock.peonum from d_stock,d_instock where d_instock.stockid=d_stock.id and d_instock.peonum=? ";
			test = qr.query(sql, new BeanListHandler <InStock>(InStock.class),account);
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return test;
	}
	public List<InStock> showInStock(){
		List<InStock> test = new ArrayList<InStock>();;
		String sql ;
		try {
		
			sql = "select d_instock.id,d_stock.id idt,d_stock.name,d_instock.int_time,d_instock.num,d_instock.peonum from d_stock,d_instock where d_instock.stockid=d_stock.id ";
			test = qr.query(sql, new BeanListHandler <InStock>(InStock.class));
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return test;
	}
	
	//查看仓库
	
}
