<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Profile page  :${user.UserName}</p>
<br>
${user.Password}
<br>
 ${user.Name}
 <br>
 ${user.Email}
 <br>
 ${user.phono}
 <br>
 ${user.city} 
 <br>
<a href="logout"> logout</a>
</body> 
</html>