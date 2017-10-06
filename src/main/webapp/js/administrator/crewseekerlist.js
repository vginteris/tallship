function delete_crewseeker(crewID) {
    var deletedata = {"id": crewID};
    $.ajax({
        url: "/deleteonecrewseeker",
        type: "POST",
        data: JSON.stringify(deletedata),
        contentType: "application/json; charset=utf-8",
        datatype: "json",
        success: function () {
            alert("Delete success");
            document.getElementById("row_crew" + crewID).outerHTML = "";
        }
    })
}


function edit_crewseeker(crewID) {
    // var buttonID = "edit_crewseeker" + crewID;
    $('#edit_crewseeker' + crewID).hide();
    $('#save_crewseeker' + crewID).show();
    var title_temp = $('#title_row_crew' + crewID).text();
    var requiremnt_temp = $('#requirements_row_crew' + crewID).text();
    var offert_temp = $('#offer_row_crew' + crewID).text();
    var period_temp = $('#period_row_crew' + crewID).text();
    var price_temp = $('#price_row_crew' + crewID).text();

    $('#title_row_crew' + crewID).empty().append("<input style='width: 90px' type='text' id='temp_title_crew" + crewID + "' value='" + title_temp + "'>")
    $('#requirements_row_crew' + crewID).empty().append("<input style='width: 90px' type='text' id='temp_requirements_crew" + crewID + "' value='" + requiremnt_temp + "'>")
    $('#offer_row_crew' + crewID).empty().append("<input style='width: 90px' type='text' id='temp_offer_crew" + crewID + "' value='" + offert_temp + "'>");
    $('#period_row_crew' + crewID).empty().append("<input style='width: 90px' type='text' id='temp_period_crew" + crewID + "' value='" + period_temp + "'>");
    $('#price_row_crew' + crewID).empty().append("<input style='width: 90px' type='text' id='temp_price_crew" + crewID + "' value='" + price_temp + "'>")


}

function save_crewseeker(crewID) {
    $('#save_crewseeker' + crewID).hide();
    $('#edit_crewseeker' + crewID).show();
    var id = $('#id_row_crew'+crewID).text();
    var title = $('#temp_title_crew'+crewID).val();
    var requirements = $('#temp_requirements_crew'+crewID).val();
    var offer = $('#temp_offer_crew'+crewID).val();
    var period = $('#temp_period_crew'+crewID).val();
    var price = $('#temp_price_crew'+crewID).val();

    $('#title_row_crew' + crewID).empty().append(title);
    $('#requirements_row_crew' + crewID).empty().append(requirements);
    $('#offer_row_crew' + crewID).empty().append(offer);
    $('#period_row_crew' + crewID).empty().append(period);
    $('#price_row_crew' + crewID).empty().append(price);

    $.post("/updatecreseeker?id="+id,
        {
            title: title,
            requirements: requirements,
            offer: offer,
            period: period,
            price: price
        },
        function (data, status) {
            alert("Update to DB success")
        }
    );




}

// $(document).ready(function(){
//     $("#edit_crewseeker${crew.getId()}").click(function(){
//         $(this).hide();
//     });
// });

