<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="/web/javaScript/httpRequest.js"></script>
<script type="text/javascript">
  function load(url,param){
	  sendRequst(url,param,view,'POST');	  
  }
  function view(){
	  if(httpRequest.readyState==4&&httpRequest.status==200)
	  var json=(JSON.parse(httpRequest.responseText));
	  var ul=document.getElementById("uu");
	  var temp="";
	  for(var i in json){
		  for(var j in json[i]){
			  temp+="<li>"+j+":"+json[i][j]+"</li>"
		  }//for
	  }//for
	  ul.innerHTML=temp;
  }
</script>
</head>
<body>

<button onclick="load('/web/javaScript/basic2/data1.jsp','job=1.jpg')">Click1</button>
<button onclick="load('/web/javaScript/basic2/data1.jsp','job=2.jpg')">Click2</button>
<button onclick="load('/web/javaScript/basic3/json.txt','')">Click3</button>
<br>
<ul id="uu">

</ul>



</body>
</html>









