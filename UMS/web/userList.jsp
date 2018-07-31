<%--        
    Document   : userList
    Created on : Jul 20, 2018, 8:47:06 AM
    Author     : Niraj Karanjeet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User List!</h1>
        <table border="1">
            <tr>
            <td>ID</td>
            <td>Full Name</td>
            <td>Username</td>
            </tr>
            
            <c:forEach var="signup_table" items="${userDtoListObj}">
             <tr>
            <td>${signup_table.id}</td>
            <td>${signup_table.fullname}</td>
            <td>${signup_table.username}</td>
            </tr>
            </c:forEach>
            
        </table>
        <h3>
            <a href="login.jsp">Go to user login.</a>
        </h3>
    </body>
</html>
