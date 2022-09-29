<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="WEB-INF/customnav.tld" prefix="x" %>
    <%@ page import="java.sql.ResultSet,java.sql.Connection,java.sql.PreparedStatement,Java.CustomerManager" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<style>
.center {
  height: 10em;
  display: flex;
  align-items: center;
  justify-content: center }
</style>
<body>
	<div>
		<x:DashNav page="Dash"></x:DashNav>
	</div>
	<div class="center">
		
		<%
			String userName = null;
			Cookie[] cookies = request.getCookies();
			if(cookies !=null){
			for(Cookie cookie : cookies){
				if(cookie.getName().equals("user")) userName = cookie.getValue();
			}
			}
			if(userName == null) response.sendRedirect("Login.jsp");
			
// 			RequestDispatcher rd = request.getRequestDispatcher("/DashServlet");
// 		    request.setAttribute("user",userName);
// 		    rd.forward(request, response);

			Connection conn=CustomerManager.getConnection();
			PreparedStatement st = conn.prepareStatement("select * from Customer where accountNo=?");
            st.setString(1,userName);
            ResultSet rs = st.executeQuery();
            
            while(rs.next())
            {
            	if(rs.getString(1).equals(userName) || rs.getString(1) == userName)
            	{
            		break;
            	}
            }
			
		%>
		<div>
		<table style="text-align: left;">
			<tr>
				<td align="right">Account Number : </td>
				<td align="left"><%= rs.getString(1) %></td>
			</tr>
			<tr>
				<td align="right">First Name : </td>
				<td align="left"><%= rs.getString(4) %></td>
			</tr>
			<tr>
				<td align="right">Last Name : </td>
				<td align="left"><%= rs.getString(5) %></td>
			</tr>
			<tr>
				<td align="right">Address : </td>
				<td align="left"><%= rs.getString(6) %></td>
			</tr>
			<tr>
				<td align="right">Phone : </td>
				<td align="left"><%= rs.getString(7) %></td>
			</tr>
			<tr>
				<td align="right">Email : </td>
				<td align="left"><%= rs.getString(8) %></td>
			</tr>
			<tr>
				<td align="right">Branch : </td>
				<td align="left"><%= rs.getString(9) %></td>
			</tr>
		</table>
	</div>
	</div>
		
<%-- 		<jsp:forward page="DashServlet"></jsp:forward> --%>
</body>
</html>