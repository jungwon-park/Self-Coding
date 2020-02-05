<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="/web/javaScript/httpRequest.js"></script>
</head>
<body>


<button onclick="showEmp('emp.xml')">Emp</button>

<script type="text/javascript">
function view(){
	if(httpRequest.readyState==4 &&httpRequest.status==200){
		//alert(httpRequest.responseText);
		//console.log(httpRequest.responseXML);
		printInfo();
	}
}
function printInfo(){
	var xmlData=httpRequest.responseXML;
	var enter=xmlData.getElementsByTagName("emp");
	//console.log(enter.length);
	var array=new Array(7);
	for(var i=0;i<enter.length;i++){
		var n=0;
		var enterChildNodes=enter[i].childNodes;
		//alert(enterChildNodes.length);
		for(var j=0;j<enterChildNodes.length;j++){
			var xmlNode=enterChildNodes[j].firstChild;
			if((xmlNode&& typeof(xmlNode)!="undefined")){
				console.log(xmlNode.nodeValue);
			}
		}
		
	}
	
	
}
function showEmp(url){
	sendRequest(url,null,view,'GET');
}
</script>
</body>
</html>

















