<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="<c:url value="/resources/bootstrap-3.3.7-dist/css/bootstrap.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/font-awesome-4.7.0/css/font-awesome.min.css" />"rel="stylesheet">
	<title>Home</title>
</head>
<body>
<!-- 引入共同的頁首 -->
	<jsp:include page="/fragment/top.jsp" />
	<h1 style="text-align: center; padding-top: 4em;">歡迎來到後台管理系統</h1>
<!-- 	<a href="_02_member/reportList.jsp">2016年會員成長報表</a><br> -->
<!-- 	<a href="productList/selectAllProducts">管理系統</a> -->

	<!-- jQuery library -->
	<script src="<c:url value="/resources/bootstrap-3.3.7-dist/js/jquery-3.2.1.min.js" />" type="text/javascript"></script>
	<!-- Latest compiled JavaScript -->
	<script src="<c:url value="/resources/bootstrap-3.3.7-dist/js/bootstrap.min.js" />" type="text/javascript"></script>
</body>
</html>
