package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysqld.Mysqld;
import com.util.JdbcUtil;


/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//防止中文乱码
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		Mysqld.setCon(JdbcUtil.open());//建立连接
	
		
		String name = req.getParameter("account");
		String password = req.getParameter("password");
		String pow = req.getParameter("pow");
		
		
		String sql="insert into d_user (account,pwd) VALUES(?,?)";
		Mysqld.setCon(JdbcUtil.open());
		String data[]= {
				name,password
		};
		
		int a=Mysqld.upDate(sql, data);
		
		if(a==1) {
			//报错
			req.getSession().setAttribute("admin", "注册成功，请登录。");
			resp.sendRedirect("Register.jsp");
		}else {
			req.getSession().setAttribute("admin", "注册失败，请重新注册");
			resp.sendRedirect("Register.jsp");
		}
	
		
		
		
	
		
		
		
	}

}
