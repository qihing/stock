package com.stock.servlet;

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



@WebServlet("/UpdateStockServlet")
public class UpdateStockServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//防止中文乱码
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		Mysqld.setCon(JdbcUtil.open());//建立连接
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String suppos = req.getParameter("suppos");

		String sql="UPDATE d_stock set name=?,suppos=? where id=?";
		String data[]= {
				name,suppos,id
		};
		
		int a=Mysqld.upDate(sql, data);
		
		if(a==1) {
			//报错
			req.getSession().setAttribute("sta", "更改成功");
			req.getRequestDispatcher("mans/upDateStockMan.jsp").forward( req, resp);
		}else {
			req.getSession().setAttribute("sta", "更改失败");
			req.getRequestDispatcher("mans/upDateStockMan.jsp").forward( req, resp);
	
		}
			
		
			
		

		
		
	
		
	}
}
