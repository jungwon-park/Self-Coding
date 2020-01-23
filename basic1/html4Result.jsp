<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<%
      String date=request.getParameter("date");
      String time=request.getParameter("time");
      String datetimelocal=request.getParameter("datetime-local");
      String month=request.getParameter("month");
      String week=request.getParameter("week");
      String color=request.getParameter("color");
   %>
<body bgcolor="<%=color%>" text="white">
   <h3>DATE:<%=date %></h3>
   <h3>TIME:<%=time %></h3>
   <h3>DATETIMELOCAL:<%=datetimelocal %></h3>
   <h3>MONTH:<%=month %></h3>
   <h3>WEEK:<%=week %></h3>
   <h3>COLOR:<%=color %></h3>

<!-- <table cellpadding="4" cellspacing="2" align = "center" border="2" width="50%">
	<thead>
		<tr>
			<td></td>
		</tr>
	</thead>
</table> -->
</body>
</body>
</html>