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
		<img src="<c:url value="/resources/images/catlogo2.png"/>"> 
		
		<!--title-nav-container-->
		<div class="title-nav-container">
		<font class="title-backstage">後台管理系統</font>
			
		<nav class="navbar navbar-default">
			<div class="container-fluid">
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
					<!-- 首頁 -->
					<li class="active"><a
						href="${pageContext.servletContext.contextPath}/index.jsp">首頁
							<span class="sr-only">(current)</span>
					</a></li>
					<!-- 產品清單 -->
					<li><a
						href="${pageContext.servletContext.contextPath}/productList/selectAllProducts">產品清單</a></li>
					<!-- 新增產品 -->
					<li><a
						href="${pageContext.servletContext.contextPath}/_01_product/productAdd.jsp">新增產品</a></li>
					<!-- 年度報表 -->	
						<li class="dropdown">
				          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">年度報表<span class="caret"></span></a>
				         	<ul class="dropdown-menu" >
				            <li><a href="${pageContext.servletContext.contextPath}/_02_member/memberReport.jsp">2016年年度報表</a></li>
				            <li><a href="${pageContext.servletContext.contextPath}/_02_member/memberReport.jsp">2015年年度報表</a></li>
				          </ul>
				        </li>
				</ul>
				<ul class="navbar-right" style=" list-style: none;">
					<li>
						<div class="flipkart-navbar-search smallsearch col-sm-12 col-xs-12">
							<div class="row">
								<input class="flipkart-navbar-input col-xs-12 form-control" type=""
									placeholder="Search" name="">
								<button class="flipkart-navbar-button col-xs-3">
									<i class="fa fa-search fa-2x" aria-hidden="true"></i>
								</button>
							</div>
						</div>
					</li>
				</ul><!-- /.navbar-right -->
			</div><!-- /.navbar-collapse -->
		</div><!-- /.container-fluid --> 
		</nav>
		</div><!-- /.title-nav-container-->
	</div><!-- /.nav-container-->

	<!-- jQuery library -->
<!-- 	<script -->
<%-- 		src="<c:url value="/resources/bootstrap-3.3.7-dist/js/jquery-3.2.1.min.js" />" type="text/javascript"></script> --%>
	<!-- Latest compiled JavaScript -->
<!-- 	<script -->
<%-- 		src="<c:url value="/resources/bootstrap-3.3.7-dist/js/bootstrap.min.js" />" type="text/javascript"></script> --%>
</body>
</html>