<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create</title>
<link rel="stylesheet" href="loginDesign.css"/>
<script type="text/javascript" src="Form.js"></script>
</head>
<body>
<div class="container">
<form name="createform" action="create" method="post" onsubmit="return validate();">
	<h3>Please fill your details below</h3>
	User Name:<input type="text" name="username"align="left"/><br>
	Password:<input type="password" name="password"align="left"/><br>
	Age:<input type="text" name="age"align="left"/><br>
	Email Id:<input type="text" name="email"align="left"/><br>
	Contact Number:<input type="text" name="number"align="left"/><br>
	<input type="submit" value="Create"/><br>
	</form>
	</div>
	
</body>
</html>