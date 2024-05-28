package com.servlet;

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

import com.mysqld.Mysqld;
import com.util.JdbcUtil;



@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//防止中文乱码
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		Mysqld.setCon(JdbcUtil.open());//建立连接
		
		String name = req.getParameter("account");
		String password = req.getParameter("pwd");
		

		String sql="insert into d_user (account,pwd) VALUES(?,?)";
		Mysqld.setCon(JdbcUtil.open());
		String data[]= {
				name,password
		};
		
		int a=Mysqld.upDate(sql, data);
		
		if(a==1) {
			//报错
			req.getSession().setAttribute("sta", "添加成功");
			resp.sendRedirect("mans/User.jsp");
		}else {
			req.getSession().setAttribute("sta", "添加失败");
			resp.sendRedirect("mans/User.jsp");
		}
			
		
			
		

		
		
	
		
	}
}
