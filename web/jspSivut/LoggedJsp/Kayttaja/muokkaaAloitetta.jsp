<%-- 
    Document   : muokkaaAloitetta
    Created on : 8.12.2017, 11:17:53
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
        <title>Muokkaa aloitetta</title>
        <link rel="shortcut icon" href="/Aloitelaatikko_ver2/jspSivut/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <nav class="navbar navbar-expand-sm navbar-dark">
            <!-- Brand/logo -->
            <a href="muokkaaAloitetta.jsp" class="navbar-brand"><img src="/Aloitelaatikko_ver2/jspSivut/pahvilaatikko2.png"></a>
            <a class="navbar-brand" href="muokkaaAloitetta.jsp">Aloitelaatikko</a>

            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="../Kayttaja/tulostaAloitteetKayttaja.jsp">Palaa takaisin</a>
                </li>
            </ul>
        </nav>
        <%
            Tietovarasto tietovarasto = new Tietovarasto();

            String aloiteID = request.getParameter("aloiteID");
            String aloiteNimi = request.getParameter("aloitenimi");
            String aloiteKuvaus = request.getParameter("aloitekuvaus");
            String aloitePVM = request.getParameter("aloitePVM");
        %>
        <div class="container">
            <h1>Muokkaa aloitetta</h1>
            <form name="muokkaa" action="/Aloitelaatikko_ver2/muokkaaAloitetta" method="post">
                <input type="text" class="" name="aloitenimi" value="<%=aloiteNimi%>"><br>
                <textarea rows="10" cols="40" name="aloitekuvaus"><%=aloiteKuvaus%></textarea><br>
                <input type="submit" class="btn btn-warning" name="submit" value="Muokkaa">
                <input type="hidden" name="aloiteID" value='<%=aloiteID%>'>
            </form>
            <form name="poista" action="../Kayttaja/poistaAloite.jsp" method="post">
                <input class="btn btn-danger" type="submit" name="poista" value="Poista">
                <input type="hidden" name="aloiteID" value='<%=aloiteID%>'>
                <input type="hidden" name="aloitenimi" value='<%=aloiteNimi%>'>
                <input type="hidden" name="aloitekuvaus" value='<%=aloiteKuvaus%>'>
                <input type="hidden" name="aloitePVM" value='<%=aloitePVM%>'>
            </form>
        </div>

        <footer class="container-fluid footer text-center fixed-bottom">
            <p>Aloitelaatikko Made By Julius Kinnarinen (&copy;)</p>
        </footer>
    </body>
</html>
