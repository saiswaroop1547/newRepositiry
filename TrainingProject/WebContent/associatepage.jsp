<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  width: 200px;
  background-color: #f1f1f1;
  border: 1px solid #555;
}

li a {
  display: block;
  color: #000;
  padding: 8px 16px;
  text-decoration: none;
}

li {
  text-align: center;
  border-bottom: 1px solid #555;
}

li:last-child {
  border-bottom: none;
}

li a.active {
  background-color: red;
  color: white;
}

li a:hover:not(.active) {
  background-color: #555;
  color: white;
}
</style>
</head>
<body>
<% out.println("I am from Associate page...");
String name=(String)session.getAttribute("sessname");%><br>
   <% out.println("User:"+name);%><br>
  <% out.println("Welcome"+" "+name);
  %>
<h2 style="text-align:center">Click On Your Preferred Operation</h2>
<ul style="list-style-type:none;text-decoration:">
<li><a class="active" href="home.jsp">Home</a></li>
<li><a href="displayemps.jsp">Display Employees</a></li>
<li><a href="searchemp.jsp">Search Employee</a></li>

</ul>
</body>
</html>