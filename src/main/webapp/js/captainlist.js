function edit_captain(captainId) {
    document.getElementById("edit_captain"+captainId).style.display="none";
    document.getElementById("save_captain"+captainId).style.display="block";

    var name = document.getElementById("name_row_captain"+captainId);
    var surname = document.getElementById("surname_row_captain"+captainId);
    var phone = document.getElementById("phone_row_captain"+captainId);
    var nationality = document.getElementById("nationality_row_captain"+captainId);
    var email = document.getElementById("email_row_captain"+captainId);
    var password = document.getElementById("password_row_captain"+captainId);
    var sailingexp = document.getElementById("saillingexp_row_captain"+captainId);

    var name_temp = name.innerHTML;
    var surname_temp =surname.innerHTML;
    var phone_temp =phone.innerHTML;
    var nationality_temp =nationality.innerHTML;
    var email_temp =email.innerHTML;
    var password_temp =password.innerHTML;
    var sailingexp_temp =sailingexp.innerHTML;


    name.innerHTML="<input style='width: 90px' type='text' id='temp_name_captain"+captainId+"' value='"+name_temp+"'>";
    surname.innerHTML="<input style='width: 90px' type='text' id='temp_surname_captain"+captainId+"' value='"+surname_temp+"'>";
    phone.innerHTML="<input style='width: 90px' type='text' id='temp_phone_captain"+captainId+"' value='"+phone_temp+"'>";
    nationality.innerHTML="<input style='width: 90px' type='text' id='temp_nationality_captain"+captainId+"' value='"+nationality_temp+"'>";
    email.innerHTML="<input style='width: 90px' type='text' id='temp_email_captain"+captainId+"' value='"+email_temp+"'>";
    password.innerHTML="<input style='width: 90px' type='text' id='temp_password_captain"+captainId+"' value='"+password_temp+"'>";
    sailingexp.innerHTML="<input style='width: 90px' type='text' id='temp_sailingexp_captain"+captainId+"' value='"+sailingexp_temp+"'>";

}

function save_captain(captainId) {
    console.log(captainId);
    document.getElementById("save_captain"+captainId).style.display="none";
    document.getElementById("edit_captain"+captainId).style.display="block";

    var name = document.getElementById("temp_name_captain"+captainId).value;
    var surname = document.getElementById("temp_surname_captain"+captainId).value;
    var phone = document.getElementById("temp_phone_captain"+captainId).value;
    var nationality = document.getElementById("temp_nationality_captain"+captainId).value;
    var email = document.getElementById("temp_email_captain"+captainId).value;
    var password = document.getElementById("temp_password_captain"+captainId).value;
    var sailingexp = document.getElementById("temp_sailingexp_captain"+captainId).value;

    document.getElementById("name_row_captain"+captainId).innerHTML = name;
    document.getElementById("surname_row_captain"+captainId).innerHTML = surname;
    document.getElementById("phone_row_captain"+captainId).innerHTML = phone;
    document.getElementById("nationality_row_captain"+captainId).innerHTML = nationality;
    document.getElementById("email_row_captain"+captainId).innerHTML = email;
    document.getElementById("password_row_captain"+captainId).innerHTML = password;
    document.getElementById("saillingexp_row_captain"+captainId).innerHTML = sailingexp;

    var postgres;
    var url = "/updatecapiton";
    var parameter = "captainid="+captainId+"&name="+name+"&surname="+surname+"&phone="+phone+
        "&nationality="+nationality+"&email="+email+"&password="+password+"&saillingExperience="+sailingexp;

    postgres = window.XMLHttpRequest? new XMLHttpRequest():
        new ActiveXObject("Microsoft.XMLHTTP");

    postgres.onreadystatechange = function () {
        if (postgres.readyState == 4 && postgres.status == 200){
            var responseText = postgres.responseText;
            alert(responseText);
        }
    };
    postgres.open("POST", url+"?"+parameter, true);
    postgres.send();

}

function delete_captain(captainId) {
    document.getElementById("row_captain"+captainId).outerHTML = "";

    var postgres
    var url = "/deletecaptain";
    var parameter ="captainid="+captainId;

    postgres = window.XMLHttpRequest? new XMLHttpRequest():
        new ActiveXObject("Microsoft.XMLHTTP");

    postgres.onreadystatechange = function () {
        if (postgres.readyState == 4 && postgres.status == 200){
            var responseText = postgres.responseText;
            alert(responseText);
        }
    };
    postgres.open("POST", url+"?"+parameter, true);
    postgres.send();

}