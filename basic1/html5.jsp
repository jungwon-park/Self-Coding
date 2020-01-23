<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
 function increment(obj){
	obj.value = obj.value+1;
} 
function setTimeEx(){
	var dv=document.getElementById("dv");
	var m1=document.getElementById("m1")
	sid=setInterval(function(){
		var date = new Date();
		dv.innerHTML = date.toLocaleTimeString();
		m1.value +=m1.value;
	},1000); 
}
/* var action = function(){
	alert('test');
} */
function clearTimeEx(){
	//console.log(sid);
	clearInterval(sid);
}
function timeEx(){
	var clock=document.getElementById("clock");
	var now = new Date();
	clock.innerHTML = "<FONT COLOR = RED>"+ now.getFullYear()+"/"+(now.getMonth()+1)+"/"+now.getDate()+"/"+now.getHours()+"/"+now.getMinutes()+"/"+now.getSeconds()+"</FONT>";
	setTimeout("timeEx()",1000)
}
</script>
</head>	
<body>
<progress id = "p1" max="10" value="2" onclick="increment(this)"></progress>
<progress id = "p2" max="10" value="5" onclick="increment(this)"></progress>
<progress id = "p3" max="10" value="8" onclick="increment(this)"></progress><br>

<meter value ="0.1" id ="m1" max="1"></meter>
<meter value ="0.5" id ="m2" max="1"></meter>
<meter value ="0.85" id ="m3" max="1"></meter><br>

<input type="button" value = "click1" onclick="setTimeEx()">
<input type="button" value = "click2" onclick="clearTimeEx()">
<input type="button" value = "click3" onclick="timeEx()">
<br>
<div id = "dv"> </div>
<span id = "clock"></span>

</body>
</html>