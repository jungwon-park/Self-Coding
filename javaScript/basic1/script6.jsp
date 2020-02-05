<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
   function objectEx1(){//선언적함수 
	   var array=[5>3,10.5,100,'Test',null,function(){},{'msg':'hi','avg':95.5,'addr':'seoul'}];	   
	   console.log(array);
	   for(var i in array){
		   console.log(i+":"+array[i]+" :" +typeof(array[i]));
		   if(typeof(array[i])=='object'&& !Array.isArray(array[i])){
			   for(var  j in array[i]){
			       console.log(j+":"+array[i][j]);  
				   
			   }
		   }
		   
	   }
   }
   var a=function(){//익명함수 
	   alert('objectEx2');
      
       if(b>50)alert('test');   
   }
   var b=function(){
	   var array=[1,2,3,4,5];
	   //alert(typeof(array)=='object'&& Array.isArray(array));
	   var object={'name':'oop','since':1945};
	   //alert(typeof(object)=='object'&& Array.isArray(object));
	  /*  array[0]--->1
	   array[1]--->2 */
	   
	   
	   /* object['name']--->oop
	   object['since']--->1945 */
	   
	   //alert(object['name'])
	   //alert(array[0])
	   alert(object.name +' '+object.since)
	   
	   
   }
   
</script>
</head>
<body>
<button onclick="objectEx1()">Click1</button>
<button onclick="a()">Click2</button>
<button onclick="b()">Click3</button>

</body>
</html>





