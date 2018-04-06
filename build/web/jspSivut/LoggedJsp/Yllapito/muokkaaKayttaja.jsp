<%-- 
    Document   : muokkaaKayttaja
    Created on : 26.2.2018, 20:58:59
    Author     : Julius Kinnarinen
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
                font-size: 14px;
            }

            H1 {
                text-align: center;
            }
            
            .inputSize {
                height: 40px;
            }
        </style>
        <title>Muokkaa käyttäjätietoja</title>
        <link rel="shortcut icon" href="/Aloitelaatikko_ver2/jspSivut/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <nav class="navbar navbar-expand-sm navbar-dark">
            <!-- Brand/logo -->
            <a href="" class="navbar-brand"><img src="/Aloitelaatikko_ver2/jspSivut/pahvilaatikko2.png"></a>
            <a class="navbar-brand" href="">Aloitelaatikko</a>

            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="tulostaKayttajat.jsp">Palaa</a>
                </li>
            </ul>
        </nav>
        <%
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

        %>
        <div class="container customDiv">
            <h1>Muokkaa Käyttäjätietoja</h1>
            <form class="form-signin" name="muokkaa" action="/Aloitelaatikko_ver2/muokkaaKayttaja">
                KäyttäjäID:<input class="form-control" type="text" name="kayttajaID" readonly value="<%=kayttajaID%>">
                Etunimi:<input class="form-control" type="text" name="etunimi" value="<%=etunimi%>">
                Sukunimi:<input class="form-control" type="text" name="sukunimi" value="<%=sukunimi%>">
                Email:<input class="form-control" type="text" name="email" value="<%=email%>">
                Käyttäjätunnus:<input class="form-control" type="text" name="kayttajatunnus" value="<%=kayttajatunnus%>">
                Salasana:<input class="form-control" type="text" name="salasana" value="<%=salasana%>">
                Puhelin:<input class="form-control" type="text" name="puhelin" value="<%=puhelin%>">
                Luontipäiväys:<input class="form-control" type="text" name="luontipaivays" readonly value="<%=luontipaivays%>">
                Ryhmä:<input class="form-control" type="text" name="ryhma" value="<%=ryhma%>">

                <input type="submit" class="btn btn-warning" name="muokkaa" value="Muokkaa">
            </form>
            <form class="container customDiv" name="poista" action="/Aloitelaatikko_ver2/poistaKayttaja">
                <input type="hidden" class="" name="kayttajaID" readonly value="<%=kayttajaID%>">
                <input type="submit" class="btn btn-danger" name="poista" value="Poista">
            </form>
        </div>
    </body>
</html>
