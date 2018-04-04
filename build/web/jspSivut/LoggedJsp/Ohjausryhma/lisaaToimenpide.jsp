<%-- 
    Document   : lisaaToimenpide
    Created on : 21.11.2017, 13:52:25
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
                text-align: left;
                font-family: Comic Sans, cursive;
            }
        </style>

        <title>Toimenpiteen kirjaaminen</title>
        <link rel="shortcut icon" href="/Aloitelaatikko_ver2/jspSivut/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <nav class="navbar navbar-expand-md navbar-dark">
            <!-- Brand -->
            <a href="etusivuOhjausryhma.jsp" class="navbar-brand"><img src="/Aloitelaatikko_ver2/jspSivut/pahvilaatikko2.png"></a>
            <a class="navbar-brand" href="etusivuOhjausryhma.jsp">Aloitelaatikko</a>

            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="../Ohjausryhma/etusivuOhjausryhma.jsp">Palaa etusivulle</a>
                </li>
            </ul>
        </nav>
        <div class="container">
            <h1>Toimenpiteen kirjaaminen</h1>
            <%
                request.setCharacterEncoding("UTF-8");
                response.setContentType("text/html; charset=UTF-8");
                response.setCharacterEncoding("UTF-8");

                String aloiteID = request.getParameter("aloiteID");
                String aloitekuvaus = request.getParameter("aloitekuvaus");
            %>
            <p>Aloitteen kuvaus: <%=aloitekuvaus%></p>
            <form name="lisays" action="/Aloitelaatikko_ver2/lisaaToimenpide" method="post">
                Toimenpide:<br>
                <textarea class="form-control" rows="10" cols="40" name="Kuvaus" placeholder="Kuvaus"></textarea><br>
                <select style="width: 300px;"class="form-control" name="vaihe">
                    <option value="1">-</option>
                    <option value="2">Huomioitu</option>
                    <option value="3">Työn alla</option>
                    <option value="4">Valmis</option>
                </select><br>

                <input type="reset" class="btn btn-warning" value="Tyhjennä" name="reset">
                <input type="submit" class="btn btn-primary" value="Talleta" name="submit">
                <input type="hidden" name="aloiteID" value="<%=aloiteID%>">
            </form>
        </div>

        <footer class="container-fluid footer text-center fixed-bottom">
            <p>Aloitelaatikko Made By Julius Kinnarinen (&copy;)</p>
        </footer>
    </body>
</html>
