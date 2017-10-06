
function edit_row(val) {
//        $("#tr" + val + "").remove();
    var newId = "#id" + val + "";
    var newName = "#name" + val + "";
    var newSurname = "#surname" + val;
    var newPhone = "#phone" + val;
    var newInfo = "#info" + val;
    $(document).ready(function () {
        $('<tr id="tr' + val + '">').appendTo($("#tr" + val + ""))
            .append($('<input type="hidden" id="id" value="' + $('' + newId + '').text() + '"/>'))
            .append($('<td><input type="text" id="name" value="' + $('' + newName + '').text() + '" style="width: 50px"/></td>'))
            .append($('<td><input type="text" id="surname" value="' + $('' + newSurname + '').text() + '" style="width: 50px"/></td>'))
            .append($('<td><input type="number" id="phone" value="' + $('' + newPhone + '').text() + '" style="width: 50px"/></td>'))
            .append($('<td><input type="text" id="info" value="' + $('' + newInfo + '').text() + '" style="width: 50px"/></td>'))
            .append($('<input type="button" id="save_button' + val + '" value="SAVE" class="edit" onclick="save_row()"/>'))
            .append($('<input type="button" id="delete_button' + val + '" value="DELETE" class="delete" onclick="delete_row(' + val + ')">'));
    });
}

function save_row() {
    $.post("/updateteacher?id="+$('#id').val(),
        {
            name: $('#name').val(),
            surname: $('#surname').val(),
            phone: $('#phone').val(),
            info: $('#info').val()
        },
        function (data, success) {
//                alert(success);
            modifTeacher();
        }
    )
}

<script>
//    //"/test1" veikia > Isiunciam kaip atribudus, controleryje gaunam per @ModelAttribute
//    //, isiunciam i Ajax ir cia gaunam JSON formata per ResponseEntity<>
//    //"/test2" veikia > Isiunciam kaip atribudus, controleryje gaunam per @ModelAttribute
//    //, isiunciam i Ajax ir cia gaunam JSON formata per return Object (pasirasom virs metodo @ResponeBody)
//    function testJquery() {
//// arba "/test2"
//        $.post("/test1",
//            {
//                name: "name",
//                surname: "surname",
//                phone: 1,
//                info: "info"
//            },
//            function (data, status) {
//                alert(status);
//                alert(data.name);
//            }
//        )
//    }
</script>
<script>
//    //"/test3" veikia > Isiunciam kaip Json formata, controleryje gaunam per @RequestBody
//    //, isiunciam i Ajax ir cia gaunam JSON formata per ResponseEntity<>
//    //"/test4" veikia > Isiunciam kaip atribudus, controleryje gaunam per @RequestBody
//    //, isiunciam i Ajax ir cia gaunam JSON formata per return Object (pasirasom virs metodo ResponeBody)
//    var data_to_send =
//        {
//            name: "name",
//            surname: "surname",
//            phone: 1,
//            info: "info"
//        };
//
//    function testJquery() {
//        $.ajax({
//            type: "POST",
//            url: "/test4",
//            contentType: "application/json; charset=utf-8",
//            data: JSON.stringify(data_to_send),
//            dataType: "json",
//            success: function (data, status) {
//                alert(status);
//                alert(data);
//                alert(data.name);
//            }
//        });
//    }

function delete_row(val) {
    $("#tr" + val + "").remove();
    $.post("/deleteteacher?id=" + val,
        function (data, status) {
            alert(status);
        });
}

function add_row() {
    document.getElementById("add_button").style.display = "none";
    $(document).ready(function () {
        $('<tr id="tr">').appendTo($('#tableteach'))
            .append($('<td><input type="text" id="name" style="width: 50px"></td>'))
            .append($('<td><input type="text" id="surname" style="width: 50px"></td>'))
            .append($('<td><input type="text" id="phone" style="width: 50px"></td>'))
            .append($('<td><input type="text" id="info" style="width: 50px"></td>'))
            .append($('<td><input type="button" id="add_btn" value="ADD" class="add" onclick="confirm();"/></td>')).insertBefore(tr0);
    });

}
</script>
<script>
function confirm() {
    $.post("/addteacher",
        {
            name: $('#name').val(),
            surname: $('#surname').val(),
            phone: $('#phone').val(),
            info: $('#info').val()
        },
        function (data, status) {
            modifTeacher();
        }
    );
}

function modifTeacher() {
    document.getElementById("divmid").innerHTML = "";
    $.ajax({
        type: "GET",
        url: "/allteachers",
        contentType: "application/json; charset=utf-8",
        success: function (teachlist, status) {
//                alert(teachlist[0].phone);  // skirti veikimui patikrinti
//                alert(status);
            // $(document).ready(function(){}) < Naudojamas, kai tik isijungia jsp langas arba triginama function
            // (siuo atveju funkcija paspaudziama ir suveikia)
            $(document).ready(function () {
                var addNewTeacher = $('<input type="button" id="add_button" value="ADD" class="add" onclick="add_row()"/>').appendTo($('#divmid'));
                document.getElementById("add_button").style.display = "inline";
                var table = $('<table id="tableteach" class="table-bordered"/>').appendTo($('#divmid'));
                $('<th id="th">').appendTo(table)
                    .append('name')
                    .append('surname')
                    .append('phone')
                    .append('info')
                    .append('update')
                    .append('delete');
                $(teachlist).each(function (i, tlist) {
                    $('<tr id="tr' + i + '">').appendTo($('#th'))

                        .append($('<input id="id' + i + '" type="hidden"/>').text(tlist.id))
                        .append($('<td id="name' + i + '" style="width: 50px; height: 50px">').text(tlist.name))
                        .append($('<td id="surname' + i + '">').text(tlist.surname))
                        .append($('<td id="phone' + i + '">').text(tlist.phone))
                        .append($('<td id="info' + i + '">').text(tlist.info))
                        .append($('<input type="button" id="edit_button' + i + '" value="EDIT" class="edit" onclick="edit_row(' + i + ')"/>'))
                        .append($('<input type="button" id="delete_button' + i + '" value="DELETE" class="delete" onclick="delete_row(' + i + ')">'));
                });
            });
        }
    });
}
