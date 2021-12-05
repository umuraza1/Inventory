<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/inventory";%>
<%!String user = "root";%>
<%!String psw = "";%>
<%
String custid = request.getParameter("id");
String cfname=request.getParameter("cfname");
String clname=request.getParameter("clname");
String phone=request.getParameter("phone");
int addid=Integer.parseInt(request.getParameter("addid"));
if(custid != null)
{
Connection con = null;
PreparedStatement ps = null;
int personID = Integer.parseInt(custid);
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
String sql="Update customer set custid=?,cfname=?,clname=?,phone=?,addid=? where custid="+custid;
ps = con.prepareStatement(sql);
ps.setString(1,custid);
ps.setString(2, cfname);
ps.setString(3, clname);
ps.setString(4, phone);
ps.setInt(5, addid);
int i = ps.executeUpdate();
if(i > 0)
{
out.print("Customer Updated Successfully");
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
