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
    	  out.print("<style type=\"text/css\">\n"
    	  		+ "/* Add a black background color to the top navigation */\n"
    	  		+ ".topnav {\n"
    	  		+ "  background-color: #4C3A51;\n"
    	  		+ "  overflow: hidden;\n"
    	  		+ "  width: 100%;\n"
    	  		+ "}\n"
    	  		+ "\n"
    	  		+ "/* Style the links inside the navigation bar */\n"
    	  		+ ".topnav a {\n"
    	  		+ "  float: left;\n"
    	  		+ "  color: white;\n"
    	  		+ "  text-align: center;\n"
    	  		+ "  padding: 14px 16px;\n"
    	  		+ "  text-decoration: none;\n"
    	  		+ "  font-size: 23px;\n"
    	  		+ "}\n"
    	  		+ ".topnav b {\n"
    	  		+ "  float: left;\n"
    	  		+ "  color: black;\n"
    	  		+ "  text-align: center;\n"
    	  		+ "  text-decoration: none;\n"
    	  		+ "  font-size: 17px;\n"
    	  		+ "}\n"
    	  		+ "\n"
    	  		+ "/* Change the color of links on hover */\n"
    	  		+ ".topnav a:hover {\n"
    	  		+ "  background-color: #FF4A4A;\n"
    	  		+ "  color: white;\n"
    	  		+ "}\n"
    	  		+ "\n"
    	  		+ "/* Add a color to the active/current link */\n"
    	  		+ ".topnav a.active {\n"
    	  		+ "  background-color: #6FEDD6;\n"
    	  		+ "  color: black;\n"
    	  		+ "}\n"
    	  		+ "</style>");
    	  switch(page)
    	  {
    	  case "Home":
    		  out.print("<body>\n"
    		  		+ "	<div class=\"topnav fixed-top\">\n"
    		  		+ "        <b><img src=\"image/bank.png\" alt=\"alternatetext\" style=\"width:50px;height:50px;padding-left: 5px;padding-right: 5px\"></b>\n"
    		  		+ "        <a style='color: white'>Perfios Bank</a>\n"
    		  		+ "	    <a class=\"active\" href=\"Home.jsp\">Home</a>\n"
    		  		+ "	    <a href=\"Signup.jsp\">Signup</a>\n"
    		  		+ "	    <a href=\"Login.jsp\">Login</a>\n"
    		  		+ "	    <a href=\"About.jsp\">About</a>\n"
    		  		+ "	</div>\n"
    		  		+ "</body>");
    		  break;
    	  case "Signup":
    		  out.print("<body>\n"
    		  		+ "	<div class=\"topnav\">\n"
    		  		+ "        <b><img src=\"image/bank.png\" alt=\"alternatetext\" style=\"width:50px;height:50px;padding-left: 5px;padding-right: 5px\"></b>\n"
    		  		+ "        <a style='color: white'>Perfios Bank</a>\n"
    		  		+ "	    <a href=\"Home.jsp\">Home</a>\n"
    		  		+ "	    <a class=\"active\" href=\"Signup.jsp\">Signup</a>\n"
    		  		+ "	    <a href=\"Login.jsp\">Login</a>\n"
    		  		+ "	    <a href=\"About.jsp\">About</a>\n"
    		  		+ "	</div>\n"
    		  		+ "</body>");
    		  break;
    	  case "Login":
    		  out.print("<body>\n"
    		  		+ "	<div class=\"topnav\">\n"
    		  		+ "        <b><img src=\"image/bank.png\" alt=\"alternatetext\" style=\"width:50px;height:50px;padding-left: 5px;padding-right: 5px\"></b>\n"
    		  		+ "        <a style='color: white'>Perfios Bank</a>\n"
    		  		+ "	    <a href=\"Home.jsp\">Home</a>\n"
    		  		+ "	    <a href=\"Signup.jsp\">Signup</a>\n"
    		  		+ "	    <a class=\"active\" href=\"Login.jsp\">Login</a>\n"
    		  		+ "	    <a href=\"About.jsp\">About</a>\n"
    		  		+ "	</div>\n"
    		  		+ "</body>");
    		  break;
    	  case "About":
    		  out.print("<body>\n"
    		  		+ "	<div class=\"topnav\">\n"
    		  		+ "        <b><img src=\"image/bank.png\" alt=\"alternatetext\" style=\"width:50px;height:50px;padding-left: 5px;padding-right: 5px\"></b>\n"
    		  		+ "        <a style='color: white'>Perfios Bank</a>\n"
    		  		+ "	    <a href=\"Home.jsp\">Home</a>\n"
    		  		+ "	    <a href=\"Signup.jsp\">Signup</a>\n"
    		  		+ "	    <a href=\"Login.jsp\">Login</a>\n"
    		  		+ "	    <a class=\"active\" href=\"About.jsp\">About</a>\n"
    		  		+ "	</div>\n"
    		  		+ "</body>");
    		  break;
    	  default:
    		  
    	  }
      }
      catch(Exception e)
      {
    	  e.printStackTrace();
      }
      
	return SKIP_BODY;
  }
}