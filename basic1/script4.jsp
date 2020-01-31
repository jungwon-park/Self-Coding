<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<button onclick="typeFun(100)">click1</button>
<button onclick="typeFun(3.14)">click2</button>
<button onclick="typeFun('슬기')">click3</button>
<button onclick="typeFun(5>3)">click4</button>
<button onclick="typeFun(function(){alert('hifunction')})">click5</button>
<button onclick="typeFun([1,2,3])">click6</button>
<button onclick="typeFun({'no':1,'name':'슬기'})">click7</button>
<button onclick="typeFun([{'no':1,'name':'슬기','height':120.2},{'no':2,'name':'성수','height':152.2},{'no':3,'name':'슬기','height':160.2}])">click8</button>
<script type="text/javascript">
function typeFun(data){
	//alert(typeof(data)+" "+(typeof(data)=='function'?data():data));		//버튼클릭시 alert실행
	alert(typeof(data));
	if(typeof(data)=='function')data();
	else{
		/* if(typeof(data)=='object'){			//click 6
			alert(data)
			for (var i = 0; i < data.length; i++) {
				alert(data[i]);
			}
		}else{
		alert(data);
		} */
		if(typeof(data)=='object'){
			if(Array.isArray(data)){
			/* 	 for (var i = 0; i < data.length; i++) {
					alert(data[i]);
				} 	//방법 1
			} */
			/* else{
				alert(data.no + ' '+data.name);
				alert(datap['no'] + ' '+data['name']);
			} */  		//방법 2
		}
		for(var i in data){
		for(var j in data[i]){
			alert(j+":"+data[i][j]);
		}
	}
}	
		else{
			for(var i in data){}
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
	
	test()();

</script>
</body>
</html>