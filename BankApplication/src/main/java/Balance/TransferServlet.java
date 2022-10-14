package Balance;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dashboard.Transfer;

/**
 * Servlet implementation class TransferServlet
 */
@WebServlet("/TransferServlet")
public class TransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

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
		
		boolean status = Transfer.transfer(userName,amt,pass);
		
		if (status) {
        	out.print("<script type=\"text/javascript\">alert(\"The Transaction is succesful! :)\")</script>");
        	RequestDispatcher rd = request.getRequestDispatcher("Withdraw.jsp");
    		rd.include(request, response);
		} else {
        	out.print("<script type=\"text/javascript\">alert(\"The Password was wrong! :(\")</script>");
    		RequestDispatcher rd = request.getRequestDispatcher("Dashboard.jsp");
    		rd.include(request, response);
		}
		
//		TransferTxn.main(acc, amt);
	}

}
