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
<jsp:param name="B" value="active"/>
</jsp:include>

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row clearfix">
				<div class="col-md-4 column">
				</div>
				<div class="col-md-4 column">
					<form role="form" action="${pageContext.request.contextPath}/AddUserServlet" method="post">
						<div class="form-group" >
							 <label for="A">账号</label><input name="account"type="text" class="form-control" id="A" />
						</div>
						<div class="form-group">
							 <label for="B">密码</label><input name="pwd" type="password" class="form-control" id="B" />
						</div>
						<button type="submit" class="btn btn-default" >增加账号</button>${sta }<%request.getSession().removeAttribute("sta"); %>
					</form>
					
					<form role="form" action="${pageContext.request.contextPath}/ShowUserServlet" method="post">
						<div class="form-group" >
							 <label for="A">账号</label><input name="account" type="text" class="form-control" id="A" />
						</div>
						<button type="submit" class="btn btn-default" >查找账号</button>
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
									账号
								</th>
								<th>
									密码
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
									${obj.account}
								</td>
								<td>
									${obj.pwd}
								</td>
								<td>
									<a href="${pageContext.request.contextPath}/DelUserServlet?account=${obj.account}">删除</a>
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