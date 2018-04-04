package org.apache.jsp.jspSivut.LoggedJsp.Yllapito;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Tietovarastopakkaus.*;

public final class tulostaKayttajat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \r\n");
      out.write("        <link href=\"/Aloitelaatikko_ver2/CSS/signin.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"/Aloitelaatikko_ver2/CSS/style3.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                background-image: url(\"spagettikissa.jpg\");\r\n");
      out.write("                background-size: cover;\r\n");
      out.write("                color: black;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            table {\r\n");
      out.write("                background: rgba(255, 255, 255, 0.7) !important;\r\n");
      out.write("                border: 1px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .thKayttajaID {\r\n");
      out.write("                width: 10%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .theENimi {\r\n");
      out.write("                width: 15%;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .theSNimi {\r\n");
      out.write("                width: 15%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .thEmail {\r\n");
      out.write("                width: 15%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .thKayttajatunnus {\r\n");
      out.write("                width: 10%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .thSalasana {\r\n");
      out.write("                width: 15%\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .thPuhelin {\r\n");
      out.write("                width: 10%\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .thPVM {\r\n");
      out.write("                width: 5%\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .thRyhma{\r\n");
      out.write("                width: 5%\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .tdKuvaus {\r\n");
      out.write("                text-align: left !important;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .tdNimi {\r\n");
      out.write("                text-align: left !important;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .container {\r\n");
      out.write("                max-width: 80%;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <title>Käyttäjälista</title>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"/Aloitelaatikko_ver2/jspSivut/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            Tietovarasto tietovarasto = new Tietovarasto();
        
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1>Kaikki Käyttäjät</h1>\r\n");
      out.write("            <div class=\"table-responsive\">\r\n");
      out.write("                <table class=\"table table-striped\">\r\n");
      out.write("                    <thead class=\"thead-dark\">\r\n");
      out.write("                        <tr class=\"tr\">\r\n");
      out.write("                            <th class=\"thKayttajaID\">KayttajaID</th>\r\n");
      out.write("                            <th class=\"thENimi\">Etunimi</th>\r\n");
      out.write("                            <th class=\"thSNimi\">Sukunimi</th>\r\n");
      out.write("                            <th class=\"thEmail\">Email</th>\r\n");
      out.write("                            <th class=\"thKayttajatunnus\">Kayttajatunnus</th>\r\n");
      out.write("                            <th class=\"thSalasana\">Salasana</th>\r\n");
      out.write("                            <th class=\"thPuhelin\">Puhelin</th>\r\n");
      out.write("                            <th class=\"thPVM\">Luontipäiväys</th>\r\n");
      out.write("                            <th class=\"thRyhma\">Ryhmä</th>\r\n");
      out.write("                            <th class=\"\">Muokkaa</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        ");

                            for (Kayttaja kayttaja : tietovarasto.haeKaikkiKayttajat()) {
                        
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>");
      out.print( kayttaja.getKayttajaID());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( kayttaja.getEtunimi());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( kayttaja.getSukunimi());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( kayttaja.getEmail());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( kayttaja.getKayttajatunnus());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( kayttaja.getSalasana());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( kayttaja.getPuhelin());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( kayttaja.getLuontipaivays());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( kayttaja.getRyhma());
      out.write("</td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <form name=\"lisays\" action='../../LoggedJsp/Yllapito/muokkaaKayttaja.jsp?kayttajaID=");
      out.print(kayttaja.getKayttajaID());
      out.write("&etunimi=");
      out.print(kayttaja.getEtunimi());
      out.write("&sukunimi=");
      out.print(kayttaja.getSukunimi());
      out.write("&email=");
      out.print( kayttaja.getEmail());
      out.write("&kayttajatunnus=");
      out.print( kayttaja.getKayttajatunnus());
      out.write("&salasana=");
      out.print( kayttaja.getSalasana());
      out.write("&puhelin=");
      out.print( kayttaja.getPuhelin());
      out.write("&luontipaivays=");
      out.print( kayttaja.getLuontipaivays());
      out.write("&ryhma=");
      out.print( kayttaja.getRyhma());
      out.write("' method=\"post\">\r\n");
      out.write("                                    <input class=\"btn btn-warning\" type=\"submit\" value=\">\" name=\"muokkaa\">\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
 }
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
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
