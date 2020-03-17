<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String a = request.getParameter("uname");
String b = request.getParameter("password");

Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection
("jdbc:mysql://localhost:3306/cts","root","root");
PreparedStatement pst = con.prepareStatement("select type from login where uname = ? AND password = ? ");
PreparedStatement pst1 = con.prepareStatement("select password from login where uname = ? AND password = ? ");
PreparedStatement pst2 = con.prepareStatement("select uname from login where uname = ? AND password = ? ");
pst.setString(1, a);
pst.setString(2, b);
pst1.setString(1, a);
pst1.setString(2, b);
pst2.setString(1, a);
pst2.setString(2, b);
ResultSet rs = pst.executeQuery();
ResultSet rs1 = pst1.executeQuery();
ResultSet rs2 = pst2.executeQuery();
rs.next();
rs1.next();
rs2.next();
if(b.equals(rs1.getString(1)) && rs.getString(1).equals("admin") ){
%>
Name: <%=rs2.getString(1)%><br>
Account Type: Admin<br>
<nav>
<a href="home.html">HOME</a>
<a href="add.html">Add</a>
<a href="update.html">Update</a>
<a href="delete.html">Delete</a>
</nav>
<%
}
else if(b.equals(rs1.getString(1)) && rs.getString(1).equals("associate") ){
%>
Name: <%=rs2.getString(1)%><br>
Account Type: Associate<br>
<nav>
<a href="home.html">HOME</a>
<a href="show.html">Show Employee</a>
<a href="view.html">View Details</a>
</nav>
<%
}
//else{
// System.out.println("Invalid User");
//}
%>
</body>
</html>