<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="<c:url value="/resources/bootstrap-3.3.7-dist/css/bootstrap.css" />" rel="stylesheet">
<link href="<c:url value="/resources/font-awesome-4.7.0/css/font-awesome.min.css" />"rel="stylesheet">
<link href="<c:url value="/resources/css/normalize.css" />"rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css/share.css" />" rel="stylesheet"type="text/css">
<link href="<c:url value="/resources/css/productAdd.css" />"rel="stylesheet" type="text/css">

<title>productList</title>
</head>
<body>
	<!-- 引入共同的頁首 -->
	<jsp:include page="/fragment/top.jsp" />
	
	<form action="productAdd/insertProduct" method="POST" enctype="multipart/form-data">
	
	<!-- article -->
	<div class="article">
	<!-- block-all -->
		<div class="block-all">
		
			<div class="product-name">
				<p class="title-gray">1.產品名稱:</p>
				<input type="text" name="productName" id="input1">
			</div>
			<div class="product-number">
				<p class="title-gray">2.產品數量:</p>
				<input type="text" name="productNumber" id="input2">
			</div>
			<div class="product-price">
				<p class="title-gray">3.產品價格:</p>
				<input type="text" name="price" id="input3">
			</div>
			<div class="product-desc">
				<p class="title-gray">4.產品說明:</p>
				<input type="text" name="productDesc" id="input4">
			</div>
			<div class="stock-number">
				<p class="title-gray">5.庫存數量:</p>
				<input type="text" name="stockNumber" id="input5">
			</div>
			<div class="image-name">
				<p class="title-gray">6.圖片名稱:</p>
				<input type="text" name="imageName" id="input6">
			</div>
<!-- 			<div class="software"> -->
<!-- 				<p class="title-gray">7.軟體網址:</p> -->
				<input type="hidden" name="software" id="input7">
<!-- 			</div> -->
<!-- 			<div class="soft-desc"> -->
<!-- 				<p class="title-gray">8.軟體說明:</p> -->
				<input type="hidden" name="softDesc" id="input8">
<!-- 			</div> -->
			<div class="product-image">
				<p class="title-gray">7.產品圖片:</p>
				<input type="file"name="productImage">
			</div>
			<div class="product-submit">
				<input type="submit" value="新增產品">
				<a style='margin-left: 20px;' onclick="printHelps()" href="#">小幫手</a>
				
			</div>
		</div>
		<!--/.block-all-->
	</div>
	<!--/.article-->
	
	</form>

	<!-- jQuery library -->
	<script src="<c:url value="/resources/bootstrap-3.3.7-dist/js/jquery-3.2.1.min.js" />" type="text/javascript"></script>
	<!-- Latest compiled JavaScript -->
	<script src="<c:url value="/resources/bootstrap-3.3.7-dist/js/bootstrap.min.js" />" type="text/javascript"></script>
	<!-- Latest compiled JavaScript -->
	<script src="<c:url value="/resources/js/productAdd.js" />"></script>
</body>
</html>