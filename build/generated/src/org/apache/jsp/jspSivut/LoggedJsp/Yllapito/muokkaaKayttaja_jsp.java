package org.apache.jsp.jspSivut.LoggedJsp.Yllapito;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Tietovarastopakkaus.*;

public final class muokkaaKayttaja_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Muokkaa käyttäjätietoja</title>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"Aloitelaatikko_ver2/jspSivut/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            Tietovarasto tietovarasto = new Tietovarasto();

            String kayttajaID = request.getParameter("kayttajaID");
            String etunimi = request.getParameter("etunimi");
            String sukunimi = request.getParameter("sukunimi");
            String email = request.getParameter("email");
            String kayttajatunnus = request.getParameter("kayttajatunnus");
            String salasana = request.getParameter("salasana");
            String puhelin = request.getParameter("puhelin");
            String luontipaivays = request.getParameter("luontipaivays");
            String ryhma = request.getParameter("ryhma");
            
        
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1>Muokkaa aloitetta</h1>\r\n");
      out.write("            <form name=\"muokkaa\" action=\"/Aloitelaatikko_ver2/muokkaaKayttaja\" method=\"post\">\r\n");
      out.write("                <input type=\"text\" class=\"\" name=\"kayttajaID\" readonly value=\"");
      out.print(kayttajaID);
      out.write("\"><br>\r\n");
      out.write("                <input type=\"text\" class=\"\" name=\"etunimi\" value=\"");
      out.print(etunimi);
      out.write("\"><br>\r\n");
      out.write("                <input type=\"text\" class=\"\" name=\"sukunimi\" value=\"");
      out.print(sukunimi);
      out.write("\"><br>\r\n");
      out.write("                <input type=\"text\" class=\"\" name=\"email\" value=\"");
      out.print(email);
      out.write("\"><br>\r\n");
      out.write("                <input type=\"text\" class=\"\" name=\"kayttajatunnus\" value=\"");
      out.print(kayttajatunnus);
      out.write("\"><br>\r\n");
      out.write("                <input type=\"text\" class=\"\" name=\"salasana\" value=\"");
      out.print(salasana);
      out.write("\"><br>\r\n");
      out.write("                <input type=\"text\" class=\"\" name=\"puhelin\" value=\"");
      out.print(puhelin);
      out.write("\"><br>\r\n");
      out.write("                <input type=\"text\" class=\"\" name=\"luontipaivays\" readonly value=\"");
      out.print(luontipaivays);
      out.write("\"><br>\r\n");
      out.write("                <input type=\"text\" class=\"\" name=\"ryhma\" value=\"");
      out.print(ryhma);
      out.write("\"><br>\r\n");
      out.write("                \r\n");
      out.write("                <input class=\"btn btn-warning\" type=\"submit\" value=\"Muokkaa\">\r\n");
      out.write("            </form>\r\n");
      out.write("            <form name=\"poista\" action=\"/Aloitelaatikko_ver2/poistaKayttaja\" method=\"post\">\r\n");
      out.write("                <input class=\"btn btn-danger\" type=\"submit\" value=\"Poista\">\r\n");
      out.write("            </form>\r\n");
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
