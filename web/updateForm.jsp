<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Leaders"%>
<% Leaders leader = (Leaders) request.getAttribute("leader"); %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./css/myStyle.css"/>
        <title>Update a Leader</title>
    </head>
    <body>
        <div class="wrap"> <!--div to hold all other divs -->
        <%@ include file="includes/header.jsp" %>
        <%@ include file="includes/menu.jsp"   %>
            <div class ="main">
                <h1>Update a Leader</h1>
                <form name="updateForm" action="updateLeader" method="get">
                    <table>
                        <tbody>
                            <tr>
                                <td>Leader's ID:</td>
                                <td><input type="text" name="id" value="<%= leader.getLeaderID() %>" readonly="" /></td> 
                            </tr>
                            <tr>
                                <td>Leader's Name:</td>
                                <td><input type="text" name="name" value="<%= leader.getLeaderName() %>" /></td> 
                            </tr>
                            <tr>
                                <td>Civilization:</td>
                                <td><input type="text" name="civ" value="<%= leader.getLeaderCiv() %>" /></td> 
                            </tr>
                            <tr>
                                <td>Game Introduced:</td>
                                <td><input type="text" name="intro" value="<%= leader.getLeaderIntro() %>" /></td> 
                            </tr>
                            <tr>
                                <td>Tier Ranking:</td>
                                <td><input type="text" name="tier" value="<%= leader.getTierRank() %>" /></td> 
                            </tr>
                            <tr>
                                <td></td>
                                <td><input type="reset" value="clear" id="clear">
                                    <input type="submit" name="submit" value="update" />
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
