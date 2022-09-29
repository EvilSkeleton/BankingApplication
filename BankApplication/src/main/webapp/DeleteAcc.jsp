<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="WEB-INF/customnav.tld" prefix="x" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Account</title>
</head>
<style>
.center {
	text-align : center;
	margin-left: auto;
  margin-right: auto;	
}
</style>
<body>
	<x:DashNav page="Delete"></x:DashNav>
		<div>
			<form action="DeleteServlet" method="post" class="center">
				<h1>Delete Account</h1>
						<table class="center">
								<tr>
									<td align="right"><label for="pwd">Enter Current Password : </label></td>
									<td align="left"><input type="password" name="pwd"></td>
								</tr>
								<tr>
									<td align="right"><label for="rpwd">Renter Current Password : </label></td>
									<td align="left"><input type = "password" name = "rpwd"></td>
								</tr>
								<tr>
									<td align="right"><label for="conf">Enter "DELETE" to initiate deletion : </label></td>
									<td align="left"><input type = "text" name = "conf"></td>
								</tr>
						</table>
<!-- 							<input type = "submit" value = "login"><br> -->
								<button type="submit">DELETE</button>
			</form>
		</div>
</body>
</html>