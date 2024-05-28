package com.servlet;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.dao.UserDao;
import com.mysqld.Mysqld;
import com.util.JdbcUtil;



@WebServlet("/DelUserServlet")
public class DelUserServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//防止中文乱码
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		Mysqld.setCon(JdbcUtil.open());//建立连接
		
		String name = req.getParameter("account");
		String sql="DELETE FROM d_user where account=?";
		String data[]= {
				name	
		};
		Mysqld.setCon(JdbcUtil.open());
		int a=Mysqld.upDate(sql,data);
	  

		resp.sendRedirect("ShowUserServlet");
			
		
			
		

		
		
	
		
	}
}
