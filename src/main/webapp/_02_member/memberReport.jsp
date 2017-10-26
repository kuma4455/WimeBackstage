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
				console.log('123');
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
		xhr2.open("POST", "report/member?year=2016", true);
		// 				xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		xhr2.send();
		xhr2.onreadystatechange = function() {
			if (xhr2.readyState == 4 && xhr2.status == 200) {
				console.log('123');
				console.log(xhr2.responseText);
				var result = JSON.parse(xhr2.responseText);

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

				Plotly.newPlot('memberDiv2', data, layout);

			}
		}
		var xhr3 = new XMLHttpRequest();
		xhr3.open("POST", "report/member?year=2016", true);
		// 				xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		xhr3.send();
		xhr3.onreadystatechange = function() {
			if (xhr3.readyState == 4 && xhr3.status == 200) {
				console.log('123');
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

				Plotly.newPlot('memberDiv3', data, layout);

			}
		}
		var xhr4 = new XMLHttpRequest();
		xhr4.open("POST", "report/member?year=2016", true);
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

				Plotly.newPlot('memberDiv4', data, layout);

			}
		}
	</script>
</body>
</html>