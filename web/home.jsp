
<%@ page import="java.sql.*" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>

<body BGCOLOR="#E6E6FA">
<%

Connection con= null;
PreparedStatement ps = null;
ResultSet rs = null;

String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://127.0.0.1:3306/vendingmachingdb";
String user = "root";
String password = "root";

String sql = "SELECT Privillage FROM tbluserlogin Group By Privillage";
try {
Class.forName(driverName);
con = DriverManager.getConnection(url, user, password);
ps = con.prepareStatement(sql);
rs = ps.executeQuery(); 
%>

<form method="post" action="login.jsp">

<center><h2 style="color:green">Acquis Login </h2></center>
<table border="1" align="center">
<tr>
<td>Enter Name :  >
<td><input type="text" name="name"/></td>
</tr>

<tr>
<td>Enter Password :  </td>
<td><input type="password" name="password"/></td>
</tr>

<tr>
<td>Select User Type :  </td>
<td><select name="usertype">
<option value="select">select</option>

<%
while(rs.next())
{
String usertype = rs.getString("Privillage");
%>

<option value=<%=usertype%>><%=usertype%></option>

<% 
}
}
catch(SQLException sqe)
{
out.println("home"+sqe);
}
%>
</select>
</td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="submit"/></td>
</table>
</form>
</body>
</html>
