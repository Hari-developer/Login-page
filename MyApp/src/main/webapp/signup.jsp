<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Registration Form</title>
	  <link rel="stylesheet" href="css/signup.css" />
  </head>
  <body>
    <h1>SignUp Form</h1>
    <p>Please fill out this form with the required information</p>
    <form action="signup" method="post">
        
        <label>Enter Your User-Name: <input type="text" name="UserName" required /></label>
        <label>Enter Your Password: <input type="password" name="Password" required /></label>
         <label>Enter Your Name: <input type="text" name="Name" required /></label>
        <label>Enter Your Phone-No: <input type="text" name="PhoneNo" required /></label>
        <label>Enter Your Email: <input type="email" name="Email" required /></label>
        <label>Enter Your city: <input type="text" name="City" required /></label>
       
         <input type="submit" value="Submit"/>
         <input type="submit"   value="login"/>
          <p><a href="login" style="color:dodgerblue">Login Page</a>.</p>
        
    </form>
  </body>
</html>