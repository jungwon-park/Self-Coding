<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function show(){
	var span = document.getElementById("sp");
	span.innerHTML="<H1>"+arguments.length+"</H1>";
	for ( var i in arguments) {
		span.innerHTML += "<h3>"+arguments[i]+"</h3>";
	}
}
function showAction(){
	alert('showAction');
}
function showAction(obj){
	alert('showaction obj')
}
var action = function(){
	alert('action2');
}
var action = function(){
	alert('action1');
}
var function_a = function(){
	alert('test');
}
var function_a = function(first){
	alert('arguments.length='+arguments.length+'function_a='+function_a.length);
	alert(first);
}
</script>
</head>
<body>
<input type="button"  name = "btn1" value="click1" onclick="show()">
<input type="button" name = "btn2" value="click2" onclick="show(10)">
<input type="button" name = "btn3" value="click3" onclick="show(1.2,3.4)">
<input type="button" name = "btn4" value="click4" onclick="show('god','as','asd')">
<br>
<input type="button" name = "btn5" value="click5" onclick="showAction()">
<input type="button" name = "btn6" value="click6" onclick="showAction('god')">
<input type="button" name = "btn7" value="click7" onclick="action()">				<!-- 마지막  같은이름 함수값에 덮어짐 -->
<input type="button" name = "btn8" value="click8" onclick="action()">
<br>
<input type="button" name = "btn9" 	value="click9" onclick="function_a()">
<input type="button" name = "btn10" value="click10" onclick="function_a(5)">

<span id="sp"></span>
</body>
</html>