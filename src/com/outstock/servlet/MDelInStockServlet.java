package com.outstock.servlet;

import com.mysqld.Mysqld;
import com.util.JdbcUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/MDelOutStockServlet")
public class MDelInStockServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//防止中文乱码
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		Mysqld.setCon(JdbcUtil.open());//建立连接
		
		String name = req.getParameter("id");
		String idt = req.getParameter("idt");
		String num1 = req.getParameter("num");
		String data[]= {
				num1,idt
		};
		Mysqld.setCon(JdbcUtil.open());
		int a=Mysqld.upDate("update d_stock set num=num+? where id=?", data);
		if(a==1) {
			String data1[]= {
					name	
			};
			a=Mysqld.upDate("DELETE FROM d_outstock where id=? ", data1);
			req.getSession().setAttribute("删除成功", "出库成功");
			resp.sendRedirect("MShowOutStockServlet");
		}else {
			req.getSession().setAttribute("操作失败", "出库成功");
			resp.sendRedirect("MShowOutStockServlet");
		}

		
			
			
		
			
		
			
		

		
		
	
		
	}
}
