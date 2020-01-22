<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>다양한 폼</h3>
<form action="html3Result.jsp	">
성명:<input type="text" name="name">
암호:<input type="password" name="pass"><br>
성별:<input type="radio" name="gender" value="male">남성
	<input type="radio" name="gender" value="female">여성<br>
직업:<select name="job" size = "2">
	<option selected="selected">선택하세요</option>
	<option value="학생">학생</option>
	<option value="구닌">구닌</option>
	<option value="으이사">으이사</option>
	<option value="선새이">선새이</option>
	</select>
	<p>
	희망분야<br>
	<input type="checkbox" name="books" value="computer">컴퓨터
	<input type="checkbox" name="books" value="economy">경제이
	<input type="checkbox" name="books" value="common">상식
	비고:<br>
	<textarea rows="4" cols= "40" name = "msg"></textarea>
	<hr>
	<input type="submit">
	<input type="reset">
	
</form>
</body>
</html>