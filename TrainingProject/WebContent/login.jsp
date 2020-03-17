<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
div.relative {
  position: relative;
  width: 500px;
  height: 200px;
} 
div.absolute {
  position: absolute;
  top: 80px;
  right: 0;
  width: 200px;
  height: 100px;
}
</style>
</head>
<body>
<div class="relative">
<jsp:include page="index.jsp"></jsp:include>
</div>
<div class="absolute">
<form action="validate">
Enter Name:<input type="text" name="name" required/><br>
Enter Password:<input type="password" name="password" required/><br>
<input type="submit" value="login"/>
</form>
</div>
</body>
</html>