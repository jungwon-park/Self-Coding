<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
  function sendData(){
	  var frm=document.getElementById("frm");
	  var data=document.getElementById("data");
	  //console.log(data.value);
	  if(!data.value||data.value.length<=2||data.value=='scr'){
		  data.value='';
		  frm.data.focus();
		  return false;
	  }
	  frm.submit();
  }
</script>
</head>
<body>
<form action="script1Rs.jsp" id="frm">
<input type="text" name="aa" id="data">
<input type="button"  value="Search" onclick="sendData()">
</form>

</body>
</html>




