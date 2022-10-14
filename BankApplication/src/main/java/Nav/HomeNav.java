package Nav;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class HomeNav extends TagSupport
{
	private String page;

    public void setPage(String page) {
        this.page = page;
    }

    public String getPage() {
        return page;
    }
    
    
  public int doStartTag() throws JspException
  {
      JspWriter out = pageContext.getOut();
      
      try
      {
    	  out.print("<head>\n"
    	  		+ "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n"
    	  		+ "    <link href=\"https://getbootstrap.com/docs/5.2/assets/css/docs.css\" rel=\"stylesheet\">\n"
    	  		+ "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\"></script>\n"
    	  		+ "<link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n"
    	  		+ "</head>");
    	  
    	  out.print("<style type=\"text/css\">\n"
    	  		+ ".navbar {\n"
    	  		+ "--bs-navbar-color: rgba(255,255,255,0.9);\n"
    	  		+ "--bs-navbar-active-color: rgba(255,255,255,0.9);\n"
    	  		+ "font-size: 20px;\n"
    	  		+ "--bs-navbar-padding-y: 0rem;\n"
    	  		+ "}\n"
    	  		+ "</style>");
    	  
    	  out.print("<body>\n"
    	  		+ "\n"
    	  		+ "<header>\n"
    	  		+ "  <nav class=\"navbar navbar-expand-md fixed-top\" style=\"background-color: #4C3A51\">\n"
    	  		+ "    <div class=\"container-fluid\">\n"
    	  		+ "      <img src=\"image/bblogo1.webp\" alt=\"Logo\" width=\"40\" height=\"30\" class=\"d-inline-block align-text-top\">\n"
    	  		+ "      <a class=\"navbar-brand\" href=\"Home.jsp\" style=\"color: white;padding-left: 5px\">Bombay Bank</a>\n"
    	  		+ "      <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\" aria-controls=\"navbarCollapse\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n"
    	  		+ "        <span class=\"navbar-toggler-icon\"></span>\n"
    	  		+ "      </button>\n"
    	  		+ "      <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n"
    	  		+ "        <ul class=\"navbar-nav me-auto mb-2 mb-md-0\">");
    	  
    	  switch(page)
    	  {
    	  case "Home":
    		  out.print("<li class=\"nav-item\">\n"
    		  		+ "            <a class=\"nav-link active\" aria-current=\"page\" href=\"Home.jsp\">Home</a>\n"
    		  		+ "          </li>\n"
    		  		+ "          <li class=\"nav-item\">\n"
    		  		+ "            <a class=\"nav-link\" href=\"Signup.jsp\">Sign-up</a>\n"
    		  		+ "          </li>\n"
    		  		+ "          <li class=\"nav-item\">\n"
    		  		+ "            <a class=\"nav-link\" href=\"Login.jsp\">Login</a>\n"
    		  		+ "          </li>");
    		  break;
    	  case "Signup":
    		  out.print("<li class=\"nav-item\">\n"
    		  		+ "            <a class=\"nav-link\" aria-current=\"page\" href=\"Home.jsp\">Home</a>\n"
    		  		+ "          </li>\n"
    		  		+ "          <li class=\"nav-item\">\n"
    		  		+ "            <a class=\"nav-link active\" href=\"Signup.jsp\">Sign-up</a>\n"
    		  		+ "          </li>\n"
    		  		+ "          <li class=\"nav-item\">\n"
    		  		+ "            <a class=\"nav-link\" href=\"Login.jsp\">Login</a>\n"
    		  		+ "          </li>");
    		  break;
    	  case "Login":
    		  out.print("<li class=\"nav-item\">\n"
    		  		+ "            <a class=\"nav-link\" aria-current=\"page\" href=\"Home.jsp\">Home</a>\n"
    		  		+ "          </li>\n"
    		  		+ "          <li class=\"nav-item\">\n"
    		  		+ "            <a class=\"nav-link\" href=\"Signup.jsp\">Sign-up</a>\n"
    		  		+ "          </li>\n"
    		  		+ "          <li class=\"nav-item\">\n"
    		  		+ "            <a class=\"nav-link active\" href=\"Login.jsp\">Login</a>\n"
    		  		+ "          </li>");
    		  break;
    	  default:
    		  
    	  }
    	  
    	  out.print("</ul>\n"
    	  		+ "        <form class=\"d-flex\" role=\"search\">\n"
    	  		+ "          <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n"
    	  		+ "          <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n"
    	  		+ "        </form>\n"
    	  		+ "      </div>\n"
    	  		+ "    </div>\n"
    	  		+ "  </nav>\n"
    	  		+ "</header>"
    	  		+ "<br><br>");
    	  
      }
      catch(Exception e)
      {
    	  e.printStackTrace();
      }
      
	return SKIP_BODY;
  }
}