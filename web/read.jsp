<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./css/myStyle.css"/>
        <title>JSP Page</title>
    </head>
    <% String table=(String) request.getAttribute("table");%>
    <body>
        <h1>Civilization VI Leaders</h1>
        <%=table %>
        <br><br>
        <a href ="add"> Add new Leader </a>
        <br>
        <br>
        <a href ="search.jsp"> Search Leaders </a>
        
    </body>
</html>