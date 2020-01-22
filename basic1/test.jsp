<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript"> 
var array = ["1-1,1-2,1-3","2-1,2-2,2-3","3-1,3-2,3-3"];
function allcheck(obj){
	check(obj.checked);
}
function check(state){
	var nodeList = document.getElementsByName("number");
	for (var i = 0; i < nodeList.length; i++) {
		nodeList[i].checked = state;
	}
}
function checkPass(){
	var nodeList = document.getElementsByName("number");
	var state = false;
	for (var i = 0; i < nodeList.length; i++) {
		if(!nodeList[i].checked) 
			state=true;
	}if(state)
	
}

</script>
</head>
<body>
	<fieldset name = "mytest" style = "width:70%">
	<input type ="checkbox" name = "all" value="all" onclick="allcheck()">전부다아 
	<input type ="checkbox" name = "number" value="1" id ="one" onclick="numbers(this,0)">1 
	<input type ="checkbox" name = "number" value="2" id ="two" onclick="numbers(this,1)">2 
	<input type ="checkbox" name = "number" value="3" id ="three" onclick="numbers(this,2)">3 
	</fieldset>
</body>
</html>