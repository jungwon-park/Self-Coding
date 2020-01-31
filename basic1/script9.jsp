<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	/*function doFun(){
		document.getElementById("id").type='checkbox';
	} */
	//obj=document.getElementById("id");
	/* function init(){
		//obj=document.getElementById("id");
		obj=document.frm;
		//alert(obj);
	} */
	/* function action(){
		obj.name.value="action name";
	}
	function action2(){
		obj.name.value="action2 name";
	} */
	function news(String x){
		obj = document.getElementById ("id").alert(x);
	}
</script>
</head>
<body onload = "init()">
	<!-- <input type="text" name = "name" id="id" onclick="doFun()"> -->
	
<form action="" name="frm">
	<input type ="text" name = "name" id="id">
</form>
<!-- 
<button onclick="action()">click1</button>
<button onclick="action2()">click2</button> -->
<button onclick="news('hi') id="id">click3</button>
</body>
</html>