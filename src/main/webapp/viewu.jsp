<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SuperMarket</title>
<style type="text/css">
*{
	margin:0;
	padding : 0;
	font-family: timenewromans;
}
.banner{
	width: 100%;
	height: 100vh;
	background-image:url("images/banner.jpg");
	background-size: cover;
	background-position: center;
	background-repeated:repeated-x;}
	.navbar{
		width: 100% ;
		margin: auto;
		height:10px;
		padding: 35px 0;
		display: flex;
		align-items: right;
		justify-content: space-between;
		background-color:white;
		margin-top:0px;
		margin-left:0px;
		text-align:right;

	box-shadow: 0px 8px 16px 0px rgba(0,0,0,255);
		
	}
	.logo{
		margin-top: 10px;
		width: 25%;
		cursor: pointer;
	}
	.navbar ul li{
		list-style: none;
		display: inline-block;
		margin: 0 20px;
		position: relative;

	}

	.navbar ul li a{
		text-decoration: none;
		color: black;
		text-transform: togle;
		font-size: 17px;
		text-align:left;
		padding-top: 20px;


	}
	.navbar ul li::after{
		content: '';
		height: 3px;
		width: 0;
		background: #009688;
		position: absolute;
		left: 0;
		bottom: -8px;
		transition: 0.5s;
	}
	.navbar ul li:hover::after{
		width: 100%;

	}
	.content{
		width: 45%;
		position: absolute;
		top: 50%;
		transform: translate(-10%);
		text-align: left;
		color: #fff;
		border: #009688 3px solid;
		position: center;
		margin-left:5%;
		margin-top:0px;
		height:auto;
		backaground-color:white;
		display:inline-block;
		height:40%;
    }
    .content h2{
    	font-size: 30px;
    	margin-top: 70px;
       }
       .content p{
       	margin: 20px auto;
       	font-weight: 100;
       	line-height: 25px;
       	font-size: 20px;
       	margin-top: 20px;
       }
       button{
       	width: 160px;
       	padding: 15px 0;
       	text-align: center;
       	margin: 20px 10px;
       	font-weight: bold;
       	border: 2px solid #009688;
       	border-radius: 25px;
       	background: transparent;
       	color: #fff;
       	cursor: pointer;
       	position: relative;
       	overflow: hidden;
       	width:140px;
       	height:auto;
       }

       span{
       	background: #009688;
       	height: 100%;
       	width: 0;
       	border-radius: 25px;
       	position: absolute;
       	left: 0;
       	bottom: 0;
       	z-index: -1;
       	transition: 0.6s;
       }
       button:hover span{
       	width: 100%;

       }
       button:hover{
       	border: none;
       }
		.dropdown {
  display: inline-block;
  position: relative;
  padding-left:0px;
 color:black;
  width:70px;
  height:auto;
  text-transform: togle;
}
.dropdown-content {
display: none;
position: absolute;
width: 100%;
overflow: auto;
box-shadow: 0px 8px 16px 0px rgba(0,0,0,255);
padding-top:-20px;
width:140px;
background-color:white;
}

.dropdown:hover .dropdown-content {
display: block;
}
.dropdown-content a {
display: block;
color: black;
padding: 5px;
text-decoration: none;

}

.dropdown-content a:hover {
color: #FFFFFF;
background-color: #00A4BD;
}
.header{
background-color:transparent;
padding-left:-90px;
}
h1{
text-align:center;
color:black;
}
input[type=text] {
  width:70%;
  height:30px;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 2px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=password], select {
  width:70%;
  height:30px;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 2px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.form{
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
  
}

  input[type=date] {
  width:70%;
  height:30px;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 2px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=password], select {
  width:70%;
  height:30px;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 2px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 30%;
  background-color: #009688;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  font-size:15px;
  align:center;
}

input[type=submit]:hover {
  background-color: #45a049;
  width: 40%;
}
.employee{
padding-left:50%;
margin-top:4%;

}
h3{
color:white;}
table{
		border-style: groove;
		border-color: lightgrey;
		width:70%;
		align:center;
	}
	
	td{
		width: 100px;
		height: 40px
	}
	tr{
		height:40px;
		background-color: lightgrey;
	}
	input{
		width:250px;
		border-style: groove;
		height:30px;
	}
	button{
		height: 30px;
		background-color: gray;
		width: 40px;
	}
	tr:nth-child(even) {
		background-color: white;
	}
	tr:hover{
	background-color:grey;
	}
a:active{
text-decoration:underline;
}
h1{
font-family: Arial, Helvetica, sans-serif;
}

	img{
margin-left:-50px;
margin-top: -70px;
height:110px;
width:30%;
}	</style>
</head>
<body>
<div class="banner">
 
	  	<div class="navbar"><img alt="" src="images/logo1.png">
	  	   <ul>
	  		<li> <a href="indexforemployee.jsp"><i class="fa fa-home">  Home</i></a></li>
	  		
	  		<li> <a href="addcustomer.jsp">Add Customer</a></li>
	  		<li> <a href="payment.jsp">Payment</a></li>
	  		
	  	<li> <a href="#">Add Supplier</a></li>
	  	
	  		<div class="dropdown">
	  		<li>View</li>
	  		<div class="dropdown-content">

<a href="viewu.jsp">List of Products</a>
<a href="viewc.jsp">List of Customers</a>
</div></div>
	  			
	  		 <li><a href="insertimg.jsp">Add Images</a></li>
        <li> <a href="Logoute"><span></span> Logout</a></li>
          
          
    </ul> 

	  		</div>
	  		<br><br>
	  		<b><h3><center> Admin Product View</center></h3></b><br>
<%
String id = request.getParameter("userid");
String driver = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "inventory";
String userid = "root";
String password = "";

try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;


%><center>
<table class="table table-hover" id="sample-table-1">
<thead>
<tr>

<th>Product Name</th>
<th>Product type</th>
<th>Quantity</th>
<th>Price </th>
<th>fabrication date </th>
<th>Expired Date</th>

</tr>
</thead>
<%
try{
	
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();

String sql ="select * from product";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
 %>
<tbody>
<tr>
<td><%=resultSet.getString("proname") %></td>
<td><%=resultSet.getString("protype") %></td>
<td><%=resultSet.getString("quantity") %></td>
<td><%=resultSet.getString("price") %></td>
<td><%=resultSet.getString("fabricationdate") %></td>
    <td><%=resultSet.getString("expireddate") %></td>
</tr>
</tbody>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>



</table></center>
</body>
</html>