<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function  sumProcess(obj){
    var result=0;
    for(var i=0;i<arguments.length;i++){
    	if(isNaN(arguments[i])){
    		//throw new Error('지정한 값이 숫자가 아니다'+arguments[i]);
    		continue;
    	}
    	result+=(arguments[i]);
    }	      
    return result;
  }

  //var rs=sumProcess(10,'이십삼',30);
  //alert(rs);
  
var valueCheck= function(){
	var obj = document.frm;
	if(obj.year.value && isNaN(obj.year.value) || isNaN(obj.month.value) || isNaN(obj.day.value)){
		alert("숫자만 가능");
		obj.year.value='';
		obj.month.value='';
		obj.day.value='';
		obj.year.focus();
		return false;
	}else if(!obj.year.value){
		alert("write");
		return false;
	}
	obj.submit();
}
  
</script>
</head>
<body>
<button onclick="sumprocess(10,'이십삼',30)" >click1</button>
<form action="script11Result.jsp" name="frm">
	<h3>생년월일</h3>
	<input type = "text" name="year">
	<input type = "text" name="month">
	<input type = "text" name="day">
	<input type = "button" value="Send" onclick="valueCheck()">
</form>
</body>
</html>