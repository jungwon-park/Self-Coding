<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
/* <script type="text/javascript" src="/newfile/javaScript/script1.js" charset="UTF-8"> */
  var array=["������,����,����","�Ұ��,�������,�߰��","���,�̸�","�踻��,��","����,����,���"];
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
	<input type="checkbox" name="all" id="all" value="all" onclick="allCheck(this)">��ü  <!--this==> type,name,id,value�� ������  -->
   <input type="checkbox" name="ck5" value="�н�" id = "c1" onclick="checkCount(this,0)">�н�
   <input type="checkbox" name="ck5" value="���" id = "c2" onclick="checkCount(this,1)">���
   <input type="checkbox" name="ck5" value="��" id = "c3" onclick="checkCount(this,2)">��
   <input type="checkbox" name="ck5" value="Ƣ��" id = "c4" onclick="checkCount(this,3)">Ƣ��
   <input type="checkbox" name="ck5" value="ȸ" id = "c5" onclick="checkCount(this,4)">ȸ
</fieldset>
<div id="dc1"></div>
<div id="dc2"></div>
<div id="dc3"></div>
<div id="dc4"></div>
<div id="dc5"></div>
</body>
</html>