<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function showarray(){
	//alert('showarray');
	/* var array1=[];
	var array2= new Array();
	var array3= new Array(10);
	var array4= new Array(10,20,30);
	
	array2[0]=50;
	array2[1]=50;
	array3[10]=100;
	console.log('array1='+array1.length);
	console.log('array2='+array2.length);
	console.log('array3='+array3.length+" "+array3[1]);
	console.log('array4='+array4.length+" "+array4[1]); */
	
	/*  var array5=[4,3,2,6,1];
	console.log(array5.sort(function(x,y){
		return x-y;
	}))
	
	console.log(array5.sort(function(x,y){
		return y-x;
	}))  */
}
	//showarray();
function arrayshow(){
	var k = ['이수연','김대현','노승원'];
	var e = ["NORTH","WEST","EAST","SOUTH"];
	var n = [1.1421,2.721,4.5214,2.2421,5.442];
	var r = ['쪼워니','number1',100,'ACE',"100","#",":","멋쟁이","히읏히읏"];
	/* console.log(k.sort(function(a,b){
		var a = a.toString().toLowerCase();
		var b = b.toString().toLowerCase();
		return (a<b)?-1:(a==b)?0:1;	
	}));
	console.log(e.sort(function(a,b){
		var a = a.toString().toLowerCase();
		var b = b.toString().toLowerCase();
		return (a<b)?-1:1;
	})); */
	console.log(e.sort(asc));
	console.log(e.sort(desc));
	console.log(n.sort(asc));
	console.log(r.sort(asc));
	console.log(r.sort(desc));
}
function asc(a,b){
	var a = a.toString().toLowerCase();
	var b = b.toString().toLowerCase();
	return (a<b)?-1:(a==b)?0:1;
}
function desc(a,b){
	var a = a.toString().toLowerCase();
	var b = b.toString().toLowerCase();
	return (a<b)?1:-1;
}

</script>
</head>
<body>
<button onclick="arrayshow()">click</button>
</body>
</html>