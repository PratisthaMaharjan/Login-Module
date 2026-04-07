<%-- 
    Document   : login
    Created on : 7 Apr 2026, 12:48:39
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="Login" method="post">
            Username: <input type="text" name="username">
            Password: <input type="password" name="password">
            <input type="submit">
        </form>
        <%
            String error = (String) request.getAttribute("error");
            if(error != null){
        %>
        <p style="color:red;"><%= error %></p>
        <%
            }
        %>
    </body>
</html>
