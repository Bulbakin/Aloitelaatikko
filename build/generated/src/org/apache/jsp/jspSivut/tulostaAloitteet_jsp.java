package org.apache.jsp.jspSivut;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Tietovarastopakkaus.*;

public final class tulostaAloitteet_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background-image: url(\"spagettikissa.jpg\");\n");
      out.write("                background-size: cover;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table {\n");
      out.write("                background: rgba(255, 255, 255, 0.7) !important;\n");
      out.write("                border: 1px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .thAloiteID {\n");
      out.write("                width: 5%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .thNimi {\n");
      out.write("                width: 15%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .thKuvaus {\n");
      out.write("                width: 50%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .thPVM {\n");
      out.write("                width: 10%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .thKayttajaID {\n");
      out.write("                width: 5%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .thPoista {\n");
      out.write("                width: 5%\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .thVaihe {\n");
      out.write("                width: 5%\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .tdKuvaus {\n");
      out.write("                text-align: left !important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .tdNimi {\n");
      out.write("                text-align: left !important;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>Aloitteiden Haku</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\" type=\"image/x-icon\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Tietovarasto tietovarasto = new Tietovarasto();
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Kaikki aloitteet</h1>\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <table class=\"table table-striped\">\n");
      out.write("                    <thead class=\"thead-dark\">\n");
      out.write("                        <tr class=\"tr\">\n");
      out.write("                            <th class=\"thAloiteID\">AloiteID</th>\n");
      out.write("                            <th class=\"thNimi\">Aloite</th>\n");
      out.write("                            <th class=\"thKuvaus\">Kuvaus</th>\n");
      out.write("                            <th class=\"thPVM\">Pvm</th>\n");
      out.write("                            <th class=\"thKayttajaID\">KäyttäjäID</th>\n");
      out.write("                            <th class=\"thPoista\">Poista</th>\n");
      out.write("                            <th class=\"vaihe\">Vaihe</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                            String vaihe = "";
                            for (Aloite aloite : tietovarasto.haeKaikkiAloitteet()) {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print( aloite.getAloiteID());
      out.write("</td>\n");
      out.write("                            ");
 if (!tietovarasto.toimenpideTehty(aloite.getAloiteID())) {
      out.write("\n");
      out.write("                            <td class=\"tdNimi\"><a href=\"lisaaToimenpide.jsp?aloiteID=");
      out.print(aloite.getAloiteID());
      out.write("&aloitekuvaus=");
      out.print( aloite.getAloitekuvaus());
      out.write('"');
      out.write('>');
      out.print(aloite.getAloitenimi());
      out.write("</a></td>\n");
      out.write("                                ");
} else {
      out.write("\n");
      out.write("                            <td class=\"tdNimi\">");
      out.print(aloite.getAloitenimi());
      out.write("</td>\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("                            <td class=\"tdKuvaus\">");
      out.print( aloite.getAloitekuvaus());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( aloite.getPvm());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( aloite.getKayttajaID());
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("                                <form name=\"lisays\" action='../../Aloitelaatikko_ver2/jspSivut/poistaAloite.jsp?aloiteID=");
      out.print(aloite.getAloiteID());
      out.write("&aloitenimi=");
      out.print(aloite.getAloitenimi());
      out.write("&aloitekuvaus=");
      out.print(aloite.getAloitekuvaus());
      out.write("&pvm=");
      out.print( aloite.getPvm());
      out.write("' method=\"post\">\n");
      out.write("                                    <input class=\"btn btn-danger\" type=\"submit\" value=\"X\" name=\"delete\">\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                                ");
 if (tietovarasto.toimenpideTehty(aloite.getAloiteID())) {
      out.write("\n");
      out.write("                                ");

                                    vaihe = Tietovarasto.getVaihe();
                                    if (vaihe.equals("1")) {
                                
      out.write("\n");
      out.write("                            <td>-</td>\n");
      out.write("                            ");

                            } else if (vaihe.equals("2")) {
                            
      out.write("\n");
      out.write("                    <td>Huomioitu</td>\n");
      out.write("                    ");

                    } else if (vaihe.equals("3")) {
                    
      out.write("\n");
      out.write("                    <td>Työn alla</td>\n");
      out.write("                    ");

                    } else {
                    
      out.write("\n");
      out.write("                    <td>Työn alla</td>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 } else { 
      out.write("\n");
      out.write("                    <td>-</td>\n");
      out.write("                    ");
 } } 
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
