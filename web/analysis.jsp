

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>analysis</title>
    </head>
    <body BGCOLOR="#E6E6FA">
        <p>Welcome, <%=session.getAttribute("name")%></p><br/><br/>
        <h1>Vending Machine Report </h1>
    <center><form action="analysis.jsp" method="POST">
            <table border="1">
                <thead>
                    <tr>
                        <th style="width: 100px">Machine Number</th>
                        <th style="width: 100px">Machine Address</th>
                        <th style="width: 100px">Performance</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><input type="text" name="M1" value="" size="50" /></td>            
                        <td> <input type="text" name="ADD1" value="" size="50" /></td>
                        <td><input type="submit" value="good" name="GOOD" style="color: green" /></td>
                    </tr>
                    <tr>
                        <td><input type="text" name="M2" value="" size="50" /></td>            
                        <td> <input type="text" name="ADD2" value="" size="50" /></td>
                        <td><input type="submit" value="OK" name="OK" style="color: yellow"/></td>
                    </tr>
                    tr>
                        <td><input type="text" name="M3" value="" size="50" /></td>            
                        <td> <input type="text" name="ADD3" value="" size="50" /></td>
                        <td><input type="submit" value="Bad" name="BAD" style="color: red"/></td>
                    </tr>
                </tbody>
            </table>

        </form>
        
    </center>
            
        <p><a href="logout.jsp">Logout</a>
    </body>
</html>
