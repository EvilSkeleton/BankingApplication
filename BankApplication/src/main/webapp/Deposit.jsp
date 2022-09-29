<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="WEB-INF/customnav.tld" prefix="x" %>
    <%@ page import="java.sql.ResultSet,java.sql.Connection,java.sql.PreparedStatement,Java.CustomerManager,java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Deposit</title>
</head>
<style>
.center {
	text-align : center;
	margin-left: auto;
  margin-right: auto;	
}
</style>
<body>
	<x:DashNav page="Deposit"></x:DashNav>
		<div>
			<form action="DepServlet" method="post" class="center">
					<h1>Enter Amount to Deposit</h1>
						<table class="center">
								<tr>
									<td align="right"><label for="amt">Enter Amount Number : </label></td>
									<td align="left"><input type="text" name = "amt"></td>
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
</body>
</html>