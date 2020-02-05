<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html >
<html>
<head><!-- Ajax -->
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
   function show(){
	   var span=document.getElementById("sp");
	   span.innerHTML="<H1>"+arguments.length+"</H1>";
	   for(var i in arguments){
		   span.innerHTML+="<h3>"+arguments[i]+"</h3>";
	   }
	   
   }
   function showAction(obj){
	   alert('showAction obj');
   }
   function showAction(){
	   alert('showAction');
   }
   var action=function(){
	   alert('action2');
   }
   var action=function(){
	   alert('action1');
   }
   function functionA(first,second){
	   //alert('arguments.length='+arguments.length+' functionA='+functionA.length)
	   if(arguments.length!=functionA.length)
		   throw new Error('인수가 다르다: ' +arguments.length);
	   
	   alert(first);
   }
</script>
</head>
<body>
  <input type="button" name="btn1" value="Click1" onclick="show()">
  <input type="button" name="btn2" value="Click2" onclick="show(10)">
  <input type="button" name="btn3" value="Click3" onclick="show(10,20)">
  <input type="button" name="btn4" value="Click4" onclick="show(10,20,30)">
  <br>
  <input type="button" name="btn5" value="Click5" onclick="showAction()">
  <input type="button" name="btn6" value="Click6" onclick="showAction(10)">
  <input type="button" name="btn7" value="Click7" onclick="action()">
  <input type="button" name="btn8" value="Click8" onclick="action()">
  <br>
  <input type="button" name="btn9" value="Click9" onclick="functionA(10)">
  <input type="button" name="btn10" value="Click10" onclick="functionA(10,20)">
  
  
  
  <span id="sp"></span>


</body>
</html>







