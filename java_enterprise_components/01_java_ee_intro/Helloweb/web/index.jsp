<%-- 
    Document   : index
    Created on : Jul 18, 2022, 1:56:24 PM
    Author     : e.chomba
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <title>JSP Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    
    <body style="background-color: peru">
        <form name="inputForm" action="pages/response.jsp" method="POST">
            Enter your name:
                <input type="text" name="name" value="" /> 
                <input type="submit" value="OK">
        </form>   
        <br>
        <br>
        <br>
        <br>
        <div>Hello to  World</div>  
        <br>
        <br>
        <br>
        <br>
          <p>here my first Web App</p>
            <p><a href="pages/declarations.jsp">Declarations</a></p>
            <p><a href="pages/expression.jsp">Expression</a></p>
            <p><a href="pages/response.jsp.jsp">Response</a></p>
    </body>
    
</html>

