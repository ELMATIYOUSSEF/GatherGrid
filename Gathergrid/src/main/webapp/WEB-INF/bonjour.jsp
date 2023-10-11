<%--
  Created by IntelliJ IDEA.
  User: YouCode
  Date: 11/10/2023
  Time: 00:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="menu.jsp"%>
<h1>Hello world from page Bonjour.jsp</h1>
<h2>
    <%
        String message = (String) request.getAttribute("message");
    %>
    <%=message%>
</h2>
</body>
</html>

