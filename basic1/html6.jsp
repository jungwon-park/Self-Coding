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
			<legend>�ʼ��׸�</legend>
			<ul>
				<li>
					<label>�Ӹ��ѷ�(cm)</label>
					<input id = "headSize" name="headSize" type="number" min=30 max = "1000" autofocus="autofocus">
				</li>
				<li>
					<label>�̸�</label>
					<input id = "name" name = "name" type ="text" maxlength="4">
					<input type="button" value="�ߺ�Ȯ��">
				</li>
				<li>
					<label>�̸���</label>
					<input id = "email" name = "email" type ="email" placeholder="example@xxx.yyy">
					<input type="button" value="�ߺ�Ȯ��">
				</li>
			</ul>		
			<legend>�����׸�</legend>
			<ul>
				<li>
					<label>����ó</label>
					<input type="tel" name = "tel" placeholder="00** - 000* - 0000" pattern="\d{2,4}-\d{3,4}-\d{4}">
				</li>
				<li>
					<label>����</label>
					<input type="date" name = "date" min="1990-05-09" max="2000-01-01">
				</li>
				<li>
					<label>�����ϴ� ��</label>
					<input type="color" name = "color">
				</li>
				<li>
					<label>�����ϴ� ������</label>
					<input type="text list" list = ls>
					<datalist id="ls">
					<option value = "������"></option>
					<option value = "�п���"></option>
					<option value = "����"></option>
					</datalist>
				</li>
			</ul>
			<legend>���ṹ����</legend>
			<ul>
				<li>
					<label>���</label>
					<input type="checkbox" id ="la" type ="la" >
					<ul>
						<li>
							<label>���� ����� ������..</label>
							<input type="checkbox" id ="la1" type ="la1" >
						</li>
					</ul>
				</li>
				<li>
					<label>����</label>
					<input type="checkbox" id = "pe" type = "pe" >
				</li>
				<li>
					<label >���</label>
					<input type="checkbox" id = "bmin" type = "bmin" >
				</li>
				<li>
					<label >ġŲ</label>
					<input type="checkbox" id = "chicken" type = "chicken" >
				</li>
			</ul>
		</fieldset>
			<input type = "submit" value="Send">
	</form>
</body>
</html>