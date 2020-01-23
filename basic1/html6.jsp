<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="html6Result.jsp">
		<fieldset style="width:50%">
			<legend>필수항목</legend>
			<ul>
				<li>
					<label>머리둘레(cm)</label>
					<input id = "headSize" name="headSize" type="number" min=30 max = "1000" autofocus="autofocus">
				</li>
				<li>
					<label>이름</label>
					<input id = "name" name = "name" type ="text" maxlength="4">
					<input type="button" value="중복확인">
				</li>
				<li>
					<label>이메일</label>
					<input id = "email" name = "email" type ="email" placeholder="example@xxx.yyy">
					<input type="button" value="중복확인">
				</li>
			</ul>		
			<legend>선택항목</legend>
			<ul>
				<li>
					<label>연락처</label>
					<input type="tel" name = "tel" placeholder="00** - 000* - 0000" pattern="\d{2,4}-\d{3,4}-\d{4}">
				</li>
				<li>
					<label>생일</label>
					<input type="date" name = "date" min="1990-05-09" max="2000-01-01">
				</li>
				<li>
					<label>좋아하는 색</label>
					<input type="color" name = "color">
				</li>
				<li>
					<label>좋아하는 연예인</label>
					<input type="text list" list = ls>
					<datalist id="ls">
					<option value = "종워니"></option>
					<option value = "쫑워니"></option>
					<option value = "쫑이"></option>
					</datalist>
				</li>
			</ul>
			<legend>저녁뭐먹지</legend>
			<ul>
				<li>
					<label>라면</label>
					<input type="checkbox" id ="la" type ="la" >
					<ul>
						<li>
							<label>무슨 라면을 먹을까..</label>
							<input type="checkbox" id ="la1" type ="la1" >
						</li>
					</ul>
				</li>
				<li>
					<label>피자</label>
					<input type="checkbox" id = "pe" type = "pe" >
				</li>
				<li>
					<label >배민</label>
					<input type="checkbox" id = "bmin" type = "bmin" >
				</li>
				<li>
					<label >치킨</label>
					<input type="checkbox" id = "chicken" type = "chicken" >
				</li>
			</ul>
		</fieldset>
			<input type = "submit" value="Send">
	</form>
</body>
</html>