<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
/* <script type="text/javascript" src="/newfile/javaScript/script1.js" charset="UTF-8"> */
  var array=["떡볶이,순대,오뎅","소고기,돼지고기,닭고기","라면,쫄면","김말이,전","연어,광어,방어"];
  function allCheck(obj){
	  checking(obj.checked);
  }
  function checking(state){
	  var nodeList=document.getElementsByName("ck5");
	  for(var i=0;i<nodeList.length;i++){
		  nodeList[i].checked=state;
	  }
  }
  function checkPass(){
	  var nodeList=document.getElementsByName("ck5");
	  var state=false;
	  for(var i=0;i<nodeList.length;i++){
		  if(!nodeList[i].checked)state=true;
	  }
	  if(state)document.getElementById("all").checked=false;
	  else
		  document.getElementById("all").checked=true;
  }
  function checkCount(obj,index){
	  checkPass();
	  var dv=document.getElementById("d"+obj.id);
	  //dv.innerHTML=obj.value;
	  city=array[index].split(",");
	  var temp="";
	  temp = "<fieldset><legend>"+obj.value+"</legend>";
	  for(var i=0; i<city.length; i++){
		 // dv.innerHTML+="<input type='checkbox' value='"+city[i]+"'>"+city[i]; 
		 temp+= "<input type='checkbox' value ='"+city[i]+"'>"+city[i];
	  }
	  temp+="</fieldset>"
	  dv.innerHTML = temp;
	  if(obj.checked)
		  dv.style.display='inline';
	  else{
		  dv.style.display='none';
	  }
  }
</script>
</head>
<body>

<fieldset name="test" style="width:50%">
	<input type="checkbox" name="all" id="all" value="all" onclick="allCheck(this)">전체  <!--this==> type,name,id,value값 가져옴  -->
   <input type="checkbox" name="ck5" value="분식" id = "c1" onclick="checkCount(this,0)">분식
   <input type="checkbox" name="ck5" value="고기" id = "c2" onclick="checkCount(this,1)">고기
   <input type="checkbox" name="ck5" value="면" id = "c3" onclick="checkCount(this,2)">면
   <input type="checkbox" name="ck5" value="튀김" id = "c4" onclick="checkCount(this,3)">튀김
   <input type="checkbox" name="ck5" value="회" id = "c5" onclick="checkCount(this,4)">회
</fieldset>
<div id="dc1"></div>
<div id="dc2"></div>
<div id="dc3"></div>
<div id="dc4"></div>
<div id="dc5"></div>
</body>
</html>