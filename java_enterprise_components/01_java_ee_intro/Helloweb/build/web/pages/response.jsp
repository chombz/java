<%-- 
    Document   : response
    Created on : Jul 18, 2022, 1:04:19 PM
    Author     : e.chomba
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <div id ="container">
            <jsp:useBean id="mybean" scope="session" class="hello.TextInput" />
            <jsp:setProperty name="mybean" property="name" value="<%= 
                         request.getParameter("name")%>" />
            <h1>Hello to <jsp:getProperty name="mybean" property="name" /> 
                World!</h1>
        </div>
    </body>
</html>
