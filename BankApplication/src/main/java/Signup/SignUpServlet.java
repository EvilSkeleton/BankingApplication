package Signup;

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

@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
		String user = request.getParameter("user");//TODO how to assign account nums
		String pass = request.getParameter("pwd");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String addr = request.getParameter("addr");
		String branch = request.getParameter("branch");
		
		PreparedStatement st=null;
		
		Connection conn=null;
		try 
		{
			conn=CustomerManager.getConnection();
			st = conn.prepareStatement("insert into Customer values(?,?,?,?,?,?,?,?,?)");
            st.setString(1,user);
            st.setString(2,pass);
            st.setDouble(3,0.0);
            st.setString(4,fname);
            st.setString(5,lname);
            st.setString(6,mobile);
            st.setString(7,email);
            st.setString(8,addr);
            st.setString(9,branch);
            
            st.executeUpdate();
            
            
            Cookie loginCookie = new Cookie("user",user);
    		//setting cookie to expiry in 30 mins
    		loginCookie.setMaxAge(30*60);
    		response.addCookie(loginCookie);
    		response.sendRedirect("/BankApplication/Dashboard.jsp");
            
            st.close();
            conn.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			PrintWriter out= response.getWriter();
    		out.println("<font color=red>Problem with the fields.</font>");
    		RequestDispatcher rd = request.getRequestDispatcher("Signup.jsp");
    		rd.include(request, response);
		}
	}

}
