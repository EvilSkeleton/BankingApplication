<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="WEB-INF/customnav.tld" prefix="x" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> -->
<!-- <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script> -->
<!-- <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script> -->
<!-- <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script> -->
<!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"/> -->
<!-- <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap"/> -->
<!-- <link rel="stylesheet" href="../../../css/mdb.min.css" /> -->
<title>Home</title>
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
</style>
<body class="background">
	<x:HomeNav page="Home"></x:HomeNav>
	<div>

<!-- 	<div id="carouselExampleSlidesOnly" class="carousel slide" data-mdb-ride="carousel"> -->
<!--   <div class="carousel-inner"> -->
<!--     <div class="carousel-item active"> -->
<!--       <img src="https://mdbcdn.b-cdn.net/img/new/slides/041.webp" class="d-block w-100" alt="Wild Landscape"/> -->
<!--     </div> -->
<!--     <div class="carousel-item"> -->
<!--       <img src="https://mdbcdn.b-cdn.net/img/new/slides/042.webp" class="d-block w-100" alt="Camera"/> -->
<!--     </div> -->
<!--     <div class="carousel-item"> -->
<!--       <img src="https://mdbcdn.b-cdn.net/img/new/slides/043.webp" class="d-block w-100" alt="Exotic Fruits"/> -->
<!--     </div> -->
<!--   </div> -->
<!-- </div> -->
	</div>

	<div class="container" style=" position : bottom ;height :25%;">
		<div style="height :100%;width : 100%;flex-grow: 1; background : orange;">
		Bottom Divs
		</div>
	</div>
</body>
</html>