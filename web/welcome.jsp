<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>

<body BGCOLOR="#E6E6FA">
<p>Welcome, <%=session.getAttribute("name")%></p>
<h2> Please Select from following options : </h2>

    <table border="1" cellspacing="4" cellpadding="1">
          <tbody>
            <tr>
                <td>
                    <form name="choice1" action="rawlog.jsp" method="POST">
                    <input type="submit" value="View Rawlog Data" name="rawlog" />
                    </form>
                    </td>
                <td>
                    <form name="choice2" action="vending.xhtml" method="POST">
                    <input type="submit" value="Vending Machine Configuration" name="vending" />
                    </form>
                </td>
                <td>
                    <form name="choice3" action="analysis.jsp" method="POST">
                    <input type="submit" value="Rawlog Analysis" name="analysis" />
                    </form>
                </td>
            </tr>
        </tbody>
    </table>

    


<p><a href="logout.jsp">Logout</a>
</body>
</html>