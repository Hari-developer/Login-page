<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>signin form</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="box">
        <form action="login" method="post">
            <label for="username">UserName</label></br>
            <input type="text" name="uname" id="uname" placeholder="Enter Username" class="input-box">
            </br></br>
            <label for="password">Password</label></br>
            <input type="password" name="pass" id=pass placeholder="Enter Password" class="input-box"></br>
            <div class="forget">
                <label class="checkbox-label">
                    <input type="checkbox">
                    <span class="checkbox-custom "></span>
                    <span class="label-text">Remember me</span>
                </label>
                <span class="fg">
                   <a href="#"> Forget password?</a>
                </span>
            </div>
            <button type="submit" class="btn">Sign In</button>
            <p><a href="signup" style="color:dodgerblue">SignUp Page</a>.</p>   
        </form>
        <span class="option">or sign in with</span>
        <div class="social">
            <div class="box-radius">
                <img src="images/fb.png" alt="">
            </div>
            <div class="box-radius">
                <img src="images/google.png" alt="">
            </div>
            <div class="box-radius">
                <img src="images/linkedin.png" alt="">
            </div>
            <div class="box-radius">
                <img src="images/twitter.png" alt="">
            </div>
        </div>
    </div>
</body>
</html>