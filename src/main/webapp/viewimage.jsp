<html>
    <head>
        <title>View Image</title>
    </head>
    
    <body>
    
        <b>View | <a href="insertimg.jsp">Upload</a></b><br/><br/>
        
<%
String id = request.getParameter("id");
%>
<img src="imageprocess.jsp?id=<%=id%>" width="400px"/>
 
    </body>
</html>