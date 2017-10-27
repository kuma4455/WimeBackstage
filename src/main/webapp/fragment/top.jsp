<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="<c:url value="/resources/bootstrap-3.3.7-dist/css/bootstrap.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/resources/font-awesome-4.7.0/css/font-awesome.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/normalize.css" />"
	rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css/top.css" />" rel="stylesheet"
	type="text/css">
<title>Insert title here</title>
</head>
<body>
	<!--nav-container-->
	<div class="nav-container">
		<img src="<c:url value="/resources/images/catlogo.png"/>">
		Wime後台管理系統
		<nav class="navbar navbar-default">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			<a class="navbar-brand" href="#"></a>
			</div>
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a
						href="${pageContext.servletContext.contextPath}/index.jsp">首頁
							<span class="sr-only">(current)</span>
					</a></li>
					<li><a
						href="${pageContext.servletContext.contextPath}/productList/selectAllProducts">產品清單</a></li>
					<li><a
						href="${pageContext.servletContext.contextPath}/_01_product/productAdd.jsp">新增產品</a></li>
				</ul>

			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid --> </nav>
	</div>
	<!-- /.nav-container-->
	<!-- jQuery library -->
	<script
		src="<c:url value="/resources/bootstrap-3.3.7-dist/js/jquery-3.2.1.min.js" />"></script>
	<!-- Latest compiled JavaScript -->
	<script
		src="<c:url value="/resources/bootstrap-3.3.7-dist/js/bootstrap.min.js" />"></script>
</body>
</html>