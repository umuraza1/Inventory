<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/inventory";%>
<%!String user = "root";%>
<%!String psw = "";%>
<%
String proid = request.getParameter("id");
String proname=request.getParameter("proname");
String protype=request.getParameter("protype");
int quantity=Integer.parseInt(request.getParameter("quantity"));
int price=Integer.parseInt(request.getParameter("price"));
String fabricationdate=request.getParameter("fabricationdate");
String expireddate=request.getParameter("expireddate");
if(proid != null)
{
Connection con = null;
PreparedStatement ps = null;
int personID = Integer.parseInt(proid);
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
String sql="Update product set proid=?,proname=?,protype=?,quantity=?,price=?,fabricationdate=?,expireddate=? where proid="+proid;
ps = con.prepareStatement(sql);
ps.setString(1,proid);
ps.setString(2, proname);
ps.setString(3, protype);
ps.setInt(4, quantity);
ps.setInt(5, price);
ps.setString(6, fabricationdate);
ps.setString(7, expireddate);
int i = ps.executeUpdate();
if(i > 0)
{
out.print("Record Updated Successfully");
}
else
{
out.print("There is a problem in updating Record.");
}
}
catch(SQLException sql)
{
request.setAttribute("error", sql);
out.println(sql);
}
}
%>
