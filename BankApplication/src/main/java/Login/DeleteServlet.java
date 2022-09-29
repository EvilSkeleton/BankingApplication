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

import Java.CustomerManager;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
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
		
		String pass = request.getParameter("pwd");
		String rpass = request.getParameter("rpwd");
		String conf = request.getParameter("conf");
		PrintWriter out = response.getWriter();
		
		if(pass == rpass || pass.equals(rpass))
		{
			PreparedStatement st=null;
			Connection conn=null;
			
			try 
			{
				conn=CustomerManager.getConnection();
				st = conn.prepareStatement("select pass from Customer where accountNo=?");
				st.setString(1,userName);
				ResultSet rs = st.executeQuery();
				rs.next();
				if((rs.getString(1).equals(pass) || rs.getString(1) == pass) && conf == "DELETE" || conf.equals("DELETE"))
				{
					PreparedStatement st1 = conn.prepareStatement("delete from Customer where accountNo=?");
					st1.setString(1,userName);
					st1.executeUpdate();
//            	out.println("<font color=red>Transaction Successful.</font>");
					out.print("<script type=\"text/javascript\">alert(\"Deletion is succesful! :)\")</script>");
					RequestDispatcher rd = request.getRequestDispatcher("DeleteAcc.jsp");
					rd.include(request, response);
				}
				else
				{
//        		out.println("<font color=red>Password is wrong.</font>");
					out.print("<script type=\"text/javascript\">alert(\"The field is wrong! :(\")</script>");
					RequestDispatcher rd = request.getRequestDispatcher("DeleteAcc.jsp");
					rd.include(request, response);
				}
				
				
				st.close();
				conn.close();
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		else
		{
			out.print("<script type=\"text/javascript\">alert(\"The Passwords do not match! :(\")</script>");
			RequestDispatcher rd = request.getRequestDispatcher("DeleteAcc.jsp");
			rd.include(request, response);
		}
	}

}
