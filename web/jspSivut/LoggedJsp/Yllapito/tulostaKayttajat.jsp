<%-- 
    Document   : tulostaKayttajat
    Created on : 26.2.2018, 21:03:37
    Author     : Julius Kinnarinen
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

        <link href="/Aloitelaatikko_ver2/CSS/signin.css" rel="stylesheet" type="text/css"/>
        <link href="/Aloitelaatikko_ver2/CSS/style3.css" rel="stylesheet" type="text/css"/>
        <style>
            body {
                background-image: url("/Aloitelaatikko_ver2/jspSivut/spagettikissav3.jpg");
                background-size: cover;
                color: black;
                font-family: Comic Sans, cursive;
            }

            table {
                background: rgba(255, 255, 255, 0.7) !important;
                border: 1px;
                text-align: center;
            }

            .thKayttajaID {
                width: 10%;
            }

            .theENimi {
                width: 15%;
            }

            .theSNimi {
                width: 15%;
            }

            .thEmail {
                width: 15%;
            }

            .thKayttajatunnus {
                width: 10%;
            }

            .thSalasana {
                width: 15%
            }

            .thPuhelin {
                width: 10%
            }

            .thPVM {
                width: 5%
            }

            .thRyhma{
                width: 5%
            }

            .container {
                max-width: 80%;
            }
        </style>
        <title>Käyttäjälista</title>
        <link rel="shortcut icon" href="/Aloitelaatikko_ver2/jspSivut/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <nav class="navbar navbar-expand-sm navbar-dark">
            <!-- Brand/logo -->
            <a href="tulostaKayttajat.jsp" class="navbar-brand"><img src="/Aloitelaatikko_ver2/jspSivut/pahvilaatikko2.png"></a>
            <a class="navbar-brand" href="tulostaKayttajat.jsp">Aloitelaatikko</a>
        </nav>
        <%
            Tietovarasto tietovarasto = new Tietovarasto();
        %>
        <div class="container">
            <h1>Kaikki Käyttäjät</h1>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead class="thead-dark">
                        <tr class="tr">
                            <th class="thKayttajaID">KayttajaID</th>
                            <th class="thENimi">Etunimi</th>
                            <th class="thSNimi">Sukunimi</th>
                            <th class="thEmail">Email</th>
                            <th class="thKayttajatunnus">Kayttajatunnus</th>
                            <th class="thSalasana">Salasana</th>
                            <th class="thPuhelin">Puhelin</th>
                            <th class="thPVM">Luontipäiväys</th>
                            <th class="thRyhma">Ryhmä</th>
                            <th class="">Muokkaa</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for (Kayttaja kayttaja : tietovarasto.haeKaikkiKayttajat()) {
                        %>
                        <tr>
                            <td><%= kayttaja.getKayttajaID()%></td>
                            <td><%= kayttaja.getEtunimi()%></td>
                            <td><%= kayttaja.getSukunimi()%></td>
                            <td><%= kayttaja.getEmail()%></td>
                            <td><%= kayttaja.getKayttajatunnus()%></td>
                            <td><%= kayttaja.getSalasana()%></td>
                            <td><%= kayttaja.getPuhelin()%></td>
                            <td><%= kayttaja.getLuontipaivays()%></td>
                            <td><%= kayttaja.getRyhma()%></td>
                            <td>
                                <form name="lisays" action='../../LoggedJsp/Yllapito/muokkaaKayttaja.jsp?kayttajaID=<%=kayttaja.getKayttajaID()%>&etunimi=<%=kayttaja.getEtunimi()%>&sukunimi=<%=kayttaja.getSukunimi()%>&email=<%= kayttaja.getEmail()%>&kayttajatunnus=<%= kayttaja.getKayttajatunnus()%>&salasana=<%= kayttaja.getSalasana()%>&puhelin=<%= kayttaja.getPuhelin()%>&luontipaivays=<%= kayttaja.getLuontipaivays()%>&ryhma=<%= kayttaja.getRyhma()%>' method="post">
                                    <input class="btn btn-warning" type="submit" value=">" name="muokkaa">
                                </form>
                            </td>
                        </tr>
                        <% }%>
                </table>
            </div>
        </div>

        <footer class="container-fluid footer text-center fixed-bottom">
            <p>Aloitelaatikko Made By Julius Kinnarinen (&copy;)</p>
        </footer>
    </body>
</html>
