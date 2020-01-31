<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function showFunction(obj){
	   var img=document.getElementsByTagName("img");
	   if(typeof(obj)=='undefined'){
		   img[0].width=200;
		   img[0].height=200;
		   img[0].src='/newfile/image/1.jpg';		   
	   }
	   if(typeof(obj)=='object' && Array.isArray(obj)){
		   
		   var dv=document.getElementById("dv");
		   for(var i in obj){
			   dv.innerHTML+="<B>"+obj[i]+"</B>";
		   }
	   }
	   if(typeof(obj)=='function'){
		   obj();
	   }
}
</script>
</head>
<body>
<img alt="" src="/newfile/image/1.jpg" width="50" height="50" onmouseover="showFunction()">
<img alt="" src="/newfile/image/1.jpg" width="50" height="50" onmouseenter="showFunction()">
<img alt="" src="/newfile/image/2.jpg" width="50" height="50" onmouseover="showFunction([10,20,30])">
<img alt="" src="/newfile/image/3.jpg" width="50" height="50" onmouseover="showFunction(function(){alert('show')})">
<br>
<div id ="dv">
</div>
</body>
</html>