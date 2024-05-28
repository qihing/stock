<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta charset="utf-8"> 
	<title>管理宿舍界面</title>
<link href="${pageContext.request.contextPath}/js/css/bootstrap.min.css" rel="stylesheet">
 

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="${pageContext.request.contextPath}/js/js/bootstrap.min.js"></script>
</head>
<body>

<jsp:include page="/menu/manmenu.jsp" flush="true" >

<jsp:param name="A1" value="active"/>
</jsp:include>

<h3> ${adminaaa}</h3>


</body>
</html>