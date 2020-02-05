<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<button onclick="typeFun(100)">Click1</button>
<button onclick="typeFun(3.14)">Click2</button>
<button onclick="typeFun('슬기')">Click3</button>
<button onclick="typeFun(5>3)">Click4</button>
<button onclick="typeFun(function(){alert('hiFunction')})">Click5</button>
<button onclick="typeFun([1,2,3])">Click6</button>
<button onclick="typeFun({'no':1,'name':'슬기'})">Click7</button>
<button onclick="typeFun([{'no':1,'name':'재훈','height':180.5},{'no':2,'name':'성수','height':188.5},{'no':3,'name':'승원','height':190.5}])">Click8</button>
<script type="text/javascript">
   function typeFun(data){
	  //alert(typeof(data)+" "+ (typeof(data)=='function'?data():data));
	  alert(typeof(data));
	  if(typeof(data)=='function')data();
	  else{
		  if(typeof(data)=='object'){
			 if(Array.isArray(data)){
				 /*  for(var i=0;i<data.length;i++){
					  alert(data[i]);
				  } */
				  for(var i in data){
					  for(var j in data[i]){
						  alert(j+":"+data[i][j]);
					  }
				  }
			 }
			 else{
				 /* alert(data.no+' '+data.name); 
				 alert(data['no']+' '+data['name']); */
				 for(var i in data){
					  alert(i+":"+data[i])
				  }
			 }
		  }else{
		     alert(data);			  
		  }
	  }
   }
   var test=function(){
	   alert('test');
	   return function(){alert('hoho')};
   }
   
   //test()();
</script>
</body>
</html>










