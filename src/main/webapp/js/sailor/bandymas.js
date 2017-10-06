function myinformation() {

   var sailorid = $('#sailor_id_first').val();
    $('#bandymas').empty().load('/myinformation #myinfoDiv',{sailorid:sailorid})
}

function sailor_updatejsp(sailorid) {
    var name = $('#sailor_name').val();
    var surname = $('#sailor_surname').val();
    var phone = $('#sailor_phone').val();
    var nationality = $('#sailor_nationality').val();
    var email = $('#sailor_email').val();
    var password = $('#sailor_password').val();
    var sailingexp = $('#sailor_sailingexp').val();
    var information = $('#sailor_information').val();

    $.post("/updatesailor?sailorid=" + sailorid,
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

function sailorjobs() {
    $('#bandymas').empty().load('/joblist #joblistDIV');
    
}

// $(document).ready(function () {
//     $("#showAllJobsList").click(function () {
//        alert("aas")
//     })
// })

function showShipTable(id) {
    alert(id)
}
//
// function showAllJobList() {
//     alert("aaaaa")
// }

