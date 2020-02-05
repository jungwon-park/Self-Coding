<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%--  <%
    String no=request.getParameter("no");
    if(no.equals("1")){
    out.println("DataAction");	
    }else{
    out.println("ActionValue");	
    }
    
 %>   --%> 
 
<%-- <%
   out.println("TestAction");
   System.out.println("consoleTest");
%> --%>
<%-- <%
   String str="Test";
   out.println(str);
%>
<%=str %> --%>

<%
   String no=request.getParameter("no");
   if(no.equals("1")){
%>
<h1>TestH1</h1>
<%
   }else{
%>
<h6>TestH6</h6>
<%
   }
%>














