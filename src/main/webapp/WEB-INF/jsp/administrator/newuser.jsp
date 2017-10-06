<%--
  Created by IntelliJ IDEA.
  User: vgint
  Date: 9/15/2017
  Time: 12:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.css">
    <link rel="stylesheet" href="css/structure.css">
    <script type="text/javascript" src="../../../js/administrator/crewseekerlist.js"></script>
    <script type="text/javascript" src="webjars/jquery/3.2.1/jquery.js"></script>
</head>
<body>
<jsp:include page="pagestructure/header.jsp"/>
<jsp:include page="pagestructure/navigator.jsp"/>
<section>
    <div class="container" style="margin-top: 50px">
        <div class="row">
            <form action="/addnewuser" method="post">
            <div>
                <h5>Captain information</h5>
                <%--<input type="text" class="form-control" placeholder="Id" name="captainid">--%>
                <input type="text" class="form-control" placeholder="Name" name="name">
                <input type="text" class="form-control" placeholder="surname" name="surname">
                <input type="text" class="form-control" placeholder="phone" name="phone">
                <input type="text" class="form-control" placeholder="nationality" name="nationality">
                <input type="text" class="form-control" placeholder="email" name="email">
                <input type="text" class="form-control" placeholder="password" name="password">
                <input type="number" class="form-control" placeholder="saillingExperience" name="saillingExperience">
            </div>
            <div>
                <h5>Ship information</h5>
                <%--<input type="text" class="form-control" placeholder="shipId" name="shipid">--%>
                <input type="text" class="form-control" placeholder="Ship name" name="shipname">
                <input type="text" class="form-control" placeholder="flag" name="flag">
                <input type="number" class="form-control" placeholder="year" name="year">
                <input type="number" class="form-control" placeholder="speed" name="speed">
                <input type="number" class="form-control" placeholder="length" name="length">
                <input type="number" class="form-control" placeholder="crew" name="crew">
                <input type="number" class="form-control" placeholder="freeCrewSpace" name="freeCrewSpace">
                <input type="text" class="form-control" placeholder="location" name="location">
                <input type="text" class="form-control" placeholder="shipClass" name="shipClass">
            </div>
            <div>
                <h5>
                    <h5>Crew seeker information</h5>
                    <%--<input type="text" class="form-control" placeholder="crewId" name="crewid">--%>
                    <input type="text" class="form-control" placeholder="title" name="title">
                    <input type="text" class="form-control" placeholder="requirements" name="requirements">
                    <input type="text" class="form-control" placeholder="offers" name="offers">
                    <input type="number" class="form-control" placeholder="period" name="period">
                    <input type="number" class="form-control" placeholder="price" name="price">
                </h5>
            </div>
            <div>
                <input type="submit" name="Insert" >
            </div>
            </form>
        </div>
    </div>

</section>
<jsp:include page="pagestructure/footer.jsp"/>


</body>
</html>
