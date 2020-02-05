<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
    var hp=null;
   function getRequest(){
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
		   return  null;
	   }
   } 
   var VIEWVIEW=function(){
	   if(hp.readyState==4&& hp.status==200){
		   //alert(hp.responseText);
		   document.getElementById("dv").innerHTML=hp.responseText;
	   }
   }
   function action(url){
	   hp=getRequest();
	   hp.onreadystatechange=VIEWVIEW;
	   hp.open('GET',url,true);
	   hp.send(null);
	   
   }
   function message(){
	   if(hp.readyState==4 && hp.status==200){
		   var text=hp.responseText;
		   var json=JSON.parse(text);
		   //alert(json.empno+" "+json.sal+" "+json.ename);
		   
		   for(var i in json){
			   for(var j in json[i]){
				   //alert(json[i][j]);
				   alert(j+":"+json[i][j]);
			   }
		   }
	   }	   
   }
   function jsonFile(url){
	   hp=getRequest();
	   hp.onreadystatechange=message;
	   hp.open('GET',url,true);
	   hp.send(null);
   }
</script>
</head>
<body>
<button onclick="action('data5.jsp?no=1')">Click1</button>
<button onclick="action('data5.jsp?no=2')">Click2</button>
<button onclick="jsonFile('data6.jsp')">Click3</button>
<br>
<div id="dv"></div>

</body>
</html>









