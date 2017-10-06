function delete_sailor(sailorID) {
    var deletedata = {"sailorid": sailorID};
    $.ajax({
        url: "/deletesailor",
        type: "POST",
        data: JSON.stringify(deletedata),
        contentType: "application/json; charset=utf-8",
        datatype: "json",
        success: function () {
            alert("Delete success");
            document.getElementById("row_sailor" + sailorID).outerHTML = "";
        }
    })
}


function edit_sailor(sailorID) {
    // var buttonID = "edit_sailorseeker" + sailorID;
    $('#edit_sailor' + sailorID).hide();
    $('#save_sailor' + sailorID).show();
    var name_temp = $('#name_row_sailor' + sailorID).text();
    var surname_temp = $('#surname_row_sailor' + sailorID).text();
    var phone_temp = $('#phone_row_sailor' + sailorID).text();
    var nationality_temp = $('#nationality_row_sailor' + sailorID).text();
    var email_temp = $('#email_row_sailor' + sailorID).text();
    var password_temp = $('#password_row_sailor' + sailorID).text();
    var sailingexp_temp = $('#sailingexp_row_sailor' + sailorID).text();
    var information_temp = $('#information_row_sailor' + sailorID).text();

    $('#name_row_sailor' + sailorID).empty().append("<input style='width: 90px' type='text' id='temp_name_sailor" + sailorID + "' value='" + name_temp + "'>")
    $('#surname_row_sailor' + sailorID).empty().append("<input style='width: 90px' type='text' id='temp_surname_sailor" + sailorID + "' value='" + surname_temp + "'>")
    $('#phone_row_sailor' + sailorID).empty().append("<input style='width: 90px' type='text' id='temp_phone_sailor" + sailorID + "' value='" + phone_temp + "'>");
    $('#nationality_row_sailor' + sailorID).empty().append("<input style='width: 90px' type='text' id='temp_nationality_sailor" + sailorID + "' value='" + nationality_temp + "'>");
    $('#email_row_sailor' + sailorID).empty().append("<input style='width: 90px' type='text' id='temp_email_sailor" + sailorID + "' value='" + email_temp + "'>")
    $('#password_row_sailor' + sailorID).empty().append("<input style='width: 90px' type='text' id='temp_password_sailor" + sailorID + "' value='" + password_temp + "'>")
    $('#sailingexp_row_sailor' + sailorID).empty().append("<input style='width: 90px' type='text' id='temp_sailorexp_sailor" + sailorID + "' value='" + sailingexp_temp + "'>")
    $('#information_row_sailor' + sailorID).empty().append("<input style='width: 90px' type='text' id='temp_information_sailor" + sailorID + "' value='" + information_temp + "'>")


}

function save_sailor(sailorID) {
    $('#save_sailor' + sailorID).hide();
    $('#edit_sailor' + sailorID).show();
    var id = $('#id_row_sailor' + sailorID).text();
    var name = $('#temp_name_sailor' + sailorID).val();
    var surname = $('#temp_surname_sailor' + sailorID).val();
    var phone = $('#temp_phone_sailor' + sailorID).val();
    var nationality = $('#temp_nationality_sailor' + sailorID).val();
    var email = $('#temp_email_sailor' + sailorID).val();
    var password = $('#temp_password_sailor' + sailorID).val();
    var sailingexp = $('#temp_sailorexp_sailor' + sailorID).val();
    var information = $('#temp_information_sailor' + sailorID).val();

    $('#name_row_sailor' + sailorID).empty().append(name)
    $('#surname_row_sailor' + sailorID).empty().append(surname)
    $('#phone_row_sailor' + sailorID).empty().append(phone);
    $('#nationality_row_sailor' + sailorID).empty().append(nationality);
    $('#email_row_sailor' + sailorID).empty().append(email)
    $('#password_row_sailor' + sailorID).empty().append(password)
    $('#sailingexp_row_sailor' + sailorID).empty().append(sailingexp)
    $('#information_row_sailor' + sailorID).empty().append(information)

    $.post("/updatesailor?sailorid=" + sailorID,
        {
            name: name,
            surname: surname,
            phone: phone,
            nationality: nationality,
            email: email,
            password: password,
            saillingExperience: sailingexp,
            moreInformation: information
        },
        function (data, status) {
            alert("Update to DB success")
        }
    );
}

$(document).ready(function () {
    $('#newsailor').click(function () {
        $('<tr id="tr">').appendTo($('#sailotListTable'))
            .append("ID")
            .append("<td><input style='width: 90px' type='text' id='new_name_sailor'></td>")
            .append("<td><input style='width: 90px' type='text' id='new_surname_sailor'></td>")
            .append("<td><input style='width: 90px' type='text' id='new_phone_sailor'></td>")
            .append("<td><input style='width: 90px' type='text' id='new_nationality_sailor'></td>")
            .append("<td><input style='width: 90px' type='text' id='new_email_sailor'></td>")
            .append("<td><input style='width: 90px' type='text' id='new_password_sailor'></td>")
            .append("<td><input style='width: 90px' type='number' id='new_saillingexp_sailor'></td>")
            .append("<td><input style='width: 90px' type='text' id='new_information_sailor'></td>")
            .append('<td><input type="button" id="add_btn" value="ADD" class="add" onclick="saveSailorDB();"/></td>').insertBefore(row_sailor1);
    })
})

function saveSailorDB() {
    $.post("/newsailor",
        {
            name: $('#new_name_sailor').val(),
            surname: $('#new_surname_sailor').val(),
            phone: $('#new_phone_sailor').val(),
            nationality: $('#new_nationality_sailor').val(),
            email: $('#new_email_sailor').val(),
            password: $('#new_password_sailor').val(),
            saillingExperience: $('#new_saillingexp_sailor').val(),
            moreInformation: $('#new_information_sailor').val()
        },
        function (data, status) {
            alert("Insert Sailor success");
            location.reload();
        }
    );
}

function showSailotList() {
    $.ajax({
        url: "/sailorlist",
        type: "GET",
        data: JSON.stringify(deletedata),
        contentType: "application/json; charset=utf-8",
        datatype: "json",
        success: function () {
            alert(":)");
        }
    })
}

// function showSailotList() {
//     document.getElementById("divmid").innerHTML = "";
//     $.ajax({
//         type: "GET",
//         url: "/refrestsailorlist",
//         contentType: "application/json; charset=utf-8",
//         success: function (sailorList, status) {
//             $(document).ready(function () {
//                 var addNewTeacher = $('<input type="button" id="add_button" value="ADD" class="add" onclick="add_row()"/>').appendTo($('#divmid'));
//                 document.getElementById("add_button").style.display = "inline";
//                 var table = $('<table id="sailotListTable" class="table table-striped table-inverse">').appendTo($('#divmid'));
//                 $('<tr id="tr">').appendTo(table)
//                     .append($('<th>').text('name'))
//                     .append($('<th>').text('surname'))
//                     .append($('<th>').text('phone'))
//                     .append($('<th>').text('Nationality'))
//                     .append($('<th>').text('Email'))
//                     .append($('<th>').text('Password'))
//                     .append($('<th>').text('Sailling Experience'))
//                     .append($('<th>').text('Information'))
//                     .append($('<th>  <button id="newsailor">New Sailor</button>').text('Action:'));
//                 $(sailorList).each(function (i, tlist) {
//                     $('<tr id="tr' + i + '">').appendTo(table)
//                         .append($('<td id="id_row_sailor' + i + '">').text(tlist.sailorid))
//                         .append($('<td id="name_row_sailor' + i + '">').text(tlist.name))
//                         .append($('<td id="surname_row_sailor' + i + '">').text(tlist.surname))
//                         .append($('<td id="nationality_row_sailor' + i + '">').text(tlist.nationality))
//                         .append($('<td id="email_row_sailor' + i + '">').text(tlist.email))
//                         .append($('<td id="password_row_sailor' + i + '">').text(tlist.password))
//                         .append($('<td id="sailingexp_row_sailor' + i + '">').text(tlist.saillingExperience))
//                         .append($('<td id="information_row_sailor' + i + '">').text(tlist.moreInformation))
//                         .append($('<td id="buttonTD"/>').innerHTML());
//                     $('#buttonTD').append($('<input type="button" id="edit_sailor${sailor.getSailorid()}" value="EDIT"\n' +
//                         '                               onclick="edit_sailor(${sailor.getSailorid()})">'))
//                     $('#buttonTD').append($('<input type="button" id="save_sailor${sailor.getSailorid()}" value="SAVE"\n' +
//                         '                               onclick="save_sailor(${sailor.getSailorid()})" STYLE="display: none">'))
//                     $('#buttonTD').append($('<input type="button" id="delete_sailor{sailor.getSailorid()}" value="DELETE"\n' +
//                         '                               onclick="delete_sailor(${sailor.getSailorid()})">'))
//                 });
//             });
//         }
//     });
//
//
// }


