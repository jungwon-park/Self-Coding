<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
   /* var showJSon=function(){
	   var obj=[{'name':'이수연','age':22,'address':'수원시'},
		        {'name':'김태훈','age':25,'address':'인천시'}];
	   
	   //console.log(obj[0].name+' '+obj[0]['name']);
	   
	   for(var i in obj){
		   for(var j in obj[i]){
		   console.log(j+":"+obj[i][j]);
			   
		   }
	   }
	   
   } */
   var array=[100,200,300];
   var json={'no':1,'name':'oop','addr':'seoul'};
   var temp=['no','name','addr'];
   
  for(var i=0;i<temp.length;i++){
   alert(temp[i]+":"+json[temp[i]]);
	  
  } 
    /* for(var i=0;i<array.length;i++){
	   alert(i);
   }  */
   /* for(var i in json){
	   alert(i+":"+json[i]+' ');
   } */
   
   
   
</script>
</head>
<body>

<button onclick="showJSon()">JSON</button>
</body>
</html>