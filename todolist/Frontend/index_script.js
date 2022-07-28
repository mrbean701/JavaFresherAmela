var listAccount = []
$(function() {
    getListEmployees();

    $('#reset_btn').click(function() {
        $('#ID_ID').val("")
        $('#Email_ID').val("")
        $('#Username_ID').val("")
        $('#Fullname_ID').val("")
        $('#Department_ID').val("")
        $('#Position_ID').val("")
        $('#Create_Date_ID').val("")
    })

    $('#Main_Form_ID').submit(function() {
        var v_ID_ID = $('#ID_ID').val()
        var v_Email_ID = $('#Email_ID').val()
        var v_Username_ID = $('#Username_ID').val()
        var v_Fullname_ID = $('#Fullname_ID').val()
        var v_Department_ID = $('#Department_ID').val()
        var v_Position_ID = $('#Position_ID').val()
        var v_Create_Date_ID = $('#Create_Date_ID').val()

        var account = {
            'Email': v_Email_ID,
            'Username': v_Username_ID,
            'Fullname': v_Fullname_ID,
            'Department': v_Department_ID,
            'Position': v_Position_ID,
            'CreateDate': v_Create_Date_ID,
        }

        $.post("https://60d9bcac5f7bf100175476c0.mockapi.io/Accounts", account, function(data, status) {
            if (status == "error") {
                alert("Error when loading data");
                return;
            }

            getListEmployees();
        });
        return false;
    })
})


function showAccount() {
    $('#Result_TB').empty()

    for (var index = 0; index < listAccount.length; index++) {
        $('#Result_TB').append(`
        <tr>
        <th>${listAccount[index].AccountID}</th>
        <th>${listAccount[index].Email}</th>
        <th>${listAccount[index].Username}</th>
        <th>${listAccount[index].FullName}</th>
        <th>${listAccount[index].Department}</th>
        <th>${listAccount[index].Position}</th>
        <th>${listAccount[index].CreateDate}</th>
        <th><button class="btn btn-warning" onclick="editAccount(${index})">Edit</button></th>
        <th><button class="btn btn-warning" onclick="deleteAccount(${index})">Delete</button></th>
    </tr>
        `)
    }
}

function deleteAccount(Index) {
    var v_del_ID = listAccount[Index].AccountID;

    var confirm_del = confirm('Bạn có chắc chắn muốn xóa Account này không')
    if (confirm_del) {
        $.ajax({
            url: 'https://60d9bcac5f7bf100175476c0.mockapi.io/Accounts' + v_del_ID,
            type: 'DELETE',
            success: function(result) {
                // error
                if (result == undefined || result == null) {
                    alert("Error when loading data");
                    return;
                }

                getListEmployees();
            }
        });
    } else {
        return
    }

}

function editAccount(Index) {
    $('#ID_ID').val(listAccount[Index].AccountID)
    $('#Email_ID').val(listAccount[Index].Email)
    $('#Username_ID').val(listAccount[Index].Username)
    $('#Fullname_ID').val(listAccount[Index].FullName)
    $('#Department_ID').val(listAccount[Index].Department)
    $('#Position_ID').val(listAccount[Index].Position)
    $('#Create_Date_ID').val(listAccount[Index].CreateDate)

    $('#update_btn').click(function() {
        var v_ID_ID = $('#ID_ID').val()
        var v_Email_ID = $('#Email_ID').val()
        var v_Username_ID = $('#Username_ID').val()
        var v_Fullname_ID = $('#Fullname_ID').val()
        var v_Department_ID = $('#Department_ID').val()
        var v_Position_ID = $('#Position_ID').val()
        var v_Create_Date_ID = $('#Create_Date_ID').val()

        var account = {
            'AccountID': v_ID_ID,
            'Email': v_Email_ID,
            'Username': v_Username_ID,
            'Fullname': v_Fullname_ID,
            'Department': v_Department_ID,
            'Position': v_Position_ID,
            'CreateDate': v_Create_Date_ID,
        }

        $.ajax({
            url: 'https://60d9bcac5f7bf100175476c0.mockapi.io/Accounts' + v_ID_ID,
            type: 'PUT',
            data: account,
            success: function(result) {
                if (result == undefined || result == null) {
                    alert("Error when loading data");
                    return;
                }
                getListEmployees();
            }
        });
    })
}

function getListEmployees() {
    $.get("https://60d9bcac5f7bf100175476c0.mockapi.io/Accounts", function(data, status) {
        listAccount = [];

        if (status == "error") {
            alert("Error when loading data");
            return;
        }

        parseData(data);

        showAccount();
    })
}

function parseData(data) {
    data.forEach(function(item) {
        var account = {
            'AccountID': item.AccountID,
            'Email': item.Email,
            'Username': item.Username,
            'FullName': item.FullName,
            'Department': item.Department,
            'Position': item.Position,
            'CreateDate': item.CreateDate,
        }

        listAccount.push(account)
    });
}