<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<jsp:param name="C" value="active"/>
</jsp:include>

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row clearfix">
				<div class="col-md-4 column">
				</div>
				<div class="col-md-4 column">
					<form role="form" action="${pageContext.request.contextPath}/AddStockServlet" method="post">
						<div class="form-group" >
							 <label for="A">商品编号</label><input name="id"type="text" class="form-control" id="A" />
						</div>
						<div class="form-group">
							 <label for="B">商品名字</label><input name="name" type="text" class="form-control" id="B" />
						</div>
						<div class="form-group">
							 <label for="B">商品产地</label><input name="suppos" type="text" class="form-control" id="B" />
						</div>
						<button type="submit" class="btn btn-default" >添加商品</button>${sta }<%request.getSession().removeAttribute("sta"); %>
					</form>
					
					<form role="form" action="${pageContext.request.contextPath}/ShowStockServlet" method="post">
						<div class="form-group" >
							 <label for="A">商品编号</label><input name="id" type="text" class="form-control" id="A" />
						</div>
						<button type="submit" class="btn btn-default" >查找商品</button>
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
									商品编号
								</th>
								<th>
									商品名字
								</th>
								<th>
									商品产地
								</th>
								<th>
									商品数量
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
									${obj.name}
								</td>
								<td>
									${obj.suppos}
								</td>
								<td>
									${obj.num}
								</td>
								<td>
									<a href="${pageContext.request.contextPath}/DelStockServlet?id=${obj.id}">删除</a>|
									<a href="${pageContext.request.contextPath}/mans/upDateStockMan.jsp?id=${obj.id}&name=${obj.name}&suppos=${obj.suppos}">更改</a>
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