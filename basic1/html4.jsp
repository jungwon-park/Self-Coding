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
                 ��¥�ͽð�
       </legend>
       <p>
         <label>DataPicker�� �̿��� ��¥����:
         <input type="date" name = "date">
         </label>
       </p>
       <p>
         <label>�ð�����:
         <input type="time" name = "time">
         </label>
       </p>
       <p>
         <label>��¥�ð�����:
         <input type="datetime-local" name = "datetime-local">
         </label>
       </p>
       <p>
         <label>������
         <input type="month" name = "month">
         </label>
       </p>
       <p>
         <label>�ּ���
         <input type="week" name = "week">
         </label>
       </p>
       <p>
         <label>���� ����:
         <input type="color" name = "color">
         </label>
         <input type="submit" value = "send">
       </p>
     </fieldset>
  </form>
</body>
</html>



