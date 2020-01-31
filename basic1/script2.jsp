<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function show(){
	var v = document.getElementById("sp");
	console.log(v);
	alert(v.innerHTML);
	alert(document.getElementById("sp").innerHTML);
}
function changeFun1(){
	var obj = document.frm;
	alert(obj.name.value);
}
function changeFun2(){
	var obj = document.frm;
	alert(obj.age.value);
}
</script>
</head>
<body onload="show()">

<!-- <h1>javascript study start</h1>
<script type="text/javascript">
alert("test");
</script>
<h1>javascript study end</h1> -->

<!-- <span id ="sp">spantest</span> -->

<form action = "" name="frm">
<input type = "text" name="name"><br>
<input type = "text" name="age"><br>
<input type = "button" value="CName" onclick="changeFun1()"><br>
<input type = "button" value="AName" onclick="changeFun2()"><br>
</form>
</body>
</html>