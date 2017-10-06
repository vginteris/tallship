<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="joblistDIV">
    <div class="container">
        <p>Filter</p>
        <div class="row">
            <div>
                <select name="captain_id" class="form-group col-md-4">
                    <option value="0">Choose Captain</option>
                    <c:forEach var="captain" items="${joblist}">
                        <option value="<c:out value="${captain.getCaptainid()}"/>"><c:out
                                value="${captain.getName()}"/></option>
                    </c:forEach>
                </select>
            </div>
            <div>
                <select name="ship_id" class="form-group col-md-4" onchange="showShipTable(value)">
                    <option value="0">Choose Ship</option>
                    <c:forEach var="ship" items="${joblist}">
                        <option value="<c:out value="${ship.getShip().getShipid()}"/>"><c:out
                                value="${ship.getShip().getShipname()}"/></option>
                    </c:forEach>
                </select>
            </div>
            <div>
                <button id="showAllJobsList" class="button col-md-4">Show all</button>
            </div>
        </div>
        <div id="jobTable">
            <div>
                <table>
                    <thead>
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
                    <th>Captain</th>
                    <th>Email</th>
                    </thead>
                    <tbody>
                    <td></td>
                    </tbody>
                </table>

            </div>

        </div>
    </div>
</div>
