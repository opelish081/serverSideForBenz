<%--
  Created by IntelliJ IDEA.
  User: Qian
  Date: 10/23/2022
  Time: 4:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="${user == null}">
      <h2>Please Login First</h2>
    </c:if>

    <c:if test="${user != null}">
      <h2>Welcome ${user}</h2>
    </c:if>
</body>
</html>
