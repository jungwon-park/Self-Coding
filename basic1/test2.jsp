<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function setime(){
	var d = document.getElementById("tt");
	s = setInterval(function(){
		var date = new Date();
		d.innerHTML = date.toLocaleTimeString();
	},1000);
}
function time(){
	var t = document.getElementById("tt");
	var nowt = new Date();
	t.innerHTML= now.getFullYear();
	setime("time()",1000)
}
</script>
</head>
<body>
	<input type="button" value="1" >
	<input type="button" value="2" >

<div id = "tt"></div>
<span id = "stt"></span>
</body>
</html>