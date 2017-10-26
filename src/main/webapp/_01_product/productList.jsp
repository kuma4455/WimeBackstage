<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"  %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script>
// window.onload = function(){

// 	var xhr = new XMLHttpRequest();
// 	xhr.open("GET","../productList/selectAllProducts",true);
// 	xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
//	若前端的傳回的參數，與後端ProductBean的性質名稱相同，Spring-MVC啟動自動裝箱機制。
// 	xhr.send();
//	
// 	xhr.onreadyststechange = function(){
// 		伺服器請求完成
// 		if (xhr.readyState == 4 && xhr.status == 200) {
// 			console.log("hello123456");
// 					var content = "<table border='1'>";
// 					var products = JSON.parse(xhr.responseText);
// 					for(var i=0; i < products.length; i++){
// 						content += "<tr><td>" + products[i].productName + "</td>" + 
// 						               "<td>" + products[i].productNumber + "</td>" +
// 						               "<td>" + products[i].price + "</td>" +
// 						               "<td>" + products[i].productDesc + "</td>" +
// 						               "<td>" + products[i].stockNumber + "</td>" +
// 						               "<td>" + products[i].imageName + "</td>" +
// 						               "<td>" + products[i].software + "</td>" +
// 						               "<td>" + products[i].softDesc + "</td>" ;
// 						               "<td><img  width='40' height='48' " +   
// 						               " src='../../ch00/util/GetImage?no=" + products[i].id + "'></td>";
//
// 						           "</tr>";    
// 					}
// 					content += "</table>";
// 					var divs = document.getElementById("somedivS");
// 					divs.innerHTML = content;
// 				}
// 	}
// }

</script>
<title>Insert title here</title>
</head>
<body>

<!-- 引入共同的頁首 -->
<jsp:include page="/fragment/top.jsp" />
	<h1>產品清單</h1>
<!-- <div id='somedivS'></div> -->
<a href="productList/selectAllProducts">更新產品列表</a>
<c:forEach varStatus="stVar"  var="productBean"  items="${products_DPP}" >
<tr>
	<td>${productBean.productName}</td>
	<td>${productBean.productNumber}</td>
	<td>${productBean.price}</td>
	<td>${productBean.productDesc}</td>
	<td>${productBean.stockNumber}</td>
	<td>${productBean.imageName}</td>
	<td>${productBean.software}</td>
	<td><img height='100' width='80' 
         src='${pageContext.servletContext.contextPath}/_00_init/getImage?id=${productBean.id}&type=product'></td>
</tr>

<div>${productBean.softDescS}</div>	
</c:forEach> 
</body>
</html>