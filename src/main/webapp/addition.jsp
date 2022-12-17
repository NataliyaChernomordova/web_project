<%@ page import="com.example.web_project.Calculator" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11.12.2022
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Addition</title>
</head>
<body>
        <%@ page import="com.example.web_project.Calculator" %>
        <%Calculator calculator = (Calculator) session.getAttribute("calculator");%>
        <p>
            sum = a + b;
        </p>
        <% switch {

        }%>

</body>
</html>
