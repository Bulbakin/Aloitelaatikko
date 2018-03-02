package org.apache.jsp.jspSivut.LoggedJsp.Kayttaja;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Tietovarastopakkaus.*;

public final class poistaAloite_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                background-color: #14cad4;\r\n");
      out.write("                color: black;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            table {\r\n");
      out.write("                background-color: white !important;\r\n");
      out.write("                border: 1px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <title>Poista aloite</title>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            Tietovarasto tietovarasto = new Tietovarasto();

            String aloiteID = request.getParameter("aloiteID");
            String aloiteNimi = request.getParameter("aloitenimi");
            String aloiteKuvaus = request.getParameter("aloitekuvaus");
            String pvm = request.getParameter("pvm");
        
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1>Poista aloite</h1>\r\n");
      out.write("            <div class=\"table-responsive\">\r\n");
      out.write("                <table class=\"table table-striped\">\r\n");
      out.write("                    <thead class=\"thead-dark\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>ID</th>\r\n");
      out.write("                            <th>Nimi</th>\r\n");
      out.write("                            <th>Kuvaus</th>\r\n");
      out.write("                            <th>Pvm</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>");
      out.print(aloiteID);
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(aloiteNimi);
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(aloiteKuvaus);
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(pvm);
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("                <form name=\"lisays\" action=\"../../Aloitelaatikko_ver2/poistaAloite\" method=\"post\">\r\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-danger\" name=\"submit\" value=\"Poista\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"aloiteID\" value='");
      out.print(aloiteID);
      out.write("'>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
