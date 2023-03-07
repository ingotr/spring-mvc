<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <title>AskEmployeeDetails</title>
</head>
<body>
<h2>Write your name and submit</h2>
<br>

<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>

    <input type="submit" value="OK">
</form:form>

</body>
</html>
