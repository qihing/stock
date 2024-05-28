package com.instock.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
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



@WebServlet("/DelInStockServlet")
public class DelInStockServlet extends HttpServlet{
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
				idt
		};
		Mysqld.setCon(JdbcUtil.open());
		ResultSet rs = Mysqld.QueryData("select * from d_stock where id=?", data);
		try {
			rs.next();
			int num = rs.getInt("num");
			rs.close();
			int temp = Integer.parseInt(num1);
			if(num-temp>=0) {
				//可以进行删除
				String data1[]= {
						name
				};
				String sql="DELETE FROM d_instock where id=?";
				int a=Mysqld.upDate(sql,data1);
				sql="update d_stock set num=num-? where id=?";
				String data2[]= {
						num1,idt
				};
				a=Mysqld.upDate(sql,data2);
				resp.sendRedirect("ShowInStockServlet");
				
			}else {
				req.getSession().setAttribute("库存不足操作失败", "入库成功");
				resp.sendRedirect("ShowInStockServlet");
			}
		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
			
		

		
		
	
		
	}
}
