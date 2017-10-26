<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap.css">
<link rel="stylesheet"href="../font-awesome-4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="../css/normalize.css">

<link rel="stylesheet" type="text/css" href="../css/productList.css">

<title>Insert title here</title>
</head>
<body>

	<!-- 引入共同的頁首 -->
	<jsp:include page="/fragment/top.jsp" />
	<h1>產品清單</h1>
	<!-- <div id='somedivS'></div> -->
	<a href="productList/selectAllProducts">更新產品列表</a>

	<c:forEach varStatus="stVar" var="productBean" items="${products_DPP}">

		<div class="row">
			<div class="col-md-1">代號</div>
			<div class="col-md-1">產品</div>
			<div class="col-md-1">數量</div>
			<div class="col-md-1">價格</div>
			<div class="col-md-1">庫存數量</div>
			<div class="col-md-1">圖片預覽</div>
		</div>
		<div class="row">
			<div class="col-md-1">${productBean.id}</div>
			<div class="col-md-1">${productBean.productName}</div>
			<div class="col-md-1">${productBean.productNumber}</div>
			<div class="col-md-1">${productBean.price}</div>
			<div class="col-md-1">${productBean.stockNumber}</div>
			<div class="col-md-1">
				<img height='100' width='80'
					src='${pageContext.servletContext.contextPath}/_00_init/getImage?id=${productBean.id}&type=product'>
			</div>
		</div>

	</c:forEach>

	<!-- jQuery library -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<!-- Latest compiled JavaScript -->
	<script src="../bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</body>
</html>