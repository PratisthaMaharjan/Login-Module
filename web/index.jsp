<%-- 
    Document   : index
    Created on : 1 Apr 2026, 12:36:16
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <%
//            HttpSession session = request.getSession(false); // do not create new session
            if(session == null || session.getAttribute("username") == null){
                response.sendRedirect("login.html");
            }
        %>
        <h1>Hello, <%= session.getAttribute("username") %></h1>
        <a href="Logout">Logout</a>
    </body>
</html>
