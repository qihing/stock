package com.stock.servlet;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StockDao;
import com.dao.UserDao;
import com.mysqld.Mysqld;
import com.util.JdbcUtil;



@WebServlet("/ShowStockServlet")
public class ShowStockServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//防止中文乱码
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		Mysqld.setCon(JdbcUtil.open());//建立连接
		
		String name = req.getParameter("id");
		System.out.println(name);
		if(name==null||name.equals("")) {
			List re=new StockDao().showStock();
			req.getSession().setAttribute("user", re);
			resp.sendRedirect("mans/StockMan.jsp");
		}else {
			List re=new StockDao().showStock(name);
			req.getSession().setAttribute("user", re);
			resp.sendRedirect("mans/StockMan.jsp");
		}
			
		
			
		

		
		
	
		
	}
}
