<%--
  Created by IntelliJ IDEA.
  User: vgint
  Date: 9/12/2017
  Time: 9:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Main page</title>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.css">
    <link rel="stylesheet" href="css/login.css">
    <script type="text/javascript" href="js/registration.js"></script>
    <style>
        div.container {
            width: 100%;
            border: 1px solid gray;
        }

        header, footer {
            padding: 1em;
            color: white;
            background-color: black;
            clear: left;
            text-align: center;
        }

        nav {
            float: left;
            max-width: 160px;
            margin: 0;
            padding: 1em;
        }

        nav ul {
            list-style-type: none;
            padding: 0;
        }

        nav ul a {
            text-decoration: none;
        }

        article {
            margin-left: 170px;
            border-left: 1px solid gray;
            padding: 1em;
            overflow: hidden;
        }
    </style>
</head>
<body>
<div>
    <header>Tall Ship</header>
    <nav>
        <ul class="nav flex-column">
            <li class="nav-item">
                <a class="nav-link active" href="#">New Sailboat</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="x">View Sailboat</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Import/Export</a>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="#">Statistic</a>
            </li>
        </ul>

    </nav>

    <article>
        <jsp:include page="administrator/captainlist.jsp">
            <jsp:param name="captain1" value="captain1">
                <
            </jsp:param>
        </jsp:include>
    </article>

    <footer>Created by Vytautas 2017</footer>
</div>

</body>
</html>