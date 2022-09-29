<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="WEB-INF/customnav.tld" prefix="x" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Password</title>
</head>
<style>
.center {
	text-align : center;
	margin-left: auto;
  margin-right: auto;	
}
</style>
<body>
	<x:DashNav page="Password"></x:DashNav>
		<div>
			<form action="PassServlet" method="post" class="center">
				<h1>Enter Current and New Password</h1>
						<table class="center">
								<tr>
									<td align="right"><label for="amt">Enter Current Password : </label></td>
									<td align="left"><input type="password" name="fpass"></td>
								</tr>
								<tr>
									<td align="right"><label for="pwd">Enter New Password : </label></td>
									<td align="left"><input type = "password" name = "pwd"></td>
								</tr>
								<tr>
									<td align="right"><label for="pwd">Renter New Password : </label></td>
									<td align="left"><input type = "password" name = "rpwd"></td>
								</tr>
						</table>
<!-- 							<input type = "submit" value = "login"><br> -->
								<button type="submit">Login</button>
			</form>
		</div>
</body>
</html>