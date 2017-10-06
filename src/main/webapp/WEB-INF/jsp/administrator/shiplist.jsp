<%--
  Created by IntelliJ IDEA.
  User: vgint
  Date: 9/13/2017
  Time: 2:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ship list</title>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.css">
    <link rel="stylesheet" href="css/structure.css">
    <script type="text/javascript" src="webjars/jquery/3.2.1/jquery.js"></script>
    <script type="text/javascript" src="../../../js/administrator/shiplist.js"></script>
</head>
<body>
<jsp:include page="pagestructure/header.jsp"/>
<jsp:include page="pagestructure/navigator.jsp"/>
<section>
    <div class="container">
        <table id="shipTableList" class="table table-striped table-inverse">
            <thead>
            <tr>
                <th>Id</th>
                <th>Ship Name</th>
                <th>Flag</th>
                <th>Year</th>
                <th>Speed</th>
                <th>Length</th>
                <th>Crew</th>
                <th>Free crew space</th>
                <th>Location</th>
                <th>Ship class</th>
                <th>Crew seeker offers</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="ship" items="${shiplist}">
                <tr id="row_ship${ship.getShipid()}">
                    <td id="shipid_row_ship${ship.getShipid()}"><c:out value="${ship.getShipid()}"/></td>
                    <td id="shipname_row_ship${ship.getShipid()}"><c:out value="${ship.getShipname()}"/></td>
                    <td id="flag_row_ship${ship.getShipid()}"><c:out value="${ship.getFlag()}"/></td>
                    <td id="year_row_ship${ship.getShipid()}"><c:out value="${ship.getYear()}"/></td>
                    <td id="speed_row_ship${ship.getShipid()}"><c:out value="${ship.getSpeed()}"/></td>
                    <td id="length_row_ship${ship.getShipid()}"><c:out value="${ship.getLength()}"/></td>
                    <td id="crew_row_ship${ship.getShipid()}"><c:out value="${ship.getCrew()}"/></td>
                    <td id="freespace_row_ship${ship.getShipid()}"><c:out value="${ship.getFreeCrewSpace()}"/></td>
                    <td id="location_row_ship${ship.getShipid()}"><c:out value="${ship.getLocation()}"/></td>
                    <td id="shipclass_row_ship${ship.getShipid()}"><c:out value="${ship.getShipClass()}"/></td>
                    <%--<td><c:out value="${ship.crewseekerList.length()}"/></td>--%>
                    <%int number=0;%>
                    <c:forEach var="crew" items="${ship.crewseekerList}">
                       <%number++;%>
                    </c:forEach>
                    <td><%=number%></td>
                    <td>
                        <input type="button" id="edit_ship${ship.getShipid()}" value="EDIT"
                               onclick="edit_ship(${ship.getShipid()})">
                        <input type="button" id="save_ship${ship.getShipid()}" value="SAVE" style="display: none"
                               onclick="save_ship(${ship.getShipid()})">
                        <input type="button" id="delete_ship${ship.getShipid()}" value="DELETE"
                               onclick="delete_ship(${ship.getShipid()})">
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
