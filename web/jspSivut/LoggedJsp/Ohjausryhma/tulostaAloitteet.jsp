<%-- 
    Document   : tulostaAloitteet
    Created on : 24.11.2017, 13:50:24
    Author     : s1601382
--%>
<%@page import="Tietovarastopakkaus.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
        <style>
            body {
                background-image: url("spagettikissa.jpg");
                background-size: cover;
                color: black;
            }

            table {
                background: rgba(255, 255, 255, 0.7) !important;
                border: 1px;
                text-align: center;
            }

            .thAloiteID {
                width: 5%;
            }

            .thNimi {
                width: 15%;
            }

            .thKuvaus {
                width: 50%;
            }

            .thPVM {
                width: 10%;
            }

            .thKayttajaID {
                width: 5%;
            }

            .thPoista {
                width: 5%
            }

            .thVaihe {
                width: 5%
            }

            .tdKuvaus {
                text-align: left !important;
            }

            .tdNimi {
                text-align: left !important;
            }
        </style>
        <title>Aloitteiden Haku</title>
        <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
    </head>
    <body>
        <%
            Tietovarasto tietovarasto = new Tietovarasto();
        %>
        <div class="container">
            <h1>Kaikki aloitteet</h1>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead class="thead-dark">
                        <tr class="tr">
                            <th class="thAloiteID">AloiteID</th>
                            <th class="thNimi">Aloite</th>
                            <th class="thKuvaus">Kuvaus</th>
                            <th class="thPVM">Pvm</th>
                            <th class="thKayttajaID">KäyttäjäID</th>
                            <th class="thPoista">Poista</th>
                            <th class="vaihe">Vaihe</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            String vaihe = "";
                            for (Aloite aloite : tietovarasto.haeKaikkiAloitteet()) {
                        %>
                        <tr>
                            <td><%= aloite.getAloiteID()%></td>
                            <% if (!tietovarasto.toimenpideTehty(aloite.getAloiteID())) {%>
                            <td class="tdNimi"><a href="lisaaToimenpide.jsp?aloiteID=<%=aloite.getAloiteID()%>&aloitekuvaus=<%= aloite.getAloitekuvaus()%>"><%=aloite.getAloitenimi()%></a></td>
                                <%} else {%>
                            <td class="tdNimi"><%=aloite.getAloitenimi()%></td>
                            <% }%>
                            <td class="tdKuvaus"><%= aloite.getAloitekuvaus()%></td>
                            <td><%= aloite.getPvm()%></td>
                            <td><%= aloite.getKayttajaID()%></td>
                            <td>
                                <form name="lisays" action='../../Aloitelaatikko_ver2/jspSivut/poistaAloite.jsp?aloiteID=<%=aloite.getAloiteID()%>&aloitenimi=<%=aloite.getAloitenimi()%>&aloitekuvaus=<%=aloite.getAloitekuvaus()%>&pvm=<%= aloite.getPvm()%>' method="post">
                                    <input class="btn btn-danger" type="submit" value="X" name="delete">
                                </form>
                            </td>
                                <% if (tietovarasto.toimenpideTehty(aloite.getAloiteID())) {%>
                                <%
                                    vaihe = Tietovarasto.getVaihe();
                                    if (vaihe.equals("1")) {
                                %>
                            <td>-</td>
                            <%
                            } else if (vaihe.equals("2")) {
                            %>
                    <td>Huomioitu</td>
                    <%
                    } else if (vaihe.equals("3")) {
                    %>
                    <td>Työn alla</td>
                    <%
                    } else {
                    %>
                    <td>Työn alla</td>
                    <% } %>
                    </tr>
                    <% } else { %>
                    <td>-</td>
                    <% } } %>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
