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



@WebServlet("/Login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//防止中文乱码
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		Mysqld.setCon(JdbcUtil.open());//建立连接
		
		String name = req.getParameter("account");
		String password = req.getParameter("password");
		
		
		
			String sql="select * from d_user where account=? and pwd=?";
			String data[]= {
					name,password
			};
			ResultSet rs = Mysqld.QueryData(sql, data);
			try {
				if(rs.next()) {
					//成功
					String pow=rs.getString("pow");
				
					if(pow.equals("1")) {
						resp.addCookie(new Cookie("account",name));//存入账号
						resp.addCookie(new Cookie("password",password));//存入账号
						resp.addCookie(new Cookie("pow",pow));//存入账号
						req.getSession().setAttribute("adminaaa", "欢迎"+name+"登录成功");
						resp.sendRedirect("jspPage/man.jsp");//跳入超级管理员
					}else {
						resp.addCookie(new Cookie("account",name));//存入账号
						resp.addCookie(new Cookie("password",password));//存入账号
						resp.addCookie(new Cookie("pow",pow));//存入账号
						req.getSession().setAttribute("adminaaa", "欢迎"+name+"登录成功");
						resp.sendRedirect("jspPage/stu.jsp");//跳入管理员
					}
					
				}else {
					//失败
					req.getSession().setAttribute("admin", "账号或密码错错误");
					resp.sendRedirect("Login.jsp");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		
			
		

		
		
	
		
	}
}
