<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
   
	   //document.getElementById("id").type='checkbox';
	   //alert(document.getElementById("id"));
/*    var gv='Oracle';  
   var obj=document.getElementById("id");
   function doFun(){
	   alert('gv='+gv+' obj='+obj);
   } */
   function init(){
	    obj=document.frm;
	   alert(obj);
   }
   function action1(){
	   obj.name.value='Spring';
	   
   }
   function action2(){
	   obj.name.value='Jsp';	   
   }
</script>

</head>
<body onload="init()">

   <!-- <input type="text" name="name" id="id" onclick="doFun()"> -->
   
   <form action="" name="frm">
       <input type="text" name="name" id="id">
   </form>
   <button onclick="action1()">Click1</button>
   <button onclick="action2()">Click2</button>
   
</body>
</html>



