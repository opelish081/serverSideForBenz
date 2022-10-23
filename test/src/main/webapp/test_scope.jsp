<%--
  Created by IntelliJ IDEA.
  User: Qian
  Date: 10/23/2022
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test Scope</title>
</head>
<body>
    <% String pageScope = "this is a pageScope"; %>
    <h2>PageScope: <%= pageScope %></h2>

    <h2>RequestScope: ${rc}</h2>
    <h2>SessionScope: ${sc}</h2>
    <h2>ApplicationScope: ${ac}</h2>
</body>
</html>
