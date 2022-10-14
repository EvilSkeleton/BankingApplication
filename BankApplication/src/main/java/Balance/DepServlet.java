package Balance;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dashboard.deposit;
import Java.CustomerManager;
import Transactions.depositTxn;

@WebServlet("/DepServlet")
public class DepServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String userName = null;
		Cookie[] cookies = request.getCookies();
		if(cookies !=null){
		for(Cookie cookie : cookies){
			if(cookie.getName().equals("user")) userName = cookie.getValue();
		}
		}
		if(userName == null) response.sendRedirect("Login.jsp");
		
		String user = request.getParameter("amt");
		double amt = Double.parseDouble(user);
		String pass = request.getParameter("pwd");
//		String sid = request.getParameter("accountNo");
//		int acc = Integer.parseInt(sid);
		
		deposit.main(userName,amt,pass,request,response);
		
//		depositTxn.main(acc, amt);
	}
}
