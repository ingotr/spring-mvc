<%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 02.03.2023
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>You are welcome!</h2>
<br>

<%--<h3>Your name ${param.employeeName}</h3>--%>
    <div>
        <h3>Your name: ${employee.name}</h3>
        <br>
        <h2>Your surname: ${employee.surname}</h2>
        <br>
        <h2>Your salary: ${employee.salary}</h2>
        <br>
    </div>
</body>
</html>
