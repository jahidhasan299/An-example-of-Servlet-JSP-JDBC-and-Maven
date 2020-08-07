<%@ page import="com.jahid.web.model.Bob" %><%--
  Created by IntelliJ IDEA.
  User: jahid
  Date: 2020/8/7
  Time: 2:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Page</title>
</head>
<body bgcolor="#008b8b">
<%
  /*  Bob b1 = (Bob) request.getAttribute("alien"); // for Redirect*/
    Bob b1 = (Bob) session.getAttribute("alien"); // for Redirect
    out.println(b1);

%>
</body>
</html>
