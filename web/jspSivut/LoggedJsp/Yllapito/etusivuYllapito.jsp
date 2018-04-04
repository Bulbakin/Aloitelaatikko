<%-- 
    Document   : etusivuYllapito
    Created on : 28.11.2017, 14:55:48
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
                background-image: url("/Aloitelaatikko_ver2/jspSivut/spagettikissav3.jpg");
                background-size: cover;
                color: black;
                text-align: center;
                font-family: Comic Sans, cursive;
            }

            .btnSize {
                width: 300px;
                height: 60px;
            }

            .formStyle {
                margin-top: 10px;
            }
        </style>

        <title>Ylläpidon etusivu</title>
        <link rel="shortcut icon" href="/Aloitelaatikko_ver2/jspSivut/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <nav class="navbar navbar-expand-md navbar-dark">
            <!-- Brand -->
            <a href="etusivuYllapito.jsp" class="navbar-brand"><img src="/Aloitelaatikko_ver2/jspSivut/pahvilaatikko2.png"></a>
            <a class="navbar-brand" href="etusivuYllapito.jsp">Aloitelaatikko</a>

            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="#">Ota yhteyttä ylläpitoon</a>
                </li>
            </ul>
        </nav><br>
        <h2 style="color: white;">Tervetuloa: <%= session.getAttribute("knimi")%></h2><br>
        <form class="formStyle" name="lisays" action="tulostaKayttajat.jsp">
            <input type="submit" class="btn btn-primary btnSize" value="Kaikki Käyttäjät" name="submit">
        </form>
        
        <form class="formStyle" name="lisays" action="../Kayttaja/tulostaAloitteet.jsp">
            <input type="submit" class="btn btn-primary btnSize" value="Kaikki Aloitteet" name="submit">
        </form>
        <footer class="container-fluid footer text-center fixed-bottom">
            <p>Aloitelaatikko Made By Julius Kinnarinen (&copy;)</p>
        </footer>
    </body>
</html>
