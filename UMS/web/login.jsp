<%-- 
    Document   : login
    Created on : Jul 11, 2018, 8:44:08 AM
    Author     : Niraj Karanjeet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        
        <h1>Login Page!</h1>
        <form method="get" action="./LoginServlet">
        Username: <input type="text" name="username">
        Password: <input type="password" name="password">
        <input type="submit" value="login">
        </form>
        <h1>OR</h1>
        <h3>
            <a href="signup.jsp">Signup</a>
            </h3>
              </body>
</html>
