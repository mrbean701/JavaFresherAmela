function createNewUser() {
    var v_Full_Name = document.getElementById("Full_Name_ID").value;
    var v_Username = document.getElementById("Username_ID").value;
    var v_Password = document.getElementById("Password_ID").value;
    var v_Confirm_Password = document.getElementById("Confirm_Password_ID").value;

    if (v_Password != v_Confirm_Password) {
        alert("Mật khẩu không trùng khớp");
    } else {
        var user = {
            username: v_Username,
            password: v_Password,
        }
        window.open("LoginPage.html", "_self");
        var json = JSON.stringify(user); // convert  string to object    with    properties  and values

        localStorage.setItem('user', json);
        /*The Storage object of the Web Storage API provides access
        to the session storage or local storage for a particular domain. This allows you to read, add, modif
        y, and delete stored data items.
        */
    }
}

function loginSuccess() {
    var v_Username_ID = document.getElementById("v_Username_ID").value;
    var v_Password_ID = document.getElementById("v_Password_ID").value;
    var user = JSON.parse(localStorage.getItem("user")) // Get the value of the specified local storage item:

    if ((user.Username == v_Username_ID) && (user.Password == v_Password_ID)) {
        alert('Đăng nhập thành công');
        window.open("HomePage.html", "_self");
    } else {
        alert('Kiểm tra lại thông tin đăng nhập!!!');
    }
}

function returnPageRegister() {
    window.open("Register.html", "_self")
}

function resetPageRegister() {
    //    document.getElementById("Name_ID").value = '';
    //    document.getElementById("Username_ID").value = '';
    //    document.getElementById("Password_ID").value = '';
    //    document.getElementById("Confirm_Password_ID").value = '';
    document.getElementById("form").reset();
}