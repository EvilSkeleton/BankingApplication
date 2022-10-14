<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="WEB-INF/customnav.tld" prefix="x" %>
    <%@ page import="java.sql.ResultSet,java.sql.Connection,java.sql.PreparedStatement,Java.CustomerManager" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Check Balance</title>
</head>
<style>
.center {
  height: 10em;
  display: flex;
  align-items: center;
  justify-content: center }
</style>
<body>
	<x:DashNav page="Balance"></x:DashNav>
	
	<%
		String userName = null;
		Cookie[] cookies = request.getCookies();
		if(cookies !=null){
		for(Cookie cookie : cookies){
			if(cookie.getName().equals("user")) userName = cookie.getValue();
		}
		}
		if(userName == null) response.sendRedirect("Login.jsp");
		
		Connection conn=CustomerManager.getConnection();
		PreparedStatement st = conn.prepareStatement("select balance from Customer where accountNo=?");
        st.setString(1,userName);
        ResultSet rs = st.executeQuery();
        rs.next();
        
        
	%>
	<div class="center">
	<table style="text-align: left;font-size: 20px;">
		<tr>
			<td align="right">Balance : </td>
			<td align="left"><%= rs.getString(1) %></td>
		</tr>
	</table>
	</div>
	
</body>
</html>