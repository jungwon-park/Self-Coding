<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="/newfile/javaScript/script1.js" charset="UTF-8"></script>
</head>
<body>
	<p onclick="showData(1)">하나</p>
	<p onclick="showData(2)">둘</p>
	<p onclick="showData(3)">셋</p>
	
	<input type = "button" value="Click1" id= "btn1" ondblclick="btnService('1',this)">
	<input type = "button" value="Click2" id= "btn2" ondblclick="btnService('2',this)">
	<div id="dbtn1">test1</div>
	<div id="dbtn2"> test2</div>
	
	<input type ="button" value = "왼쪽" id = "좌" ondblclick="idservice('1',this)">
	<input type ="button" value = "오른쪽" id = "우" ondblclick="idservice('2',this)">
	<div id ="iid1">id1</div>
	<div id ="iid2">id2</div>
</body>
</html>