<%-- 
    Document   : newjspexpre
    Created on : Jul 20, 2022, 11:32:36 AM
    Author     : e.chomba
--%>

<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello Web: Expression Demo Pages</title>
    </head>
    <body>
        <div id="container">
            <h1>JSP Expression Demo!</h1>
            <h3>Today&r&rsaquo; date is "<%=LocalDate.now()%>"</h3>
            <h3>Your IP address is: "<%= request.getRemoteAddr()%>"</h3>
        </div>
    </body>
</html>
