<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
/* i=10;
alert(i);
function variableFun1(){
	 lv='local1';
	alert('variableFun1()'+gv+" "+lv);
}
function variableFun2(){
	alert('variableFun2()'+gv+" "+lv);	
}
var gv='JavaScript'; */

	 obj=document.frm;
function variableFun3(){
	obj.name.value='Test';
}
function variableFun4(){
	obj.name.value='Action';
}
</script>
</head>
<body>

<form action="" name="frm">
  <input type="text" name="name">
</form>
<button onclick="variableFun1()">Click1</button>
<button onclick="variableFun2()">Click2</button>
<button onclick="variableFun3()">Click3</button>
<button onclick="variableFun4()">Click4</button>

</body>
</html>








