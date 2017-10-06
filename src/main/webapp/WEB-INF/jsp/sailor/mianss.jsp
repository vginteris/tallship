<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.css">
    <link rel="stylesheet" href="css/structure.css">
    <script type="text/javascript" src="webjars/jquery/3.2.1/jquery.js"></script>
    <script type="text/javascript" src="../../../js/sailor/bandymas.js"></script>
</head>
<body>
<jsp:include page="sailorpagestrutcute/header.jsp"/>
<jsp:include page="sailorpagestrutcute/navigator.jsp"/>
<section>
    <div id="bandymas" class="container">
        <label for="sailor_id_first">Sailor Id</label>
        <input type="text" class="form-control" id="sailor_id_first">
    </div>
</section>
<jsp:include page="sailorpagestrutcute/footer.jsp"/>
</body>
</html>
