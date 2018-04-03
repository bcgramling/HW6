<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./css/myStyle.css"/>
        <title>Civ VI Leaders</title>
    </head>
    <body>
        <div class="wrap"> <!--div to hold all other divs -->
            <%@ include file="includes/header.jsp" %>
            <%@ include file="includes/menu.jsp"   %>
                <div class ="main">
                    <h1>My Civilization VI Leaders Database</h1>
                    <a href="read">View All Leaders</a>
                    <br> <br>
                    <a href="search.jsp">Search Leaders</a>
                </div>
            <%@ include file="includes/footer.jsp"  %>
        </div>  <!--class wrap div -->
    </body>
</html>
