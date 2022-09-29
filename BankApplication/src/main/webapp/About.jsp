<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="WEB-INF/customnav.tld" prefix="x" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About Us</title>
</head>
<style type="text/css">
.background {
  	height: 500px;
	background-position: top; /* Center the image */
	background-repeat: no-repeat; /* Do not repeat the image */
	background-size: cover; /* Resize the background image to cover the entire container */
 	background-image: url("https://img.freepik.com/free-vector/vector-background-bank-office-counters-managers-clients-bright-interior-finance-place-consulting-lobby-showcase-with-exchange-rate-business-concept_33099-1303.jpg?w=2000");
 	background-color: #4C3A51;
}
</style>
<body class="background">
	<x:HomeNav page="About"></x:HomeNav>
	<div class="container" style="display: flex; height: 150%;">
        <div style="width: 50%; background: green;">
            Left Div
        </div>
        <div style="flex-grow: 1; background: blue;">
            Right Div
        </div>
	</div>
	<div class="container" style=" position : bottom ;height :25%;">
		<div style="height :100%;width : 100%;flex-grow: 1; background : orange;">
		Bottom Div
		</div>
	</div>
</body>
</html>