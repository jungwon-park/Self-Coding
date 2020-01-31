<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function objectEx1(){	//선언적함수
	var array = [5>3,10.5,100,'test',null,function(){},{'msg':'hi','avg':23.5,'sum':'234'}];
	
	console.log(array);
	for(var i in array){
		console.log(i+":"+array[i]+":"+typeof(array[i]));
		if(typeof(array[i]) == 'object' && !Array.isArray(array[i])){
			for(var j in array[i]){
			console.log(j+":"+array[i][j]);
			}
		}
	}
}
var objectEx2 = function(){		//익명함수
	var array = [10, 10.4,1==1,'my','0',{'name':'쫑워니','avg':'100'}];
	for(var i in array){
		console.log(i+":"+array[i]);
			for(var j in array[i]){
				console.log(j+":"+array[i][j]);
			}
	}
}
var a = function(){
	var a = [1,2,3,4,5];
	var 
}
</script>
</head>
<body>
<button onclick = "objectEx1()">click1</button>
<button onclick = "objectEx2()">click2</button>
<button onclick = "a()">click3</button>
</body>
</html>