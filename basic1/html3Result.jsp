<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String name = request.getParameter("name");
	String pass = request.getParameter("pass");
	String gender = request.getParameter("gender");
	String job = request.getParameter("job");
	String msg = request.getParameter("msg");
	String[] books = request.getParameterValues("books");
%>
<table cellpadding="10" cellspacing="0" align="center" border="1" width="80%">
	<thead>
		<tr style="color: red; background-color:yellow;">
			<th>Name</th>
			<th>PASS</th>
			<th>GENDER</th>
			<th>JOB</th>
			<th>BOOKS</th>
			<th>MSG</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><%=name %></td>
         <td><%=pass %></td>
         <td><%=gender %></td>
         <td><%=job %></td>
         <td>
         <%
           for(String s:books){
         %>
           <%=s %>
         <%
           }
         %></td>
         <td>
         <%=msg %>
         </td>
		</tr>
	</tbody>	
</table>
</body>
</html>