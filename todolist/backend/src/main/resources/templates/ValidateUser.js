function verifyConfirmPassWord() {
    var cpw = document.getElementById("Confirm_Password_ID").value;

    if(cpw == ""){
        document.getElementById("message").innerHTML = "* Nhập lại mật khẩu!"
        return false;
    }else{
        alert("Mật khẩu chính xác");
    }
}

function verifyPassword(){
    var pw = document.getElementById("Password_ID").value;
    if (pw == ""){
    document.getElementById("message").innerHTML = "* Nhập vào mật khẩu"
    }
    if(pw.length <6 || pw.length > 12){
        document.getElementById("message").innerHTML = "* Mật khẩu từ 6 - 12 kí tự"
        return false;
    }else{
        alert("Mật khẩu chính xác");
    }
}

function verifyUserNameLogin(){
    var unl = document.getElementById("Username_login_id").value;
    if (un == ""){
        document.getElementById("message").innerHTML = "* Nhập vào user name của"
        return false;
    }
    if(un.length <6 || un.length > 12){
        document.getElementById("message").innerHTML = "* User name phải trong khoảng 6 - 12 kí tự"
        return false;
    }
}

function verifyUserNameSignUp(){
    var uns = document.getElementById("User_Name_ID").value;
    if (uns == ""){
        document.getElementById("message").innerHTML = "* Nhập vào user name của"
        return false;
    }
    if(uns.length <6 || uns.length > 12){
        document.getElementById("message").innerHTML = "* User name phải trong khoảng 6 - 12 kí tự"
        return false;
    }
}