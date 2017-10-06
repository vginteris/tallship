<%--
  Created by IntelliJ IDEA.
  User: vgint
  Date: 9/13/2017
  Time: 2:48 PM
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
    <div class="container">
        <table id="shipTableList" class="table table-striped table-inverse">
            <thead>
            <tr>
                <th>Id</th>
                <th>Title</th>
                <th>Requirements</th>
                <th>Offers</th>
                <th>Period day</th>
                <th>Price</th>
                <th>Ship name</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="crew" items="${creseekerlist}">
                <tr id="row_crew${crew.getId()}">
                    <td id="id_row_crew${crew.getId()}"><c:out value="${crew.getId()}"/></td>
                    <td id="title_row_crew${crew.getId()}"><c:out value="${crew.getTitle()}"/></td>
                    <td id="requirements_row_crew${crew.getId()}"><c:out value="${crew.getRequirements()}"/></td>
                    <td id="offer_row_crew${crew.getId()}"><c:out value="${crew.getOffers()}"/></td>
                    <td id="period_row_crew${crew.getId()}"><c:out value="${crew.getPeriod()}"/></td>
                    <td id="price_row_crew${crew.getId()}"><c:out value="${crew.getPrice()}"/></td>
                    <td id="ship_row_crew${crew.getId()}"><c:out value="${crew.getShip().getShipname()}"/></td>
                    <td>
                        <input type="button" id="edit_crewseeker${crew.getId()}" value="EDIT"
                               onclick="edit_crewseeker(${crew.getId()})">
                        <input type="button" id="save_crewseeker${crew.getId()}" value="SAVE" style="display: none"
                               onclick="save_crewseeker(${crew.getId()})">
                        <input type="button" id="delete_crewseeker${crew.getId()}" value="DELETE"
                               onclick="delete_crewseeker(${crew.getId()})">
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