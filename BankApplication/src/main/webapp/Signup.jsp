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
</style>
<body class="background">
	<x:HomeNav page="Signup"></x:HomeNav>
	<div class="flex" style="display: flex; height: 150%;">
        <div style="width: 50%; background: ">
            Left Div
        </div>
        <div style="flex-grow: 1; background: ;align-items: center;justify-content: center;padding-right: 30px;padding-left: 30px">
        	<div class="card" style="background : ;text-align: center;height:100%;">
				<h1>Sign Up</h1>
				<form action="SignUpServlet" method="post">
					Account Information<br>
					-----------------------------------------------------------------<br>
						<table class="center">
							<tr>
								<td align="right">Account Type : </td>
								<td align="left">
									<select>
										<option value=""></option>
										<option value="">Checking Account</option>
										<option value="">Savings Account</option>
									</select>
								</td>
							</tr>
						</table>
						<br><br>
					Personal Information<br>
					-----------------------------------------------------------------<br>
						<table class="center">
							<tr>
								<td align="right">Select Gender :</td>
								<td align="left">
									<input type = "radio" name = "gender" value="Male">Male &nbsp;&nbsp;
									<input type = "radio" name = "gender" value="female">Female &nbsp;&nbsp;
									<input type = "radio" name = "gender" value="other">other &nbsp;&nbsp;
								</td>
							</tr>
							<tr>
								<td align="right">Enter Account No :</td>
								<td align="left"><input required="required" type = "text" name = "user"></td>
							</tr>
							<tr>
								<td align="right">Enter First Name :</td>
								<td align="left"><input required="required" type = "text" name = "fname"></td>
							</tr>
							<tr>
								<td align="right">Enter Second Name :</td>
								<td align="left"><input required="required" type = "text" name = "fname"></td>
							</tr>
							<tr>
								<td align="right">Enter Mobile :</td>
								<td align="left"><input required="required" type="tel" name = "mobile"><br><br></td>
							</tr>
							<tr>
								<td align="right">Enter Email :</td>
								<td align="left"><input required="required" type = "email" name = "email"></td>
							</tr>
							<tr>
								<td align="right">Address :</td>
								<td align="left"><textarea required="required" rows="4" cols="22" name="addr"></textarea></td>
							</tr>
							<tr>
								<td align="right">Select Branch :</td>
								<td align="left">
									 <select required="required" name = "branch">
										<option value=""></option>
										<option value="Bengaluru">Bengaluru</option>
										<option value="Hyderabad">Hyderabad</option>
										<option value="Mumbai">Mumbai</option>
										<option value="Delhi">Delhi</option>
										<option value="Kolkata">Kolkata</option>
										<option value="Pune">Pune</option>
										<option value="Panaji">Panaji</option>
									</select>
								</td>
							</tr>
							<tr>
								<td align="right">Enter Password :</td>
								<td align="left"><input required="required" type = "password" name = "pwd"></td>
							</tr>
							<tr>
								<td align="right">Re-enter Password :</td>
								<td align="left"><input required="required" type = "password" name = "rpwd" onkeyup="checkPass(); return false;">
								<p id="confirmMessage" style="margin-top: 10x;"></td>
							</tr>
						</table>
								<input type="checkbox" required="required">I agree to the Terms and Conditions.&nbsp;&nbsp;<br><br>
							<input class="btn btn-primary" type = "submit" value="Sign-Up"><br><br>
				</form>
        	</div>
        </div>
	</div>
	<div class="flex" style=" position : bottom ;height :25%;">
		<x:Footer></x:Footer>
	</div>
</body>
</html>