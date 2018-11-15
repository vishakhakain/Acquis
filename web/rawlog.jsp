<%@ page import="java.sql.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Rawlog data</title>
    </head>
    <body BGCOLOR="#E6E6FA">
        <p>Welcome, <%=session.getAttribute("name")%></p>
        <h1>Welcome to Rawlog data</h1

        <%
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;

            String driverName = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/vendingmachingdb";
            String user = "root";
            String dbpsw = "root";

            String sql = "SELECT ECP_UPT_ID FROM tbl_rawlog GROUP BY ECP_UPT_ID";

            try {
                Class.forName(driverName);
                con = DriverManager.getConnection(url, user, dbpsw);
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

        %>
    <center>
        <form name="frame1" action="rawlog.jsp" method="POST">

            <table border="1" style="width: 50px">
                <tbody>
                    <tr>
                        <td>   Select From : </td>
                        <td>   Select To : </td>
                        <td>   UTP</td>
                        <td>   </td>
                    </tr>
                    <tr>
                        <td><input type="text" name="from" value="" /></td>
                        <td><input type="text" name="to" value="" /></td>
                        <td><select id="ECP" style="width: 200px">
                                <%      while (rs.next()) {
                                        String temp = rs.getString("ECP_UPT_ID");
                                %>
                                <option value=<%=temp%>><%=temp%></option>

                                <%     }      %>                                   

                            </select>
                        </td>
                        <td> <input type="submit" value="SUBMIT" name="button1"  /> </td>
                        <%
                            if(request.getParameter("button1") != null) {
                                String filter= request.getParameter("ECP");
                                
                            }
                            %>
                    </tr>
                </tbody>
            </table>
        </form>
    </center>
    </br>

    <%
        } catch (SQLException sqe) {
            out.println("Error" + sqe.getMessage());
       }
    %>
    <form name="data" action="rawlog.jsp" method="POST">
        <table border="1" width="200" cellspacing="1">

            <tbody>
                <tr>
                    <td style="width: 50px"> UPT_ID: </td>
                    <td style="width: 70px"> MERCHANT ID: </td>
                    <td style="width: 50px"> DATE_TIME: </td>
                    <td style="width: 50px"> ISSUER: </td>
                    <td style="width: 50px"> PAN: </td>
                    <td style="width: 50px"> RESPONSE:</td>
                    <td style="width: 50px"> REF_NO: </td>
                    <td style="width: 50px"> ARTICLE_NO: </td>
                    <td style="width: 50px"> AMOUNT: </td>

                </tr>
                <%
                    String sql1 = "select a.ECP_UPT_ID,a.ECP_MERCHANT_ID,a.ECP_DATE_TIME,"
                            + " a.ECP_ISSUER,a.ECP_PAN_6ASTERIX4,a.ECP_RESPONSE,a.ECP_RET_REF_NBR,"
                            + "ECP_ARTICLE,ECP_DC_AMT from tbl_rawlog a GROUP BY a.ECP_MERCHANT_ID";

                    
                        ps = con.prepareStatement(sql1);
                        rs = ps.executeQuery();
                        while (rs.next()) {
                            String utp_id= rs.getString("ECP_UPT_ID");
                            String marchant_Id= rs.getString("ECP_MERCHANT_ID");
                            String date= rs.getString("ECP_DATE_TIME");
                            String issuer= rs.getString("ECP_ISSUER");
                            String pan= rs.getString("ECP_PAN_6ASTERIX4");
                            String resp= rs.getString("ECP_RESPONSE");
                            String ref= rs.getString("ECP_RET_REF_NBR");
                            String article= rs.getString("ECP_ARTICLE");
                            String amt= rs.getString("ECP_DC_AMT");
                            
                        
                %>
                <tr>
                    <td><%= utp_id %></td>
                    <td><%= marchant_Id %></td>
                    <td><%= date %></td>
                    <td><%= issuer %></td>
                    <td><%= pan %></td>
                    <td><%= resp %></td>
                    <td><%= ref %></td>
                    <td><%= article %></td>
                    <td><%= amt%></td>
                   
                </tr>
                <% } %>
            </tbody>
        </table>
      
    </form>

    <p><a href="logout.jsp">Logout</a>
    </body>
</html>
