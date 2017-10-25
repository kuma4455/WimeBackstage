window.onload = function(){
	
	var productName = document.getElementById("productName")
	var productNumber = document.getElementById("productNumber")
	var price = document.getElementById("price")
	var productDesc = document.getElementById("productDesc")
	var stockNumber = document.getElementById("stockNumber")
	var imageName = document.getElementById("imageName")
	var software = document.getElementById("software")
	var softDesc = document.getElementById("softDesc")
	var productImage = document.getElementById("productImage")
	
	var xhr = new XMLHttpRequest();
	xhr.open("POST","selectAllProducts",true);
	xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
//	若前端的傳回的參數，與後端ProductBean的性質名稱相同，Spring-MVC啟動自動裝箱機制。
	xhr.send("productName="+ productName +
			"productNumber="+ productNumber +
			"price="+ price +
			"productDesc="+ productDesc +
			"stockNumber="+ stockNumber +
			"imageName="+ imageName +
			"software="+ software +
			"softDesc="+ softDesc +
			"productImage="+ productImage);
	
	xhr.onreadyststechange = function(){
		// 伺服器請求完成
		if(xhr.readyState == 4 && xhr.status == 200){
//			result = JSON.parse(xhr.response);
		}
	}
}