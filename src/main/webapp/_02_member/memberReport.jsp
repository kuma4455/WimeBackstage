<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h1>2016年WIME男女會員成長圖</h1>
	<div id="memberDiv" style="width: 80%; height: 400px;"></div>
	<h1>2016年銷售數量圖</h1>
	<div id="memberDiv2" style="width: 80%; height: 400px;"></div>
	<h1>2016年營收曲線圖</h1>
	<div id="memberDiv3" style="width: 80%; height: 400px;"></div>
	<h1>2016年總營收圓餅圖</h1>
	<div id="memberDiv4" style="width: 80%; height: 400px;"></div>
	<script>
		var xhr = new XMLHttpRequest();
		xhr.open("POST", "report/member?year=2016", true);
		// 				xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		xhr.send();
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				console.log(xhr.responseText);
				var result = JSON.parse(xhr.responseText);

				var Jan_m = result.Jan_m;
				var Feb_m = result.Feb_m;
				var Mar_m = result.Mar_m;
				var Apr_m = result.Apr_m;
				var May_m = result.May_m;
				var Jun_m = result.Jun_m;
				var Jul_m = result.Jul_m;
				var Aug_m = result.Aug_m;
				var Sep_m = result.Sep_m;
				var Oct_m = result.Oct_m;
				var Nov_m = result.Nov_m;
				var Dec_m = result.Dec_m;

				var Jan_f = result.Jan_f;
				var Feb_f = result.Feb_f;
				var Mar_f = result.Mar_f;
				var Apr_f = result.Apr_f;
				var May_f = result.May_f;
				var Jun_f = result.Jun_f;
				var Jul_f = result.Jul_f;
				var Aug_f = result.Aug_f;
				var Sep_f = result.Sep_f;
				var Oct_f = result.Oct_f;
				var Nov_f = result.Nov_f;
				var Dec_f = result.Dec_f;

				console.log(Oct_f);

				var trace1 = {
					x : [ 'Jen', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul',
							'Aug', 'Sep', 'Oct', 'Nov', 'Dec' ],
					y : [ Jan_m, Feb_m, Mar_m, Apr_m, May_m, Jun_m, Jul_m,
							Aug_m, Sep_m, Oct_m, Nov_m, Dec_m ],
					name : '男',
					type : 'bar'
				};

				var trace2 = {
					x : [ 'Jen', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul',
							'Aug', 'Sep', 'Oct', 'Nov', 'Dec' ],
					y : [ Jan_f, Feb_f, Mar_f, Apr_f, May_f, Jun_f, Jul_f,
							Aug_f, Sep_f, Oct_f, Nov_f, Dec_f ],
					name : '女',
					type : 'bar'
				};

				var data = [ trace1, trace2 ];
				var layout = {
					barmode : 'group'
				};

				Plotly.newPlot('memberDiv', data, layout);

			}
		}

		var xhr2 = new XMLHttpRequest();
		xhr2.open("POST", "report/amount", true);
		// 				xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		xhr2.send();
		xhr2.onreadystatechange = function() {
			if (xhr2.readyState == 4 && xhr2.status == 200) {
				console.log(xhr2.responseText);
				var result = JSON.parse(xhr2.responseText);

				var product_1 = result.product_1;
				var product_2 = result.product_2;
				var product_3 = result.product_3;
				var product_4 = result.product_4;
				var product_5 = result.product_5;
				var product_6 = result.product_6;
				var product_7 = result.product_7;
				var product_8 = result.product_8;
				var product_9 = result.product_9;
				var product_10 = result.product_10;
				var product_11 = result.product_11;
				var product_12 = result.product_12;
				var product_13 = result.product_13;
				var product_14 = result.product_14;
				var product_15 = result.product_15;

				console.log(product_15);

				var trace1 = {
					x : [ '陪伴機器人', '自動飼料機', '寵物沙發床', '抓板溜滑梯', '木製貓跳台', '貓咪九宮格',
							'貓咪玩具鼠', '雙層貓砂盆', '迷你鐵貓籠', '小貓蔬菜糧', '綜合貓糧食',
							'寵物攜帶包', '貓咪維他命', '發光玩具球', '金槍魚貓糧' ],
					y : [ product_1, product_2, product_3, product_4,
							product_5, product_6, product_7, product_8,
							product_9, product_10, product_11, product_12,
							product_13, product_14, product_15 ],
					name : '全部產品',
					type : 'bar'
				};

				var data = [ trace1 ];
				var layout = {
					barmode : 'group'
				};

				Plotly.newPlot('memberDiv2', data, layout);

			}
		}
		var xhr3 = new XMLHttpRequest();
		xhr3.open("POST", "report/income?year=2016", true);
		// 				xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		xhr3.send();
		xhr3.onreadystatechange = function() {
			if (xhr3.readyState == 4 && xhr3.status == 200) {
				console.log('營收曲線圖');
				console.log(xhr3.responseText);
				var result = JSON.parse(xhr3.responseText);

				var Jan_m = result.Jan_m;
				var Feb_m = result.Feb_m;
				var Mar_m = result.Mar_m;
				var Apr_m = result.Apr_m;
				var May_m = result.May_m;
				var Jun_m = result.Jun_m;
				var Jul_m = result.Jul_m;
				var Aug_m = result.Aug_m;
				var Sep_m = result.Sep_m;
				var Oct_m = result.Oct_m;
				var Nov_m = result.Nov_m;
				var Dec_m = result.Dec_m;

				var X_Date = [ 'Jen', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul',
						'Aug', 'Sep', 'Oct', 'Nov', 'Dec' ];

				var Y_Date = [ Jan_m, Feb_m, Mar_m, Apr_m, May_m, Jun_m, Jul_m,
						Aug_m, Sep_m, Oct_m, Nov_m, Dec_m ];

				var data = [ {
					x : X_Date,
					y : Y_Date,
					type : 'scatter'
				} ];

				Plotly.newPlot('memberDiv3', data);

			}
		}
		var xhr4 = new XMLHttpRequest();
		xhr4.open("POST", "report/income?year=2016", true);
		// 				xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		xhr4.send();
		xhr4.onreadystatechange = function() {
			if (xhr4.readyState == 4 && xhr4.status == 200) {
				console.log('123');
				console.log(xhr4.responseText);
				var result = JSON.parse(xhr4.responseText);

				var Jan_m = result.Jan_m;
				var Feb_m = result.Feb_m;
				var Mar_m = result.Mar_m;
				var Apr_m = result.Apr_m;
				var May_m = result.May_m;
				var Jun_m = result.Jun_m;
				var Jul_m = result.Jul_m;
				var Aug_m = result.Aug_m;
				var Sep_m = result.Sep_m;
				var Oct_m = result.Oct_m;
				var Nov_m = result.Nov_m;
				var Dec_m = result.Dec_m;

				var X_Date = [ 'Jen', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul',
						'Aug', 'Sep', 'Oct', 'Nov', 'Dec' ];

				var Y_Date = [ Jan_m, Feb_m, Mar_m, Apr_m, May_m, Jun_m, Jul_m,
						Aug_m, Sep_m, Oct_m, Nov_m, Dec_m ];

				var data = [ {
					values : Y_Date,
					labels : X_Date,
					type : 'pie'
				} ];

				var layout = {
					height : 400,
					width : 500
				};

				Plotly.newPlot('memberDiv4', data, layout);

			}
		}
	</script>
</body>
</html>