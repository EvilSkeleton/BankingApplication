package Balance;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Java.CustomerManager;

@WebServlet("/CheckBal")
public class CheckBal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("user");
//		request.setAttribute("data", CustomerManager.getBal(user));
//	    request.getRequestDispatcher("CheckBal.jsp").forward(request, response);
		
//		response.setContentType("text/html"); 
//        PrintWriter out=response.getWriter();
//        
//		
//		out.print("<style>\n"
//				+ "div.container4 {\n"
//				+ "    height: 10em;\n"
//				+ "    position: relative }\n"
//				+ "div.container4 p {\n"
//				+ "    margin: 0;\n"
//				+ "    background: yellow;\n"
//				+ "    position: absolute;\n"
//				+ "    top: 50%;\n"
//				+ "    left: 50%;\n"
//				+ "    margin-right: -50%;\n"
//				+ "    transform: translate(-50%, -50%) }\n"
//				+ "</style>");
//		
//		out.print("<div class=\"container4\">\n"
//				+ "			<p>Balance\n"
//				+ "			<p>----------------\n"
//				+ "			<p>"+CustomerManager.getBal(user)+"\n"
//				+ "		</div>");
	    
	    ServletContext sc = this.getServletContext();
	    RequestDispatcher rd = sc.getRequestDispatcher("/CheckBal.jsp");
	    rd.forward(request, response);
	}

}
