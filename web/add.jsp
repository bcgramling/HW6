

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./css/myStyle.css"/>
        <title>Add new Leader</title>
    </head>
    <body>
        <div class="wrap"> <!--div to hold all other divs -->
        <%@ include file="includes/header.jsp" %>
        <%@ include file="includes/menu.jsp"   %>
        <div class ="main">
            <h1>Add a new Leader</h1>
            <form name="addForm" action="addLeader" method="get">
                <table>
                    <tbody>
                        <tr>
                            <td>Leader's Name:</td>
                            <td><input type="text" name="name" value="" /></td> 
                        </tr>
                        <tr>
                            <td>Civilization:</td>
                            <td><input type="text" name="civ" value="" /></td> 
                        </tr>
                        <tr>
                            <td>Game Introduced:</td>
                            <td><input type="text" name="intro" value="" /></td> 
                        </tr>
                        <tr>
                            <td>Tier Ranking:</td>
                            <td><input type="text" name="tier" value="" /></td> 
                        </tr>
                        <tr>
                            <td></td>
                            <td><input type="reset" value="clear" id="clear">
                                <input type="submit" name="submit" value="submit" />
                                <form name="leaders" action="read.jsp" method="post">
                                <input type="submit" value="Cancel" id="submit">
                            </td> 
                        </tr>
                    </tbody>
                </table>
            </form>  
        </div>
        <%@ include file="includes/footer.jsp"  %>
        </div>
    </body>
</html>
