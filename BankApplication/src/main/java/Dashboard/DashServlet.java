package Dashboard;

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

import Java.Customer;
import Java.CustomerManager;

@WebServlet("/DashServlet")
public class DashServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		
		PrintWriter out = response.getWriter();
		String user = request.getParameter("user");
		String pass = request.getParameter("pwd");
		PreparedStatement st=null;
		Connection conn = null;
		
		try 
		{
			conn=CustomerManager.getConnection();
			st = conn.prepareStatement("select * from Customer where accountNo=?");
            st.setString(1,user);
            ResultSet rs = st.executeQuery();
            Cookie cookie = new Cookie("number", );
            
            while(rs.next())
            {
            	if(rs.getString(1).equals(user) || rs.getString(1) == user)
            	{
            		break;
            	}
            }
            out.print("<div>\n"
            		+ "		<table class=\"center\">\n"
            		+ "			<tr>\n"
            		+ "				<td align=\"right\">Account Number : </td>\n"
            		+ "				<td align=\"left\">"+rs.getString(1)+"</td>\n"
            		+ "			</tr>\n"
            		+ "			<tr>\n"
            		+ "				<td align=\"right\">First Name : </td>\n"
            		+ "				<td align=\"left\">"+rs.getString(4)+"</td>\n"
            		+ "			</tr>\n"
            		+ "			<tr>\n"
            		+ "				<td align=\"right\">Last Name : </td>\n"
            		+ "				<td align=\"left\">"+rs.getString(5)+"</td>\n"
            		+ "			</tr>\n"
            		+ "			<tr>\n"
            		+ "				<td align=\"right\">Address : </td>\n"
            		+ "				<td align=\"left\">"+rs.getString(6)+"</td>\n"
            		+ "			</tr>\n"
            		+ "			<tr>\n"
            		+ "				<td align=\"right\">Phone : </td>\n"
            		+ "				<td align=\"left\">"+rs.getString(7)+"</td>\n"
            		+ "			</tr>\n"
            		+ "			<tr>\n"
            		+ "				<td align=\"right\">Email : </td>\n"
            		+ "				<td align=\"left\">"+rs.getString(8)+"</td>\n"
            		+ "			</tr>\n"
            		+ "			<tr>\n"
            		+ "				<td align=\"right\">Branch : </td>\n"
            		+ "				<td align=\"left\">"+rs.getString(9)+"</td>\n"
            		+ "			</tr>\n"
            		+ "		</table>\n"
            		+ "	</div>");
            st.close();
            conn.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
