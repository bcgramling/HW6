<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./css/myStyle.css"/>
        <title>Search Leaders</title>
    </head>
    <body>
        <div class="wrap"> <!--div to hold all other divs -->
        <%@ include file="includes/header.jsp" %>
        <%@ include file="includes/menu.jsp"   %>
            <div class ="main">
                <h1>Search Leaders</h1>
                <form name="searchForm" action="search" method="get">
                    <input type="text" name="searchVal" value="" />
                    <br><br>
                    <input type="submit" name="submit" value="Search" />
                </form>
            </div>
        <%@ include file="includes/footer.jsp"  %>
        </div>
    </body>
</html>
