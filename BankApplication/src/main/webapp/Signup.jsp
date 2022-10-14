<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="WEB-INF/customnav.tld" prefix="x" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Signup</title>
<link href="css/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="js/passwordChecker.js"></script>
</head>
<style>
.background {
	height: 500px; /* You must set a specified height */
	background-position: top; /* Center the image */
	background-repeat: no-repeat; /* Do not repeat the image */
	background-size: cover; /* Resize the background image to cover the entire container */
/* 	background-image: url("https://img.freepik.com/free-vector/vector-background-bank-office-counters-managers-clients-bright-interior-finance-place-consulting-lobby-showcase-with-exchange-rate-business-concept_33099-1303.jpg?w=2000"); */
 	background-color: #F9F9F9;
}
.center {
	text-align : center;
	margin-left: auto;
  margin-right: auto;	
}
.signbox {
  	text-align : center;
}
input:invalid:required {
  border: 1px solid black;
}
</style>
<body class="background">
	<x:HomeNav page="Signup"></x:HomeNav>
	<br>
	<div class="flex" style="display: flex; height: 150%;">
        <div style="width: 50%; background: ">
        </div>
        <div style="flex-grow: 1; background: ;align-items: center;justify-content: center;padding-right: 30px;padding-left: 30px">
        	<div class="card" style="background : ;text-align: center;height:100%;">
        	<br><br>
				<h1>Sign Up</h1>
				<form action="SignUpServlet" method="post">
				<div class="flex">
					Account Information<br>
					-----------------------------------------------------------------<br>
					<select style="width: 300px;">
						<option value="">Account Type</option>
						<option value="">Checking Account</option>
						<option value="">Savings Account</option>
					</select>
					
					<br>
					<input required="required" style="width: 300px;" placeholder="Account Number" type = "text" name = "user">
					
					<br>
					Personal Information<br>
					-----------------------------------------------------------------<br>
					
					<input type = "radio" name = "gender" value="Male">Male &nbsp;&nbsp;
					<input type = "radio" name = "gender" value="female">Female &nbsp;&nbsp;
					<input type = "radio" name = "gender" value="other">other &nbsp;&nbsp;
					
					<br>
					<input style="width: 150px;" required="required" placeholder="First Name" type = "text" name = "fname">
					
					<input style="width: 150px;" required="required" placeholder="Last Name" type = "text" name = "fname">
					
					<br>
					<input style="width: 300px;" required="required" placeholder="Mobile Number" type="tel" name = "mobile">
					
					<br>
					<input style="width: 300px;" required="required" placeholder="Email Address" type = "email" name = "email">
					
					<br>
					<textarea style="width: 300px;" required="required" placeholder="Home Address" rows="4" cols="22" name="addr"></textarea>
					
					<br>
					 <select style="width: 300px;" required="required" name = "branch">
						<option value="">Branch Location</option>
						<option value="Bengaluru">Bengaluru</option>
						<option value="Hyderabad">Hyderabad</option>
						<option value="Mumbai">Mumbai</option>
						<option value="Delhi">Delhi</option>
						<option value="Kolkata">Kolkata</option>
						<option value="Pune">Pune</option>
						<option value="Panaji">Panaji</option>
					</select>
					
					<br>
					<input style="width: 300px;" required="required" placeholder="Password" type = "password" name = "pwd">
					
					<br>
					<input style="width: 300px;" required="required" placeholder="Re-enter Password" type = "password" name = "rpwd" onkeyup="checkPass(); return false;">
					<p id="confirmMessage" style="margin-top: 10x;">
					
					<br>
					<input type="checkbox" required="required">I agree to the Terms and Conditions.&nbsp;&nbsp;<br><br>
					
					<input class="btn btn-primary" type = "submit" value="Sign-Up"><br><br>
				</div>
				</form>
        	</div>
        </div>
	</div>
	<div class="flex" style=" position : bottom ;height :25%;">
		<x:Footer></x:Footer>
	</div>
</body>
</html>