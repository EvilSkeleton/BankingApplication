package Nav;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Footer extends TagSupport
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
			 		+ "<meta charset=\"UTF-8\">\n"
			 		+ "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n"
			 		+ "<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n"
			 		+ "<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n"
			 		+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n"
			 		+ "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\"/>\n"
			 		+ "<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap\"/>\n"
			 		+ "<link rel=\"stylesheet\" href=\"../../../css/mdb.min.css\" />\n"
			 		+ "</head>");
			 
			 out.print("<body>\n"
			 		+ "<footer class=\"text-center text-lg-start bg-light text-muted\">\n"
			 		+ "  <section class=\"d-flex justify-content-center justify-content-lg-between p-4 border-bottom\">\n"
			 		+ "    <div class=\"me-5 d-none d-lg-block\">\n"
			 		+ "      <span>Get connected with us on social networks:</span>\n"
			 		+ "    </div>\n"
			 		+ "    <div>\n"
			 		+ "      <a href=\"https://www.facebook.com/\" class=\"me-4 text-reset\">\n"
			 		+ "        <i class=\"fab fa-facebook-f\"></i>\n"
			 		+ "      </a>\n"
			 		+ "      <a href=\"https://twitter.com/\" class=\"me-4 text-reset\">\n"
			 		+ "        <i class=\"fab fa-twitter\"></i>\n"
			 		+ "      </a>\n"
			 		+ "      <a href=\"https://www.google.co.in/\" class=\"me-4 text-reset\">\n"
			 		+ "        <i class=\"fab fa-google\"></i>\n"
			 		+ "      </a>\n"
			 		+ "      <a href=\"https://www.instagram.com/\" class=\"me-4 text-reset\">\n"
			 		+ "        <i class=\"fab fa-instagram\"></i>\n"
			 		+ "      </a>\n"
			 		+ "      <a href=\"https://www.linkedin.com/\" class=\"me-4 text-reset\">\n"
			 		+ "        <i class=\"fab fa-linkedin\"></i>\n"
			 		+ "      </a>\n"
			 		+ "      <a href=\"https://github.com/\" class=\"me-4 text-reset\">\n"
			 		+ "        <i class=\"fab fa-github\"></i>\n"
			 		+ "      </a>\n"
			 		+ "    </div>\n"
			 		+ "  </section>\n"
			 		+ "  <section class=\"\">\n"
			 		+ "    <div class=\"container text-center text-md-start mt-5\">\n"
			 		+ "      <div class=\"row mt-3\">\n"
			 		+ "        <div class=\"col-md-3 col-lg-4 col-xl-3 mx-auto mb-4\">\n"
			 		+ "          <h6 class=\"text-uppercase fw-bold mb-4\">\n"
			 		+ "            <i class=\"fas fa-gem me-3\"></i>Bombay Bank\n"
			 		+ "          </h6>\n"
			 		+ "          <p>\n"
			 		+ "            At Bombay Bank we believe that 'Good Ecology is Good Economics'. \n"
			 		+ "            We will continue to create value for all our stakeholders and emerge as a 'Best-in-Class' Bank that is committed to sustainable economic growth.\n"
			 		+ "          </p>\n"
			 		+ "        </div>\n"
			 		+ "        <div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto mb-4\">\n"
			 		+ "          <h6 class=\"text-uppercase fw-bold mb-4\">\n"
			 		+ "            Products\n"
			 		+ "          </h6>\n"
			 		+ "          <p>\n"
			 		+ "            <a href=\"#!\" class=\"text-reset\">On-Site Banking</a>\n"
			 		+ "          </p>\n"
			 		+ "          <p>\n"
			 		+ "            <a href=\"#!\" class=\"text-reset\">Reactive Support</a>\n"
			 		+ "          </p>\n"
			 		+ "          <p>\n"
			 		+ "            <a href=\"#!\" class=\"text-reset\">Security</a>\n"
			 		+ "          </p>\n"
			 		+ "          <p>\n"
			 		+ "            <a href=\"#!\" class=\"text-reset\">Cash</a>\n"
			 		+ "          </p>\n"
			 		+ "        </div>\n"
			 		+ "        <div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto mb-4\">\n"
			 		+ "          <h6 class=\"text-uppercase fw-bold mb-4\">\n"
			 		+ "            Useful links\n"
			 		+ "          </h6>\n"
			 		+ "          <p>\n"
			 		+ "            <a href=\"#!\" class=\"text-reset\">Pricing</a>\n"
			 		+ "          </p>\n"
			 		+ "          <p>\n"
			 		+ "            <a href=\"#!\" class=\"text-reset\">Settings</a>\n"
			 		+ "          </p>\n"
			 		+ "          <p>\n"
			 		+ "            <a href=\"#!\" class=\"text-reset\">Orders</a>\n"
			 		+ "          </p>\n"
			 		+ "          <p>\n"
			 		+ "            <a href=\"#!\" class=\"text-reset\">Help</a>\n"
			 		+ "          </p>\n"
			 		+ "        </div>\n"
			 		+ "        <div class=\"col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4\">\n"
			 		+ "          <h6 class=\"text-uppercase fw-bold mb-4\">Contact</h6>\n"
			 		+ "          <p><i class=\"fas fa-home me-3\"></i> Koromangala, Bengaluru-560025</p>\n"
			 		+ "          <p>\n"
			 		+ "            <i class=\"fas fa-envelope me-3\"></i>\n"
			 		+ "            rohit.daniel@perfios.com\n"
			 		+ "          </p>\n"
			 		+ "          <p><i class=\"fas fa-phone me-3\"></i> + 91 234 567 88</p>\n"
			 		+ "          <p><i class=\"fas fa-print me-3\"></i> + 91 234 567 89</p>\n"
			 		+ "        </div>\n"
			 		+ "      </div>\n"
			 		+ "    </div>\n"
			 		+ "  </section>\n"
			 		+ "  <div class=\"text-center p-4\" style=\"background-color: rgba(0, 0, 0, 0.05);\">\n"
			 		+ "    © 2021 Copyright:\n"
			 		+ "    <a class=\"text-reset fw-bold\" href=\"https://github.com/rohit-athaide\">Rohit Athaide</a>\n"
			 		+ "  </div>\n"
			 		+ "</footer>\n"
			 		+ "</body>");
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 return SKIP_BODY;
    }
}