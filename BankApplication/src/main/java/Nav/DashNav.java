package Nav;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class DashNav extends TagSupport
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
    	  out.print("<style>\n"
    	  		+ "ul \n"
    	  		+ "{\n"
    	  		+ "  list-style-type: none;\n"
    	  		+ "  margin: 0;\n"
    	  		+ "  padding: 0;\n"
    	  		+ "  width: 15%;\n"
    	  		+ "  background-color: #f1f1f1;\n"
    	  		+ "  height: 100%; /* Full height */\n"
    	  		+ "  position: fixed; /* Make it stick, even on scroll */\n"
    	  		+ "  overflow: auto; /* Enable scrolling if the sidenav has too much content */\n"
    	  		+ "}\n"
    	  		+ "li a {\n"
    	  		+ "  display: block;\n"
    	  		+ "  color: #000;\n"
    	  		+ "  padding: 20px 20px;\n"
    	  		+ "  text-decoration: none;\n"
    	  		+ "  font-size: 20px;\n"
    	  		+ "}\n"
    	  		+ "\n"
    	  		+ "li a.active {\n"
    	  		+ "  background-color: #04AA6D;\n"
    	  		+ "  color: white;\n"
    	  		+ "}\n"
    	  		+ "\n"
    	  		+ "li a:hover:not(.active) {\n"
    	  		+ "  background-color: #555;\n"
    	  		+ "  color: white;\n"
    	  		+ "}\n"
    	  		+ "\n"
    	  		+ ".topnav {\n"
    	  		+ "  background-color: #f1f1f1;\n"
    	  		+ "  overflow: hidden;\n"
    	  		+ "}\n"
    	  		+ "\n"
    	  		+ "/* Style the links inside the navigation bar */\n"
    	  		+ ".topnav a {\n"
    	  		+ "  float: left;\n"
    	  		+ "  color: black;\n"
    	  		+ "  text-align: center;\n"
    	  		+ "  padding: 14px 16px;\n"
    	  		+ "  text-decoration: none;\n"
    	  		+ "  font-size: 25px;\n"
    	  		+ "}\n"
    	  		+ "\n"
    	  		+ "/* Change the color of links on hover */\n"
    	  		+ ".topnav a:hover {\n"
    	  		+ "  background-color: #555;\n"
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
    	  case "Dash":
    		  out.print("<body>\n"
    		  		+ "	<div class=\"topnav\">\n"
    		  		+ "	<b>\n"
    		  		+ "		<img src=\"bank.png\" alt=\"alternatetext\" style=\"width:50px;height:50px;\">\n"
    		  		+ "	</b>\n"
    		  		+ "	\n"
    		  		+ "	<a>Perfios Bank</a>\n"
    		  		+ "	  <div style=\"padding:0.5%; float:right\">\n"
    		  		+ "	  <a href=\"Home.html\" style=\"padding: 1px;background-color: rgb(164, 0, 0);\">Logout</a>\n"
    		  		+ "	  </div>\n"
    		  		+ "	</div>\n"
    		  		+ "	<div>\n"
    		  		+ "		<ul>\n"
    		  		+ "		  <li><a href=\"Dashboard.jsp\" class=\"active\">Dashboard</a></li>\n"
    		  		+ "		  <li><a href=\"CheckBal.jsp\">Check Balance</a></li>\n"
    		  		+ "		  <li><a href=\"Deposit.jsp\">Deposit</a></li>\n"
    		  		+ "		  <li><a href=\"Withdraw.jsp\">Withdraw</a></li>\n"
    		  		+ "		  <li><a href=\"Transfer.jsp\">Transfer</a></li>\n"
    		  		+ "		  <li><a href=\"Password.jsp\">Change Password</a></li>\n"
    		  		+ "		  <li><a href=\"DeleteAcc.jsp\">Delete Account</a></li>\n"
    		  		+ "		</ul>\n"
    		  		+ "	</div>\n"
    		  		+ "</body>");
    		  break;
    	  case "Balance":
    		  out.print("<body>\n"
      		  		+ "	<div class=\"topnav\">\n"
      		  		+ "	<b>\n"
      		  		+ "		<img src=\"bank.png\" alt=\"alternatetext\" style=\"width:50px;height:50px;\">\n"
      		  		+ "	</b>\n"
      		  		+ "	\n"
      		  		+ "	<a>Perfios Bank</a>\n"
      		  		+ "	  <div style=\"padding:0.5%; float:right\">\n"
      		  		+ "	  <a href=\"Home.html\" style=\"padding: 1px;background-color: rgb(164, 0, 0);\">Logout</a>\n"
      		  		+ "	  </div>\n"
      		  		+ "	</div>\n"
      		  		+ "	<div>\n"
      		  		+ "		<ul>\n"
      		  		+ "		  <li><a href=\"Dashboard.jsp\">Dashboard</a></li>\n"
      		  		+ "		  <li><a href=\"CheckBal.jsp\" class=\"active\">Check Balance</a></li>\n"
      		  		+ "		  <li><a href=\"Deposit.jsp\">Deposit</a></li>\n"
      		  		+ "		  <li><a href=\"Withdraw.jsp\">Withdraw</a></li>\n"
      		  		+ "		  <li><a href=\"Transfer.jsp\">Transfer</a></li>\n"
      		  		+ "		  <li><a href=\"Password.jsp\">Change Password</a></li>\n"
      		  		+ "		  <li><a href=\"DeleteAcc.jsp\">Delete Account</a></li>\n"
      		  		+ "		</ul>\n"
      		  		+ "	</div>\n"
      		  		+ "</body>");
      		  break;
    	  case "Deposit":
    		  out.print("<body>\n"
      		  		+ "	<div class=\"topnav\">\n"
      		  		+ "	<b>\n"
      		  		+ "		<img src=\"bank.png\" alt=\"alternatetext\" style=\"width:50px;height:50px;\">\n"
      		  		+ "	</b>\n"
      		  		+ "	\n"
      		  		+ "	<a>Perfios Bank</a>\n"
      		  		+ "	  <div style=\"padding:0.5%; float:right\">\n"
      		  		+ "	  <a href=\"Home.html\" style=\"padding: 1px;background-color: rgb(164, 0, 0);\">Logout</a>\n"
      		  		+ "	  </div>\n"
      		  		+ "	</div>\n"
      		  		+ "	<div>\n"
      		  		+ "		<ul>\n"
      		  		+ "		  <li><a href=\"Dashboard.jsp\">Dashboard</a></li>\n"
      		  		+ "		  <li><a href=\"CheckBal.jsp\">Check Balance</a></li>\n"
      		  		+ "		  <li><a href=\"Deposit.jsp\" class=\"active\">Deposit</a></li>\n"
      		  		+ "		  <li><a href=\"Withdraw.jsp\">Withdraw</a></li>\n"
      		  		+ "		  <li><a href=\"Transfer.jsp\">Transfer</a></li>\n"
      		  		+ "		  <li><a href=\"Password.jsp\">Change Password</a></li>\n"
      		  		+ "		  <li><a href=\"DeleteAcc.jsp\">Delete Account</a></li>\n"
      		  		+ "		</ul>\n"
      		  		+ "	</div>\n"
      		  		+ "</body>");
      		  break;
    	  case "Withdraw":
    		  out.print("<body>\n"
      		  		+ "	<div class=\"topnav\">\n"
      		  		+ "	<b>\n"
      		  		+ "		<img src=\"bank.png\" alt=\"alternatetext\" style=\"width:50px;height:50px;\">\n"
      		  		+ "	</b>\n"
      		  		+ "	\n"
      		  		+ "	<a>Perfios Bank</a>\n"
      		  		+ "	  <div style=\"padding:0.5%; float:right\">\n"
      		  		+ "	  <a href=\"Home.html\" style=\"padding: 1px;background-color: rgb(164, 0, 0);\">Logout</a>\n"
      		  		+ "	  </div>\n"
      		  		+ "	</div>\n"
      		  		+ "	<div>\n"
      		  		+ "		<ul>\n"
      		  		+ "		  <li><a href=\"Dashboard.jsp\">Dashboard</a></li>\n"
      		  		+ "		  <li><a href=\"CheckBal.jsp\">Check Balance</a></li>\n"
      		  		+ "		  <li><a href=\"Deposit.jsp\">Deposit</a></li>\n"
      		  		+ "		  <li><a href=\"Withdraw.jsp\" class=\"active\">Withdraw</a></li>\n"
      		  		+ "		  <li><a href=\"Transfer.jsp\">Transfer</a></li>\n"
      		  		+ "		  <li><a href=\"Password.jsp\">Change Password</a></li>\n"
      		  		+ "		  <li><a href=\"DeleteAcc.jsp\">Delete Account</a></li>\n"
      		  		+ "		</ul>\n"
      		  		+ "	</div>\n"
      		  		+ "</body>");
      		  break;
    	  case "Transfer":
    		  out.print("<body>\n"
      		  		+ "	<div class=\"topnav\">\n"
      		  		+ "	<b>\n"
      		  		+ "		<img src=\"bank.png\" alt=\"alternatetext\" style=\"width:50px;height:50px;\">\n"
      		  		+ "	</b>\n"
      		  		+ "	\n"
      		  		+ "	<a>Perfios Bank</a>\n"
      		  		+ "	  <div style=\"padding:0.5%; float:right\">\n"
      		  		+ "	  <a href=\"Home.html\" style=\"padding: 1px;background-color: rgb(164, 0, 0);\">Logout</a>\n"
      		  		+ "	  </div>\n"
      		  		+ "	</div>\n"
      		  		+ "	<div>\n"
      		  		+ "		<ul>\n"
      		  		+ "		  <li><a href=\"Dashboard.jsp\">Dashboard</a></li>\n"
      		  		+ "		  <li><a href=\"CheckBal.jsp\">Check Balance</a></li>\n"
      		  		+ "		  <li><a href=\"Deposit.jsp\">Deposit</a></li>\n"
      		  		+ "		  <li><a href=\"Withdraw.jsp\">Withdraw</a></li>\n"
      		  		+ "		  <li><a href=\"Transfer.jsp\" class=\"active\">Transfer</a></li>\n"
      		  		+ "		  <li><a href=\"Password.jsp\">Change Password</a></li>\n"
      		  		+ "		  <li><a href=\"DeleteAcc.jsp\">Delete Account</a></li>\n"
      		  		+ "		</ul>\n"
      		  		+ "	</div>\n"
      		  		+ "</body>");
      		  break;
    	  case "Password":
    		  out.print("<body>\n"
      		  		+ "	<div class=\"topnav\">\n"
      		  		+ "	<b>\n"
      		  		+ "		<img src=\"bank.png\" alt=\"alternatetext\" style=\"width:50px;height:50px;\">\n"
      		  		+ "	</b>\n"
      		  		+ "	\n"
      		  		+ "	<a>Perfios Bank</a>\n"
      		  		+ "	  <div style=\"padding:0.5%; float:right\">\n"
      		  		+ "	  <a href=\"Home.html\" style=\"padding: 1px;background-color: rgb(164, 0, 0);\">Logout</a>\n"
      		  		+ "	  </div>\n"
      		  		+ "	</div>\n"
      		  		+ "	<div>\n"
      		  		+ "		<ul>\n"
      		  		+ "		  <li><a href=\"Dashboard.jsp\">Dashboard</a></li>\n"
      		  		+ "		  <li><a href=\"CheckBal.jsp\">Check Balance</a></li>\n"
      		  		+ "		  <li><a href=\"Deposit.jsp\">Deposit</a></li>\n"
      		  		+ "		  <li><a href=\"Withdraw.jsp\">Withdraw</a></li>\n"
      		  		+ "		  <li><a href=\"Transfer.jsp\">Transfer</a></li>\n"
      		  		+ "		  <li><a href=\"Password.jsp\" class=\"active\">Change Password</a></li>\n"
      		  		+ "		  <li><a href=\"DeleteAcc.jsp\">Delete Account</a></li>\n"
      		  		+ "		</ul>\n"
      		  		+ "	</div>\n"
      		  		+ "</body>");
      		  break;
    	  case "Delete":
    		  out.print("<body>\n"
      		  		+ "	<div class=\"topnav\">\n"
      		  		+ "	<b>\n"
      		  		+ "		<img src=\"bank.png\" alt=\"alternatetext\" style=\"width:50px;height:50px;\">\n"
      		  		+ "	</b>\n"
      		  		+ "	\n"
      		  		+ "	<a>Perfios Bank</a>\n"
      		  		+ "	  <div style=\"padding:0.5%; float:right\">\n"
      		  		+ "	  <a href=\"Home.html\" style=\"padding: 1px;background-color: rgb(164, 0, 0);\">Logout</a>\n"
      		  		+ "	  </div>\n"
      		  		+ "	</div>\n"
      		  		+ "	<div>\n"
      		  		+ "		<ul>\n"
      		  		+ "		  <li><a href=\"Dashboard.jsp\">Dashboard</a></li>\n"
      		  		+ "		  <li><a href=\"CheckBal.jsp\">Check Balance</a></li>\n"
      		  		+ "		  <li><a href=\"Deposit.jsp\">Deposit</a></li>\n"
      		  		+ "		  <li><a href=\"Withdraw.jsp\">Withdraw</a></li>\n"
      		  		+ "		  <li><a href=\"Transfer.jsp\">Transfer</a></li>\n"
      		  		+ "		  <li><a href=\"Password.jsp\">Change Password</a></li>\n"
      		  		+ "		  <li><a href=\"DeleteAcc.jsp\" class=\"active\">Delete Account</a></li>\n"
      		  		+ "		</ul>\n"
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