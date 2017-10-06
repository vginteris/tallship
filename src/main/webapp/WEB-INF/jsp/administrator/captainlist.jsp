<%--
  Created by IntelliJ IDEA.
  User: vgint
  Date: 9/12/2017
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.css">
    <link rel="stylesheet" href="css/structure.css">
    <script type="text/javascript" src="../../../js/captainlist.js"></script>
</head>
<body>
<jsp:include page="pagestructure/header.jsp"/>
<jsp:include page="pagestructure/navigator.jsp"/>
<section>
<div class="container">
    <table id="tableList" class="table table-striped table-inverse">
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Surname</th>
            <th>Phone</th>
            <th>Nationality</th>
            <th>Email</th>
            <th>Password</th>
            <th>Sailing Experience</th>
            <th>Ship Name</th>
            <th>Crew title</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="captain" items="${captainlist}">
            <tr id="row_captain${captain.getCaptainid()}">
                <td id="id_row_captain${captain.getCaptainid()}"><c:out value="${captain.getCaptainid()}"/></td>
                <td id="name_row_captain${captain.getCaptainid()}"><c:out value="${captain.getName()}"/></td>
                <td id="surname_row_captain${captain.getCaptainid()}"><c:out value="${captain.getSurname()}"/></td>
                <td id="phone_row_captain${captain.getCaptainid()}"><c:out value="${captain.getPhone()}"/></td>
                <td id="nationality_row_captain${captain.getCaptainid()}"><c:out value="${captain.getNationality()}"/></td>
                <td id="email_row_captain${captain.getCaptainid()}"><c:out value="${captain.getEmail()}"/></td>
                <td id="password_row_captain${captain.getCaptainid()}"><c:out value="${captain.getPassword()}"/></td>
                <td id="saillingexp_row_captain${captain.getCaptainid()}"><c:out value="${captain.getSaillingExperience()}"/></td>
                <td id="shipname_row_captain${captain.getCaptainid()}"><c:out value="${captain.getShip().getShipname()}"/></td>
                <td>
                <c:forEach var="crew" items="${captain.getShip().crewseekerList}">
                    <c:out value="${crew.getTitle()}"></c:out>
                </c:forEach>
                </td>
                <td>
                    <input type="button" id="edit_captain${captain.getCaptainid()}" value="EDIT"
                            onclick="edit_captain(${captain.getCaptainid()})">
                    <input type="button" id="save_captain${captain.getCaptainid()}" value="SAVE" style="display: none"
                           onclick="save_captain(${captain.getCaptainid()})">
                    <input type="button" id="delete_captain${captain.getCaptainid()}" value="DELETE"
                           onclick="delete_captain(${captain.getCaptainid()})">
                </td>


            </tr>
        </c:forEach>
        </tbody>


    </table>


</div>
</section>
<jsp:include page="pagestructure/footer.jsp"/>
</body>
</html>
