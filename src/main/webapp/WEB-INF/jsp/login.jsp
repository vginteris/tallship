<%--
  Created by IntelliJ IDEA.
  User: vgint
  Date: 9/11/2017
  Time: 1:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TallShip login page</title>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.css">
    <link rel="stylesheet" href="css/login.css">
    <script src="css/bootstrap/js/bootstrap.js"></script>
    <script src="css/bootstrap/js/npm.js"></script>
</head>
<body class="backgroundclass">
<div>

    <div class="container" style="margin-top: 50px">
        <div class="text-center">
            <h2>Prisijungimo langas</h2>
        </div>
        <div class="text-center">
            <h6>Sukurta by Vytautas <span class="glyphicon-heart glyphicon"></span></h6>

        </div>
    </div>
    <div class="container" style="margin-top: 50px">
        <div class="row">
            <div class="col-md-6 col-md-offset-3 mainlogin">
                <div style="text-align: center ">
                    <img src="../img/sailor.jpg" class="loginimg">
                </div>
                <form action="/xxx" method="post">
                    <input type="text" class="form-control2" placeholder="El. Pastas" name="email">
                    <input type="password" class="form-control2" placeholder="Slaptazodis" name="passw1">
                    <button type="submit" class="btn1">Jungtis</button>
                    <input type="hidden" name="action" value="check">
                </form>
                <div style="text-align: right">
                    <a href="/registration" style="text-decoration: underline">Registration</a>
                </div>
            </div>

        </div>
    </div>
</div>

</body>
</html>
