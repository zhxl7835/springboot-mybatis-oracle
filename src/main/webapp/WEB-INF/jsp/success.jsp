<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta charset="UTF-8">
    <title>index</title>
</head>
<body>
<table border="1" align="center">
    <th>username</th>
    <th>password</th>
    <c:forEach var="success" items="${success }">
        <tr>
            <td>${success.username }</td>
            <td>${success.password }</td>
        </tr>

    </c:forEach>
</table>

</body>
</html>