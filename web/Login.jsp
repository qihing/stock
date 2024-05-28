<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta charset="utf-8">
		<title>仓库管理系统</title>
	<!-- 新 Bootstrap 核心 CSS 文件 -->
<link href="${pageContext.request.contextPath}/js/css/bootstrap.min.css" rel="stylesheet">
 

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="${pageContext.request.contextPath}/js/js/bootstrap.min.js"></script>
</head>
<body>
	<!-- 登录界面主要有两个框框，两个标签  和一个界面 -->
		<!-- 使用一个另一种技术进行布局 -->
		
		<!-- 流容器 创建一个容器 style="background-color: red;"-->
		<div class="log-back"  > 
			<div class="container  ">
			<!-- 创建一行 -->
				<!-- 分成三列 -->

				<div class="row col-lg-4"></div>
				
				<!-- 将其放在中间 -->
				<div class="row col-lg-4 " style="margin-top:120px;">
					
					<div class="row " style="margin-top:20px;">
						<h3 class="text-center text-info">仓库管理系统登录</h3>
						
					</div>
					<!-- 提交表单 -->
						<form role="form"  action="${pageContext.request.contextPath}/Login" method="post" onSubmit="return toVaild()">
					
					<div class="row " style="margin-top:20px;">
						<div class="col-lg-2 " >账号</div>
						<div class="col-lg-10"><input type="text" id="name" class="form-control"  placeholder="请输入账号" name="account" /></div>
					</div>
					
					<div class="row " style="margin-top:20px;">
						<div class="col-lg-2">密码</div>
						<div class="col-lg-10"><input type="text" id="password" class="form-control"  placeholder="请输入密码" name="password" /></div>
					</div>
					
					<div class="row " style="margin-top:20px;">
					<div class="col-lg-5">
					
					</div>
					<div class="col-lg-2"> 	<p class="help-block">	${admin} <%request.getSession().removeAttribute("admin"); %></p></div>
					<div class="col-lg-5"> <a href="Register.jsp">注册界面</a></div>
					</div>
					<div class="row " style="margin-top:20px;">
						<div class="col-lg-2">
					
						
								
					
					</div>
						<div class="col-lg-5"> <button type="submit" class="btn btn-success">登录</button>
		</div>
						<div class="col-lg-5"><button type="submit" class="btn btn-success">重置</button></div>
					</div>
					
					</form>
					
					
				</div>
				
				
				<div class="row col-lg-4"></div>
				
				
				
			
			</div>
		</div>
	
		



</body>
<script language="javascript">
            function toVaild(){
                var val = document.getElementById("name").value;
                var val1 = document.getElementById("password").value;
           
                if(val=="" ){
                    alert("请输入账号");
                    return false;
                }
                else if(val1==""){
                    alert("请输入密码");
                   return false;               
                  }else{
                	   return true;
                   }
            }
     </script>
</html>