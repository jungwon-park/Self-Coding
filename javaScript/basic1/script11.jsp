<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
  function  sumProcess(){
    var result=0;
    for(var i=0;i<arguments.length;i++){
    	if(isNaN(arguments[i])){
    		//throw new Error('������ ���� ���ڰ� �ƴϴ�'+arguments[i]);
    		continue;
    	}
    	result+=(arguments[i]);
    }	      
    return result;
  }//function 
  /* var rs=sumProcess(10,'�̽ʻ�',30);
  alert(rs); */
  
  var valueChcek=function(){
	  var obj=document.frm;
	  if(obj.year.value && isNaN(obj.year.value)){
		  alert('���ڸ� ����');
		  obj.year.value='';
		  obj.year.focus();
		  return false;
	  }else if(!obj.year.value){
		  alert('write');
		  return false;
	  }
	  obj.submit();
  }
</script>
</head>
<body>
  <form action="script11Result.jsp" name="frm">
    <h3>�������</h3>
    <input type="text" name="year">
    <input type="text" name="month">
    <input type="text" name="day">
    <input type="button" value="Send" onclick="valueChcek()">
  </form>
  

</body>
</html>







