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

<link href="<c:url value="/resources/bootstrap-3.3.7-dist/css/bootstrap.css" />" rel="stylesheet">
<link href="<c:url value="/resources/font-awesome-4.7.0/css/font-awesome.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/normalize.css" />" rel="stylesheet"  type="text/css">
<link href="<c:url value="/resources/css/share.css" />" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css/productList.css" />" rel="stylesheet" type="text/css">



<title>Insert title here</title>
</head>
<body>

	<!-- 引入共同的頁首 -->
	<jsp:include page="/fragment/top.jsp" />
<!-- 	<h1>產品清單</h1> -->
	<div class="container-fluid top-add">
	<c:forEach varStatus="stVar" var="productBean" items="${products_DPP}">
		<div class="row col-md-10 col-md-offset-1 product-title">
			<div class="col-md-1">代號</div>
			<div class="col-md-2">產品</div>
			<div class="col-md-1">數量</div>
			<div class="col-md-2">價格</div>
			<div class="col-md-2">庫存</div>
			<div class="col-md-3">圖片預覽</div>
			<div class="col-md-1"></div>
			<br>
			<hr>
		</div><!--.product-title-->

		<div class="row col-md-10 col-md-offset-1 product-search">
	
			<div class="col-md-1">${productBean.id}</div>
			<div class="col-md-2">${productBean.productName}</div>
			<div class="col-md-1">${productBean.productNumber}</div>
			<div class="col-md-2">${productBean.price}</div>
			<div class="col-md-2">${productBean.stockNumber}</div>
			<div class="col-md-3 img-div">
				<img 
					src='${pageContext.servletContext.contextPath}/_00_init/getImage?id=${productBean.id}&type=product'>
			</div>
			<div class="col-md-1">
			<form id="myCoolForm" action="${pageContext.servletContext.contextPath}/productList/deleteProducts" 
				method="POST" enctype="multipart/form-data" onsubmit="return confirm('你確定要刪除嗎?');">
				<Input type='hidden' name='id' value='${productBean.id}' />
				<input type="submit" value="刪除" class="" >
			</form>
			</div>
			<br>
		</div><!--.product-search-->
		
	</c:forEach>
</div>
	<!-- jQuery library -->
	<script src="<c:url value="/resources/bootstrap-3.3.7-dist/js/jquery-3.2.1.min.js" />"></script>
	<!-- Latest compiled JavaScript -->
	<script src="<c:url value="/resources/bootstrap-3.3.7-dist/js/bootstrap.min.js" />"></script>
	
</body>
</html>