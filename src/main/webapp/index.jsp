<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
	<h1>Hello World!</h1>
	<c:if test="${not empty param.name}">
		<p>Name: ${param.name}</p>
	</c:if>
<<<<<<< HEAD
	<a href="_02_member/reportList.jsp">2016年會員成長報表</a><br>
	<a href="productList/selectAllProducts">管理系統</a>

=======
	<a href="_02_member/reportList.jsp">2016年度報表報表</a><br>
	<a href="_01_product/productList.jsp">管理系統</a>
>>>>>>> 357303dee82b766d694e4a18da3a6364a1532343
</body>
</html>
