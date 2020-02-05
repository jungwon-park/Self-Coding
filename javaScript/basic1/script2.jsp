<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
 //alert('JavaScript1');
 /*  function show(){
     var v=document.getElementById("sp");
	 console.log(v);
	 //alert(v.innerHTML);
	 alert(document.getElementById("sp").innerHTML);
 } */
 var obj=document.frm;
 function changeFun1(){
	 alert(obj.name.value);
 }
 function changeFun2(){
	
	 alert(obj.age.value);
 }
</script>
</head>
<body >
  <!-- <h1>JavaScript Study START</h1>
  <script type="text/javascript">
  alert('JavaScript2');  
  </script>
  <h1>JavaScript Study End</h1> -->
  <!-- <span id="sp">SpanTest</span> -->
  <form action="" name="frm">
    <input type="text" name="name"><br>
    <input type="text" name="age"><br>
    <input type="button" value="CName" onclick="changeFun1()">
    <input type="button" value="AName" onclick="changeFun2()">
        
    
  </form>
  
  
</body>
</html>





