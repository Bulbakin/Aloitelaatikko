<%-- 
    Document   : lisaaAloite
    Created on : 14.11.2017, 14:29:35
    Author     : s1601382
--%>

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
        </style>

        <title>Aloitteen luominen</title>
        <link rel="shortcut icon" href="/Aloitelaatikko_ver2/jspSivut/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <nav class="navbar navbar-expand-sm navbar-dark">
            <!-- Brand/logo -->
            <a href="lisaaAloite.jsp" class="navbar-brand"><img src="/Aloitelaatikko_ver2/jspSivut/pahvilaatikko2.png"></a>
            <a class="navbar-brand" href="lisaaAloite.jsp">Aloitelaatikko</a>
            
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="../Kayttaja/etusivuKayttaja.jsp">Palaa etusivulle</a>
                </li>
            </ul>
        </nav><br>
        <div class="container">
            <h1>Uuden aloitteen luominen</h1>
            <form name="lisays" action="/Aloitelaatikko_ver2/lisaaAloite" method="post">
                <input class="form-control" type="text" name="aloitenimi" placeholder="Otsikko"><br>
                <textarea class="form-control" rows="10" cols="40" name="aloitekuvaus" placeholder="Kuvaus"></textarea><br>

                <input class="btn btn-warning" type="reset" value="Tyhjennä" name="reset"/>
                <input class="btn btn-primary" type="submit" value="Talleta" name="talleta"/>
            </form>
        </div>

        <footer class="container-fluid footer text-center fixed-bottom">
            <p>Aloitelaatikko Made By Julius Kinnarinen (&copy;)</p>
        </footer>
    </body>
</html>
