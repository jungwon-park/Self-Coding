<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
  <form action="html4Result.jsp" method ="post" >
     <fieldset style="width: 50%">
       <legend>
                 날짜와시간
       </legend>
       <p>
         <label>DataPicker를 이용한 날짜선택:
         <input type="date" name = "date">
         </label>
       </p>
       <p>
         <label>시간선택:
         <input type="time" name = "time">
         </label>
       </p>
       <p>
         <label>날짜시간선택:
         <input type="datetime-local" name = "datetime-local">
         </label>
       </p>
       <p>
         <label>월선택
         <input type="month" name = "month">
         </label>
       </p>
       <p>
         <label>주선택
         <input type="week" name = "week">
         </label>
       </p>
       <p>
         <label>색상 선택:
         <input type="color" name = "color">
         </label>
         <input type="submit" value = "send">
       </p>
     </fieldset>
  </form>
</body>
</html>



