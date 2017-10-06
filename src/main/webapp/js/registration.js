function addNewSailorToDB() {
    var name = document.getElementById("name").value;
    var surname = document.getElementById("surname").value;
    var password = document.getElementById("passw1").value;
    var phone = document.getElementById("phone").value;
    var email = document.getElementById("email").value;
    var nationality = document.getElementById("nationality").value;
    var roles = document.getElementById("roles").value;
    var sailingexperience = document.getElementById("sailingexperience").value;

    var postreg;
    var url = "/registnewsailor";
    var parameter = "name=" + name + "&surname=" + surname + "&password=" + password + "&phone=" + phone
        + "&email=" + email + "&nationality=" + nationality + "&roles=" + roles + "&sailingexperience=" + sailingexperience;

    postreg = window.XMLHttpRequest ? new XMLHttpRequest() :
        new ActiveXObject("Microsoft.XMLHTTP");

    postreg.onreadystatechange = function () {
        if (postreg.readyState == 4 && postreg.status == 200) {
            var responsetext = postreg.responseText;
            alert("Registration success");
        }
    };
    postreg.open("POST", url + "?" + parameter, true);
    postreg.send()
}
