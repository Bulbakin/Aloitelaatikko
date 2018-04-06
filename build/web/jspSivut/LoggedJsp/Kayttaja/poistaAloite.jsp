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
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>

        <link href="/Aloitelaatikko_ver2/CSS/signin.css" rel="stylesheet" type="text/css"/>
        <link href="/Aloitelaatikko_ver2/CSS/style3.css" rel="stylesheet" type="text/css"/>
        <style>
            body {
                background-color: #14cad4;
                color: black;
                font-family: Comic Sans, cursive;
            }

            table {
                background-color: white !important;
                border: 1px;
            }
        </style>
        <title>Poista aloite</title>
        <link rel="shortcut icon" href="/Aloitelaatikko_ver2/jspSivut/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <nav class="navbar navbar-expand-sm navbar-dark">
            <!-- Brand/logo -->
            <a href="poistaAloite.jsp" class="navbar-brand"><img src="/Aloitelaatikko_ver2/jspSivut/pahvilaatikko2.png"></a>
            <a class="navbar-brand" href="poistaAloite.jsp">Aloitelaatikko</a>

            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="../Kayttaja/etusivuKayttaja.jsp">Palaa etusivulle</a>
                </li>
            </ul>
        </nav>
        <%
            Tietovarasto tietovarasto = new Tietovarasto();

            String aloiteID = request.getParameter("aloiteID");
            String aloiteNimi = request.getParameter("aloitenimi");
            String aloiteKuvaus = request.getParameter("aloitekuvaus");
            String pvm = request.getParameter("aloitePVM");
        %>
        <div class="container">
            <h1>Poista aloite</h1>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead class="thead-dark">
                        <tr>
                            <th>ID</th>
                            <th>Nimi</th>
                            <th>Kuvaus</th>
                            <th>Pvm</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td><%=aloiteID%></td>
                            <td><%=aloiteNimi%></td>
                            <td><%=aloiteKuvaus%></td>
                            <td><%=pvm%></td>
                        </tr>
                    </tbody>
                </table>
                <form name="lisays" action="/Aloitelaatikko_ver2/poistaAloite" method="post">
                    <input type="submit" class="btn btn-danger" name="submit" value="Poista">
                    <input type="hidden" name="aloiteID" value='<%=aloiteID%>'>
                </form>
            </div>
        </div>

        <footer class="container-fluid footer text-center fixed-bottom">
            <p>Aloitelaatikko Made By Julius Kinnarinen (&copy;)</p>
        </footer>
    </body>
</html>
