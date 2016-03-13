<%-- 
    Document   : Crafted
    Created on : Mar 13, 2016, 4:43:23 AM
    Author     : Magic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="lisbeth" class="proof.Crafter" scope="session" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <br>
        <p>
        Craft:<br><%= lisbeth.getCraft() %>
        </p>
    </body>
</html>
