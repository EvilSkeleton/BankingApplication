<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="WEB-INF/customnav.tld" prefix="x" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link href="css/bootstrap.css" rel="stylesheet">
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
	margin-left:auto;
  margin-right: auto;	
}
.card {
  /* Add shadows to create the "card" effect */
  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
  transition: 0.3s;
  width: auto;
}
input:invalid:required {
  border: 1px solid black;
}
</style>
<body class="background">
	<x:HomeNav page="Login"></x:HomeNav>
	<br>
	<div class="flex" style="display: flex;width:100%; height: 150%;">
        <div style="width: 50%; background: ;">
        </div>
        <div class="center" style="flex-grow: 1; background:;align-items: center;justify-content: center;padding-top:150px">
        	<div class="center" style="background : ;padding-left: 20%;padding-right: 20%">
				<div class="card">
				<form name="login" action="LoginServlet" method="post">
				<br>
					<h1>Login Page</h1>
					<div style="padding-left: 30px;padding-right: 30px">
						<input type="text" class="form-control" required placeholder="Account Number" name = "user"><br>
						<input type = "password" class="form-control" required placeholder="Password" name = "pwd"><br>
						<input class="btn btn-primary" type="submit" value="Login"><br><br><br>
					</div>
				</form>
				</div>
        	</div>
        </div>
	</div>
	<div class="flex" style=" position : bottom ;height :25%;">
		<x:Footer></x:Footer>
	</div>
</body>
</html>