package org.apache.jsp.jspSivut.LoggedJsp.Kayttaja;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class etusivuKayttaja_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("        <link href=\"/Aloitelaatikko_ver2/CSS/signin.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"/Aloitelaatikko_ver2/CSS/style3.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                background-image: url(\"/Aloitelaatikko_ver2/jspSivut/spagettikissav2.jpg\");\r\n");
      out.write("                background-size: cover;\r\n");
      out.write("                color: black;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .btnSize {\r\n");
      out.write("                width: 300px;\r\n");
      out.write("                height: 60px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .formStyle {\r\n");
      out.write("                margin-top: 10px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("        <title>Käyttäjän etusivu</title>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"/Aloitelaatikko_ver2/jspSivut/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-md navbar-dark\">\r\n");
      out.write("            <!-- Brand -->\r\n");
      out.write("            <a href=\"etusivuKayttaja.jsp\" class=\"navbar-brand\"><img src=\"/Aloitelaatikko_ver2/jspSivut/pahvilaatikko2.png\"></a>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"etusivuKayttaja.jsp\">Aloitelaatikko</a>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"navbar-nav\">\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Ota yhteyttä ylläpitoon</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("        \r\n");
      out.write("        <form class=\"formStyle\" name=\"lisaaAloite\" action=\"lisaaAloite.jsp\">\r\n");
      out.write("            <input type=\"submit\" class=\"btn btn-primary btnSize\" value=\"Lisää aloite\" name=\"submit\">\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <form class=\"formStyle\" name=\"tulostaAloitteet\" action=\"tulostaAloitteetKayttaja.jsp\">\r\n");
      out.write("            <input type=\"submit\" class=\"btn btn-primary btnSize\" value=\"Omat Aloitteet\" name=\"tulostaAloitteet\">\r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("        <form class=\"formStyle\" name=\"tulostaKaikkiAloitteet\" action=\"tulostaAloitteet.jsp\">\r\n");
      out.write("            <input type=\"submit\" class=\"btn btn-primary btnSize\" value=\"Kaikki Aloitteet\" name=\"tulostaKaikkiAloitteet\">\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <form class=\"formStyle\" name=\"kirjauduUlos\" action=\"/Aloitelaatikko_ver2/jspSivut/index.jsp\">\r\n");
      out.write("            <input type=\"submit\" class=\"btn btn-primary btnSize\" value=\"Kirjaudu ulos\" name=\"kirjauduUlos\">\r\n");
      out.write("            ");
session.invalidate();
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("        <footer class=\"container-fluid footer text-center fixed-bottom\">\r\n");
      out.write("            <p>Aloitelaatikko Made By Julius Kinnarinen (&copy;)</p>\r\n");
      out.write("        </footer>\r\n");
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
