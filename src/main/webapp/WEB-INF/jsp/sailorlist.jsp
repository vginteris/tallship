<%--
  Created by IntelliJ IDEA.
  User: vgint
  Date: 9/12/2017
  Time: 9:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
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
            <th>Veiksmai</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="sportsman" items="${allSportsmanList}">
            <tr id="row${sportsman.getId()}">
                <td id="id_row${sportsman.id}"><c:out value="${sportsman.getId()}"/></td>
                <td id="name_row${sportsman.id}"><c:out value="${sportsman.getName()}"/></td>
                <td id="country_row${sportsman.id}"><c:out value="${sportsman.getCountry()}"/></td>
                <td id="age_row${sportsman.id}"><c:out value="${sportsman.getAge()}"/></td>
                <td>
                    <input type="button" id="edit_button${sportsman.getId()}" value="EDIT" class="edit"
                           onclick="edit_row(${sportsman.getId()})">
                    <input type="button" id="save_button${sportsman.getId()}" value="SAVE" class="save"
                           onclick="save_row(${sportsman.getId()})">
                    <input type="button" id="delete_button${sportsman.getId()}" value="DELETE" class="delete"
                           onclick="delete_row(${sportsman.getId()})">

                </td>
            </tr>
        </c:forEach>
        <tr id="addrow">
            <td>Id</td>
            <td><input type="text" id="new_name"></td>
            <td><input type="text" id="new_country"></td>
            <td><input type="text" id="new_age"></td>
            <td>
                <input type="button" id="add_button" value="ADD" class="add" onclick="add_row()">
            </td>
        </tr>


        </tbody>


    </table>


</div>

</body>
</html>
