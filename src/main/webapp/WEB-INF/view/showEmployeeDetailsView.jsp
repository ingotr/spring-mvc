<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <h3>Your surname: ${employee.surname}</h3>
        <br>
        <h3>Your salary: ${employee.salary}</h3>
        <br>
        <h3>Your department: ${employee.department}</h3>
        <br>
        <h3>Your car: ${employee.carBrend}</h3>
        <ul>
            <c:forEach var="lang" items="${employee.languages}">
                <li>${lang}</li>
            </c:forEach>
        </ul>

    </div>
</body>
</html>
