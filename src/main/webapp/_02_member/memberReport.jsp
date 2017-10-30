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

<link
	href="<c:url value="/resources/bootstrap-3.3.7-dist/css/bootstrap.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/resources/font-awesome-4.7.0/css/font-awesome.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/normalize.css" />"
	rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css/memberReport.css" />"
	rel="stylesheet" type="text/css">


<script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<!-- 引入共同的頁首 -->
	<div style="display: flex; flex-direction: column;">
	<jsp:include page="/fragment/top.jsp" />
	
	<div class="centerbox">
		<ul class="nav nav-tabs">
			<li role="presentation"><a href="reportList.jsp">Home</a></li>
			<li role="presentation"><a id="show1" href="#">2016年WIME男女會員成長圖</a></li>
			<li role="presentation"><a id="show2" href="#">2016年銷售數量圖</a></li>
			<li role="presentation"><a id="show3" href="#">2016年營收曲線圖</a></li>
			<li role="presentation"><a id="show4" href="#">2016年總營收圓餅圖</a></li>

		</ul>

		<h1 id="title1">2016年WIME男女會員成長圖</h1>
		<div id="memberDiv" style="width: 100%; height: 400px;"></div>

		<h1 id="title2">2016年銷售數量圖</h1>
		<div id="memberDiv2" style="width: 100%; height: 400px;"></div>

		<h1 id="title3">2016年營收曲線圖</h1>
		<div id="memberDiv3" style="width: 100%; height: 400px;"></div>


		<h1 id="title4">2016年總營收圓餅圖</h1>
		<div id="memberDiv4" style="width: 100%; height: 400px;"></div>
	</div>
	</div>
	<!-- jQuery library -->
	<script
		src="<c:url value="/resources/bootstrap-3.3.7-dist/js/jquery-3.2.1.min.js" />"></script>
	<!-- Latest compiled JavaScript -->
	<script
		src="<c:url value="/resources/bootstrap-3.3.7-dist/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/resources/js/memberReport.js" />"></script>


</body>
</html>