package com.outstock.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.handlers.BeanHandler;

import com.base.BaseDao;
import com.mysqld.Mysqld;
import com.util.JdbcUtil;



@WebServlet("/AddOutStockServlet")
public class AddOutStockServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//防止中文乱码
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		Mysqld.setCon(JdbcUtil.open());//建立连接
		
		String id = req.getParameter("id");
		String num = req.getParameter("num");
	
		
		String datas[]= {
				num,id
		};
		 int a=Mysqld.upDate("update d_stock set num=num-? where id=?", datas);
		 if(a==1) {
			 String sql="insert into d_outstock (stockid,int_time,num,peonum) VALUES(?,now(),?,?)";
			 String str=BaseDao.getCookic(req, "account");
				String data[]= {
						id,num,str};
				a=Mysqld.upDate(sql, data);
				req.getSession().setAttribute("sta", "出库成功");
				resp.sendRedirect("ShowOutStockServlet");
		}else {
			req.getSession().setAttribute("sta", "出库成功");
			resp.sendRedirect("ShowOutStockServlet");
		}
		

		
		
		
		
	
		
		
		
		
			
		

		
		
	
		
	}
}
