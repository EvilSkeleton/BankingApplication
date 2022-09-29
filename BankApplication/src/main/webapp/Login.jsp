<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="WEB-INF/customnav.tld" prefix="x" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<style>
.background {
	height: 500px; /* You must set a specified height */
	background-position: top; /* Center the image */
	background-repeat: no-repeat; /* Do not repeat the image */
	background-size: cover; /* Resize the background image to cover the entire container */
	background-image: url("https://img.freepik.com/free-vector/vector-background-bank-office-counters-managers-clients-bright-interior-finance-place-consulting-lobby-showcase-with-exchange-rate-business-concept_33099-1303.jpg?w=2000");
 	background-color: #cccccc;
}
label {
  display: block;
  margin-top: 1rem;
}

button {
  margin-top: 2rem;
}
input:invalid {
  border: 2px solid red;
}
.center {
	text-align : center;
	margin-left: auto;
  margin-right: auto;	
}
</style>
<body class="background">
	<x:HomeNav page="Login"></x:HomeNav>
	<div class="container" style="display: flex; height: 150%;">
        <div style="width: 50%; background: green;">
            Left Div
        </div>
        <div style="flex-grow: 1; background:red;align-items: center;justify-content: center;padding:150px">
        	<div class="loginbox" style="background : blue;">
				<form action="LoginServlet" method="post" class="center">
					<h1>Login Page</h1>
						<table class="center">
								<tr>
									<td align="right"><label for="user">Enter AccountNo : </label></td>
									<td align="left"><input type="text" name = "user"></td>
								</tr>
								<tr>
									<td align="right"><label for="pwd">Enter Password : </label></td>
									<td align="left"><input type = "password" name = "pwd"></td>
								</tr>
						</table>
<!-- 							<input type = "submit" value = "login"><br> -->
								<button type="submit">Login</button>
				</form>
        	</div>
        </div>
	</div>
	<div class="container" style=" position : bottom ;height :25%;">
		<div style="height :100%;width : 100%;flex-grow: 1; background : orange;">
			Bottom Div
		</div>
	</div>
</body>
</html>