<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>�پ��� ��</h3>
<form action="html3Result.jsp	">
����:<input type="text" name="name">
��ȣ:<input type="password" name="pass"><br>
����:<input type="radio" name="gender" value="male">����
	<input type="radio" name="gender" value="female">����<br>
����:<select name="job" size = "2">
	<option selected="selected">�����ϼ���</option>
	<option value="�л�">�л�</option>
	<option value="����">����</option>
	<option value="���̻�">���̻�</option>
	<option value="������">������</option>
	</select>
	<p>
	����о�<br>
	<input type="checkbox" name="books" value="computer">��ǻ��
	<input type="checkbox" name="books" value="economy">������
	<input type="checkbox" name="books" value="common">���
	���:<br>
	<textarea rows="4" cols= "40" name = "msg"></textarea>
	<hr>
	<input type="submit">
	<input type="reset">
	
</form>
</body>
</html>