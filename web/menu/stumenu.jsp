<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <!-- active -->
    <ul class="nav nav-tabs nav-justified">
	<li class="<%=request.getParameter("A1")%>" ><a  href="${pageContext.request.contextPath}/jspPage/stu.jsp">首页</a></li>
	<li class="<%=request.getParameter("A")%>" ><a  href="${pageContext.request.contextPath}/man/InStock.jsp">入库管理</a></li>
	<li class="<%=request.getParameter("B")%>" ><a  href="${pageContext.request.contextPath}/man/OutStock.jsp">出库管理</a></li>

</ul>