function delete_ship(shipID) {
    var deletedata = {"shipid": shipID};
    $.ajax({
        url: "/deleteship",
        type: "POST",
        data: JSON.stringify(deletedata),
        contentType: "application/json; charset=utf-8",
        datatype: "json",
        success: function () {
            alert("Delete success");
            document.getElementById("row_ship" + shipID).outerHTML = "";
        }
    })
}

function edit_ship(shipID) {
    // var buttonID = "edit_sailorseeker" + shipID;
    $('#edit_ship' + shipID).hide();
    $('#save_ship' + shipID).show();
    var shipname_temp = $('#shipname_row_ship' + shipID).text();
    var flag_temp = $('#flag_row_ship' + shipID).text();
    var year_temp = $('#year_row_ship' + shipID).text();
    var speed_temp = $('#speed_row_ship' + shipID).text();
    var length_temp = $('#length_row_ship' + shipID).text();
    var crew_temp = $('#crew_row_ship' + shipID).text();
    var freespace_temp = $('#freespace_row_ship' + shipID).text();
    var location_temp = $('#location_row_ship' + shipID).text();
    var shipclass_temp = $('#shipclass_row_ship' + shipID).text();

    $('#shipname_row_ship' + shipID).empty().append("<input style='width: 90px' type='text' id='shipname_temp_ship" + shipID + "' value='" + shipname_temp + "'>")
    $('#flag_row_ship' + shipID).empty().append("<input style='width: 90px' type='text' id='flag_temp_ship" + shipID + "' value='" + flag_temp + "'>")
    $('#year_row_ship' + shipID).empty().append("<input style='width: 90px' type='text' id='year_temp_ship" + shipID + "' value='" + year_temp + "'>");
    $('#speed_row_ship' + shipID).empty().append("<input style='width: 90px' type='text' id='speed_temp_ship" + shipID + "' value='" + speed_temp + "'>");
    $('#length_row_ship' + shipID).empty().append("<input style='width: 90px' type='text' id='length_temp_ship" + shipID + "' value='" + length_temp + "'>")
    $('#crew_row_ship' + shipID).empty().append("<input style='width: 90px' type='text' id='crew_temp_ship" + shipID + "' value='" + crew_temp + "'>")
    $('#freespace_row_ship' + shipID).empty().append("<input style='width: 90px' type='text' id='freespace_temp_ship" + shipID + "' value='" + freespace_temp + "'>")
    $('#location_row_ship' + shipID).empty().append("<input style='width: 90px' type='text' id='location_temp_ship" + shipID + "' value='" + location_temp + "'>")
    $('#shipclass_row_ship' + shipID).empty().append("<input style='width: 90px' type='text' id='shipclass_temp_ship" + shipID + "' value='" + shipclass_temp + "'>")


}

function save_ship(shipID) {
    $('#save_ship' + shipID).hide();
    $('#edit_ship' + shipID).show();
    var shipid = $('#id_row_sailor' + shipID).text();
    var shipname = $('#shipname_temp_ship' + shipID).val();
    var year = $('#year_temp_ship' + shipID).val();
    var flag = $('#flag_temp_ship' + shipID).val();
    var speed = $('#speed_temp_ship' + shipID).val();
    var length = $('#length_temp_ship' + shipID).val();
    var crew = $('#crew_temp_ship' + shipID).val();
    var freespace = $('#freespace_temp_ship' + shipID).val();
    var location = $('#location_temp_ship' + shipID).val();
    var shipclass = $('#shipclass_temp_ship' + shipID).val();

    $('#shipname_row_ship' + shipID).empty().append(shipname)
    $('#flag_row_ship' + shipID).empty().append(flag)
    $('#year_row_ship' + shipID).empty().append(year);
    $('#speed_row_ship' + shipID).empty().append(speed);
    $('#length_row_ship' + shipID).empty().append(length)
    $('#crew_row_ship' + shipID).empty().append(crew)
    $('#freespace_row_ship' + shipID).empty().append(freespace)
    $('#location_row_ship' + shipID).empty().append(location)
    $('#shipclass_row_ship' + shipID).empty().append(shipclass)

    $.post("/updateship?shipid=" + shipID,
        {
            shipname: shipname,
            flag: flag,
            year: year,
            speed: speed,
            length: length,
            crew: crew,
            freeCrewSpace: freespace,
            location: location,
            shipClass: shipclass
        },
        function (data, status) {
            alert("Update to DB success")
        }
    );
}

function labas() {
    $('#import_li').css('background-color','red');
}

