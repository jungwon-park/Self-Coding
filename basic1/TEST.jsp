<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
var test = function(){
	var obj = [{'name':'������','age':'24'},
		{'name':'�п��ϴ�','age':'23'}];
	for(var i in obj){
		for(var j in obj[i]){
			console.log(j+":"+obj[i][j]);
		}
	}
}
</script>
</head>
<body>
<button onclick="test()">test</button>
</body>
</html>