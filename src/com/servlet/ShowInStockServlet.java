package com.servlet;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.base.BaseDao;
import com.dao.InStockDao;
import com.dao.StockDao;
import com.dao.UserDao;
import com.mysqld.Mysqld;
import com.util.JdbcUtil;



@WebServlet("/MShowInStockServlet")
public class ShowInStockServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//防止中文乱码
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		Mysqld.setCon(JdbcUtil.open());//建立连接
		
		String name = req.getParameter("id");
		System.out.println(name);

		List re=new InStockDao().showInStock();
		req.getSession().setAttribute("user", re);
		resp.sendRedirect("mans/InStock.jsp");
			
		
			
		

		
		
	
		
	}
}
