<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>productList</title>
</head>
<body>
<!-- 引入共同的頁首 -->
	<jsp:include page="/fragment/top.jsp" />

	<form action="product/insertProduct" method="POST" enctype="multipart/form-data">
		產品名稱<input type="text" name="productName"><br>
		產品數量<input type="text" name="productNumber"><br>
		產品價格<input type="text" name="price"><br>
		產品說明<input type="text" name="productDesc"><br>
		庫存數量<input type="text" name="stockNumber"><br>
		圖片名稱<input type="text" name="imageName"><br>
		軟體下載網址<input type="text" name="software"><br>
		軟體說明<input type="text" name="softDesc"><br>
		產品圖片<input type="file" name="productImage"><br>
		<input type="submit" value="新增產品">
	</form>
</body>
</html>