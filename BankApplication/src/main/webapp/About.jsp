<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="WEB-INF/customnav.tld" prefix="x" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About Us</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<style type="text/css">
.background {
  	height: 500px;
	background-position: top; /* Center the image */
	background-repeat: no-repeat; /* Do not repeat the image */
	background-size: cover; /* Resize the background image to cover the entire container */
/*  	background-image: url("https://img.freepik.com/free-vector/vector-background-bank-office-counters-managers-clients-bright-interior-finance-place-consulting-lobby-showcase-with-exchange-rate-business-concept_33099-1303.jpg?w=2000"); */
 	background-color: #F9F9F9;
}
</style>
<body class="background">
	<x:HomeNav page="About"></x:HomeNav>
	<div class="flex" style="display: flex; height: 150%;">
        <div style="width: 50%; background: ;">
            Left Div
        </div>
        <div style="flex-grow: 1; background: ;">
            Right Div
        </div>
	</div>
	<div class="flex" style=" position : bottom ;height :25%;">
		<x:Footer></x:Footer>
	</div>
</body>
</html>