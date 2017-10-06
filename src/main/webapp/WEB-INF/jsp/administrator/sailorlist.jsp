<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.css">
    <link rel="stylesheet" href="css/structure.css">
    <script type="text/javascript" src="webjars/jquery/3.2.1/jquery.js"></script>
    <script type="text/javascript" src="../../../js/administrator/sailorlist.js"></script>
<%--<script>--%>
    <%--$(document).ready(function () {--%>
        <%--$('#newsailor').click(function () {--%>
            <%--alert("paspaudei mane");--%>
        <%--})--%>
    <%--})--%>
<%--</script>--%>
</head>
<body>
<jsp:include page="pagestructure/header.jsp"/>
<jsp:include page="pagestructure/navigator.jsp"/>
<section>
    <div class="container" id="divmid">
        <table id="sailotListTable" class="table table-striped table-inverse">
            <thead>
            <tr>
                <th>Sailor ID</th>
                <th>Name</th>
                <th>Surname</th>
                <th>Phone</th>
                <th>Nationality</th>
                <th>Email</th>
                <th>Password</th>
                <th>Sailling Experience</th>
                <th>Information</th>
                <th>Action:  <button id="newsailor">New Sailor</button></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="sailor" items="${sailorlist}">
                <tr id="row_sailor${sailor.getSailorid()}">
                    <td id="id_row_sailor${sailor.getSailorid()}"><c:out value="${sailor.getSailorid()}"/></td>
                    <td id="name_row_sailor${sailor.getSailorid()}"><c:out value="${sailor.getName()}"/></td>
                    <td id="surname_row_sailor${sailor.getSailorid()}"><c:out value="${sailor.getSurname()}"/></td>
                    <td id="phone_row_sailor${sailor.getSailorid()}"><c:out value="${sailor.getPhone()}"/></td>
                    <td id="nationality_row_sailor${sailor.getSailorid()}"><c:out value="${sailor.getNationality()}"/></td>
                    <td id="email_row_sailor${sailor.getSailorid()}"><c:out value="${sailor.getEmail()}"/></td>
                    <td id="password_row_sailor${sailor.getSailorid()}"><c:out value="${sailor.getPassword()}"/></td>
                    <td id="sailingexp_row_sailor${sailor.getSailorid()}"><c:out value="${sailor.getSaillingExperience()}"/></td>
                    <td id="information_row_sailor${sailor.getSailorid()}"><c:out value="${sailor.getMoreInformation()}"/></td>
                    <td>
                        <input type="button" id="edit_sailor${sailor.getSailorid()}" value="EDIT"
                               onclick="edit_sailor(${sailor.getSailorid()})">
                        <input type="button" id="save_sailor${sailor.getSailorid()}" value="SAVE" style="display: none"
                               onclick="save_sailor(${sailor.getSailorid()})">
                        <input type="button" id="delete_sailor${sailor.getSailorid()}" value="DELETE"
                               onclick="delete_sailor(${sailor.getSailorid()})">
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