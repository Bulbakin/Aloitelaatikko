<%-- 
    Document   : etusivuKayttaja
    Created on : 28.11.2017, 14:57:56
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

        <link href="../CSS/signin.css" rel="stylesheet" type="text/css"/>
        <link href="../CSS/style3.css" rel="stylesheet" type="text/css"/>
        <style>
            body {
                background-image: url("../jspSivut/spagettikissav2.jpg");
                background-size: cover;
                color: black;
                text-align: center;
            }
        </style>

        <title>Käyttäjän etusivu</title>
        <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
    </head>
    <body>
        <nav class="navbar navbar-expand-md navbar-dark">
            <!-- Brand -->
            <a href="etusivuKayttaja.jsp" class="navbar-brand"><img src="pahvilaatikko2.png"></a>
            <a class="navbar-brand" href="etusivuKayttaja.jsp">Aloitelaatikko</a>

            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="#">Ota yhteyttä ylläpitoon</a>
                </li>
            </ul>
        </nav>
        <h1></h1>
        <form class="form-signin" name="lisays" action="../../Aloitelaatikko_ver2/lisaaAloite.jsp" method="post">
            <input type="submit" class="btn btn-primary" value="lisaaAloite" name="submit">
        </form>
        
        <form class="form-signin" name="lisays" action="../../Aloitelaatikko_ver2/tulostaAloitteetKayttaja.jsp" method="post">
            <input type="submit" class="btn btn-primary" value="Kaikki aloitteet" name="tulostaAloitteet">
        </form>
        
        <form class="form-signin" name="lisays" action="../../Aloitelaatikko_ver2/index.jsp" method="post">
            <input type="submit" class="btn btn-primary" value="Kirjaudu ulos" name="kirjauduUlos">
        </form>
    </body>
</html>
