<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
var gv = "JavaScript";
//var i = 10;
//alert(i);
/* function vari1(){
	lv= 'local1';
	alert("vari1()"+gv+" "+lv);
}
function vari2(){
	alert("vari2()"+gv+" "+lv);
} */
function vari3(){
	var obj = document.frm;
	obj.name.value = 'test';
} 
function vari4(){
	obj.name.value = 'action';
}
</script>
</head>
<body>
<form action="" name="frm">
	<input type = "text" name = "name">
</form>
<button onclick="vari1()">click1</button>
<button onclick="vari2()">click2</button>
<button onclick="vari3()">click3</button>
<button onclick="vari4()">click4</button>
</body>
</html>