<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
             <%@ page import="com.dao.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>仓库管理系统</title>
<link href="${pageContext.request.contextPath}/js/css/bootstrap.min.css" rel="stylesheet">
 

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="${pageContext.request.contextPath}/js/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="/menu/manmenu.jsp" flush="true" >
<jsp:param name="D" value="active"/>
</jsp:include>

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row clearfix">
				<div class="col-md-4 column">
				</div>
				<div class="col-md-4 column">
			
					<form role="form" action="${pageContext.request.contextPath}/MShowInStockServlet" method="post">
					
						<button type="submit" class="btn btn-default" >查找入库记录</button>
					</form>
				</div>
				<div class="col-md-4 column">
				</div>
			</div>
			<div class="row clearfix">
				<div class="col-md-12 column">
					<table class="table">
						<thead>
							<tr>
								<th>
									入库编号
								</th>
								<th>
									商品编号
								</th>
								<th>
									商品名字
								</th>
								<th>
									入库时间
								</th>
								<th>
									入库数量
								</th>
								<th>
									入库人员
								</th>
								<th>
									操作
								</th>
						
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${user}"  var="obj">
							<tr>
								<td>
									${obj.id}
								</td>
								<td>
									${obj.idt}
								</td>
								<td>
									${obj.name}
								</td>
								<td>
									${obj.int_time}
								</td>
								<td>
									${obj.num}
								</td>
								<td>
									${obj.peonum}
								</td>
								<td>
									<a href="${pageContext.request.contextPath}/MDelInStockServlet?id=${obj.id}&idt=${obj.idt}&num=${obj.num}">删除</a>|
									
								</td>
							
							</tr>
							
						</c:forEach>
				 	<%request.getSession().removeAttribute("user"); %>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>


</body>
</html>