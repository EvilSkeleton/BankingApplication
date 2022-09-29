package Login;

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
import javax.servlet.http.HttpSession;

import Java.CustomerManager;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		HttpSession session = request.getSession();
		
//		PrintWriter out = response.getWriter();
		String user = request.getParameter("user");
		String pass = request.getParameter("pwd");
		PreparedStatement st=null;
		
		Connection conn=null;
		try 
		{
			conn=CustomerManager.getConnection();
			st = conn.prepareStatement("select * from Customer where accountNo=?");
            st.setString(1,user);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            	if((rs.getString(1).equals(user)) || rs.getString(1) == user)
            	{
            		if(rs.getString(2).equals(pass) || rs.getString(2) == pass)
            		{
	            		Cookie loginCookie = new Cookie("user", user);
	            		//setting cookie to expiry in 30 mins
	            		loginCookie.setMaxAge(30*60);
	            		response.addCookie(loginCookie);
	            		response.sendRedirect("/BankApplication/Dashboard.jsp");
	            	}
            		else
	            	{
            			PrintWriter out= response.getWriter();
	            		out.println("<font color=red>Either user name or password is wrong.</font>");
	            		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
	            		rd.include(request, response);
	            	}
            		break;
            	}
            	else
            	{
            		PrintWriter out= response.getWriter();
            		out.println("<font color=red>Either user name or password is wrong.</font>");
            		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
            		rd.include(request, response);
            	}
            }
            
            
            st.close();
            conn.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
