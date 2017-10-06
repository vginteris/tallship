<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="myinfoDiv">
    <div class="container">
        <div class="row">
            <div class="form-group col-md-6">
                <label for="sailor_name">Name</label>
                <input type="text" class="form-control" id="sailor_name" value="<c:out value="${sailor.getName()}"/>">
            </div>
            <div class="form-group col-md-6">
                <label for="sailor_surname">Surname</label>
                <input type="text" class="form-control" id="sailor_surname"
                       value="<c:out value="${sailor.getSurname()}"/>">
            </div>
        </div>

        <div class="row">
            <div class="form-group col-md-6">
                <label for="sailor_phone">Phone</label>
                <input type="text" class="form-control" id="sailor_phone" value="<c:out value="${sailor.getPhone()}"/>">
            </div>
            <div class="form-group col-md-6">
                <label for="sailor_nationality">Nationality</label>
                <input type="text" class="form-control" id="sailor_nationality"
                       value="<c:out value="${sailor.getNationality()}"/>">
            </div>
        </div>

        <div class="row">
            <div class="form-group col-md-6">
                <label for="sailor_email">Email</label>
                <input type="text" class="form-control" id="sailor_email" value="<c:out value="${sailor.getEmail()}"/>">
            </div>
            <div class="form-group col-md-6">
                <label for="sailor_password">Password</label>
                <input type="text" class="form-control" id="sailor_password"
                       value="<c:out value="${sailor.getPassword()}"/>">
            </div>
        </div>

        <div class="row">
            <div class="form-group col-md-6">
                <label for="sailor_sailingexp">Sailling Experience</label>
                <input type="number" class="form-control" id="sailor_sailingexp"
                       value="<c:out value="${sailor.getSaillingExperience()}"/>">
            </div>
            <div class="form-group col-md-6">
                <label for="sailor_information">Information</label>
                <input type="text" class="form-control" id="sailor_information"
                       value="<c:out value="${sailor.getMoreInformation()}"/>">
            </div>
        </div>
    <button type="button" id="update_sailor" onclick="sailor_updatejsp(${sailor.getSailorid()})">Update</button>
    </div>

</div>

