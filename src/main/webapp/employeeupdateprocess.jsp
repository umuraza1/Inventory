<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/inventory";%>
<%!String user = "root";%>
<%!String psw = "";%>
<%
String empid = request.getParameter("id");
String empfname=request.getParameter("empfname");
String emplname=request.getParameter("emplname");
String phone=request.getParameter("phone");
String username=request.getParameter("username");
String password=request.getParameter("password");
if(empid != null)
{
Connection con = null;
PreparedStatement ps = null;
int personID = Integer.parseInt(empid);
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
String sql="Update employees set empid=?,empfname=?,emplname=?,phone=?,username=?,password=? where empid="+empid;
ps = con.prepareStatement(sql);
ps.setString(1,empid);
ps.setString(2, empfname);
ps.setString(3, emplname);
ps.setString(4, phone);
ps.setString(5, username);
ps.setString(6, password);
int i = ps.executeUpdate();
if(i > 0)
{
out.print("Employee Updated Successfully");
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
