<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
   function showArray(){//선언적함수 
	   //alert('showArray');
      /*  var array1=[];
       var array2=new Array();
       var array3=new Array(10);       
       var array4=new Array(10,20,30);       
       
       array2[0]=50;
       array2[1]=50;
       array3[10]=100;
       console.log('array1='+array1.length);
       console.log('array2='+array2.length+" "+array2[0]);
       console.log('array3='+array3.length+" "+array3[9]);
       console.log('array4='+array4.length+" "+array4[2]); */
	  /*  var array5=[52,29,34,13,89];
       
       console.log(array5.sort());//내림
	   console.log(array5.sort(function(x,y){
		   return x-y;
	   }));
	   console.log(array5.sort(function(x,y){
		   return y-x;
	   })); */
       
   }
   //showArray();
   function arrayShow(){
	   var k=['이수연','김대현','노승원'];
	   var e=["North","West","East","South"];
	   console.log(e.sort(asc));
	   console.log(e.sort(desc));
	   
	   
   }
   function asc(a,b){
	   var a=a.toString().toLowerCase();//소문자
	   var b=b.toString().toLowerCase();//소문자		   
	   return (a<b)?-1:(a==b)?0:1;
   }
   function desc(a,b){
	   var a=a.toString().toLowerCase();//소문자
	   var b=b.toString().toLowerCase();//소문자		   
	   return (b<a)?-1:(a==b)?0:1;
   }
   
</script>
</head>
<body>
  <button onclick="arrayShow()">Click</button>
</body>
</html>












