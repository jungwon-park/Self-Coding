<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
 var showJSon = function(){
	 var obj = [{'name':'이수연','age':22,'address':'수원시'},
	 {'name':'이장님','age':26,'address':'서울'}];
	//console.log(obj[0],name+' '+obj[0]['name']);
	for(var i in obj){
		for(var j in obj[i]){
			console.log(j+":"+obj[i][j]);
		}
	}
		/* for(var i in obj){
			alert(i+":"+obj[i]+' '+obj['name']+obj.name);
		}	 */
		//console.log(obj.name+" "+obj['name']+" " +obj[name]);
 }
 
 
 
</script>
</head>
<body>
<button onclick="showJSon()">JSON</button>
</body>
</html>