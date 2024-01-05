<%-- 
    Document   : declarations
    Created on : Jul 20, 2022, 11:57:01 AM
    Author     : e.chomba
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Declarations</title>
    </head>
    
    
    
    <body>
        <div id="container">
            
            
        <%!
          // Access Counter
          private int accessCount = 0; 
        %>
        
        
        <h1>Accesses to page since server reboot: <%= ++accessCount %></h1>
        
        
        </div>
    </body>
    
</html>
