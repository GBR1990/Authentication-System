<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="org.gireeshma.reddy.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
<link rel="stylesheet" href="loginDesign.css"/>
</head>
<body>
<h2>Login Successful!</h2>

<%
User user=(User)request.getAttribute("user");
%>
Hello,&nbsp; <%=user.getUserName()%>!<br>
Your details are below:
Your user id is&nbsp;<%=user.getUserId() %><br><br><br>
Age:&nbsp;<%= user.getAge()%><br>
Email Id:&nbsp;<%=user.getEmail() %><br>
Contact Number:&nbsp;<%=user.getNumber() %><br>
<img src="success.png" alt="Success Image" style="width:260px;height:228px;">

</body>
</html>