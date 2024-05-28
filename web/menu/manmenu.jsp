<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
   <ul class="nav nav-tabs nav-justified">
	<li class="<%=request.getParameter("A1")%>" ><a  href="${pageContext.request.contextPath}/jspPage/man.jsp">首页</a></li>
	<li class="<%=request.getParameter("B")%>" ><a  href="${pageContext.request.contextPath}/mans/User.jsp">用户管理</a></li>
	<li class="<%=request.getParameter("C")%>" ><a  href="${pageContext.request.contextPath}/mans/StockMan.jsp">商品管理</a></li>
	
    <li class="<%=request.getParameter("D")%>" ><a  href="${pageContext.request.contextPath}/mans/InStock.jsp">入库记录</a></li>
	<li class="<%=request.getParameter("E")%>" ><a  href="${pageContext.request.contextPath}/mans/OutStock.jsp">出库记录</a></li>
</ul>

