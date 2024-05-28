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
					<form role="form" action="${pageContext.request.contextPath}/UpdateStockServlet" method="post">
						<div class="form-group" >
							<input name="id" value="<%=request.getParameter("id")%>" type="hidden" class="form-control" id="A" />
						</div>
						<div class="form-group">
							 <label for="B">商品名字</label><input name="name" value="<%=request.getParameter("name")%>" type="text" class="form-control" id="B" />
						</div>
						<div class="form-group">
							 <label for="B">商品名字</label><input name="suppos" value="<%=request.getParameter("suppos")%>" type="text" class="form-control" id="B" />
						</div>
						<button type="submit" class="btn btn-default" >更改商品</button>${sta }<%request.getSession().removeAttribute("sta"); %>
					</form>
			
				</div>
				<div class="col-md-4 column">
				</div>
			</div>
			
		</div>
	</div>
</div>


</body>
</html>