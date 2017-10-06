<%--
  Created by IntelliJ IDEA.
  User: vgint
  Date: 9/11/2017
  Time: 1:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.css">
    <link rel="stylesheet" href="css/login.css">
    <script type="text/javascript" href="http://localhost:8080/js/registration.js"></script>
    <title>Registration page</title>
    <%--<script>--%>
    <%--function addNewSailorToDB() {--%>
    <%--var name = document.getElementById("name").value;--%>
    <%--var surname = document.getElementById("surname").value;--%>
    <%--var password = document.getElementById("passw1").value;--%>
    <%--var phone = document.getElementById("phone").value;--%>
    <%--var email = document.getElementById("email").value;--%>
    <%--var nationality = document.getElementById("nationality").value;--%>
    <%--var roles = document.getElementById("roles").value;--%>
    <%--var sailingexperience = document.getElementById("sailingexperience").value;--%>

    <%--var postreg;--%>
    <%--var url = "/registnewsailor";--%>
    <%--var parameter = "name="+name+"&surname="+surname+"&password="+password+"&phone="+phone--%>
    <%--+"&email="+email+"&nationality="+nationality+"&roles="+roles+"&sailingexperience="+sailingexperience ;--%>

    <%--postreg = window.XMLHttpRequest? new XMLHttpRequest():--%>
    <%--new ActiveXObject("Microsoft.XMLHTTP");--%>

    <%--postreg.onreadystatechange = function () {--%>
    <%--if (postreg.readyState==4 && postreg.status==200){--%>
    <%--var responsetext = postreg.responseText;--%>
    <%--alert("Registration success");--%>
    <%--}--%>
    <%--};--%>
    <%--postreg.open("POST", url+"?"+parameter,true);--%>
    <%--postreg.send()--%>
    <%--}--%>
    <%--</script>--%>
</head>

<body class="backgroundclass">
<div>

    <div class="container" style="margin-top: 50px">
        <div class="text-center">
            <h2>Registration page</h2>
        </div>
        <div class="text-center">
            <h6>Created by Vytautas <span class="glyphicon-heart glyphicon"></span></h6>

        </div>
    </div>
    <div class="container" style="margin-top: 50px">
        <div class="row">
            <div class="col-md-6 col-md-offset-3 mainregistracija">
                <div style="text-align: center ">
                    <img src="../img/sailor.jpg" class="loginimg">
                </div>
                <%--<form action="/xxx" name="form1" method="post">--%>
                <input type="text" id="name" name="name" class="form-control2" placeholder="Name">
                <input type="text" id="surname" name="surname" class="form-control2" placeholder="Surname">

                <input type="password" id="passw1" name="passw1" class="form-control2" placeholder="Password"
                >
                <input type="password" id="passw2" name="passw2" class="form-control2"
                       placeholder="Repeat password">

                <input type="text" id="phone" name="phone" class="form-control2" placeholder="Phone">
                <input type="text" id="email" name="email" class="form-control2" placeholder="Email">
                <input type="text" id="nationality" name="nationality" class="form-control2" placeholder="Nationality">

                <select name="roles" id="roles" class="form-control2">
                    <option value="0">Choose</option>
                    <option value="1">Captain</option>
                    <option value="2">Sailor</option>
                </select>
                <input type="text" id="sailingexperience" name="sailingexperience" class="form-control2"
                       placeholder="Sailing Experience">
                <%--<textarea class="form-control2" id="sailingexperience" name="description" rows="3" style="height: 100px"--%>
                <%--placeholder="Aprasymas"></textarea>--%>
                <input type="button" id="registButton" value="Registration" class="registration"
                       onclick="addNewSailorToDB()"/>
                <%--<input type="hidden" name="action" value="add">--%>
                <%--</form>--%>
                <div>
                    <a href="login">Back to login</a>
                </div>
            </div>

        </div>
    </div>
</div>
</body>
</html>
