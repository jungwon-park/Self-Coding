<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
   var httpRequest;
   function getXmlHttpRequest(){
	  if(window.ActiveXObject){
		  try{
			  return new ActiveXObject("Msxml2.XMLHTTP");
		  }catch(e){
			  alert('error');
		  }
		  
	  }else if(window.XMLHttpRequest){
		  try{
			  return new XMLHttpRequest();
		  }catch(e){
			  alert('error');
		  }
	  }else{
		 return null; 
	  }
   } 
   function viewFun(){//CALLBACK
	   if(httpRequest.readyState==4 && httpRequest.status==200){
		   var sp=document.getElementById("sp");
		   sp.innerHTML=(httpRequest.responseText);
	   }   
   }
   function load(url){
	   httpRequest=getXmlHttpRequest();//객체얻기
	   httpRequest.onreadystatechange=viewFun;
	   httpRequest.open('GET',url,true);
	   httpRequest.send(null);
	   console.log(httpRequest);
   }
</script>
</head>
<body>
<button onclick="load('data1.jsp')">Click1</button>
<button onclick="load('data2.jsp')">Click2</button>
<button onclick="load('data3.jsp')">Click3</button>
<button onclick="load('data4.jsp')">Click4</button>
<br>
<span id="sp"></span>
</body>
</html>








