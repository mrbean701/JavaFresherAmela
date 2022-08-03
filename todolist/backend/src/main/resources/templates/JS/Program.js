 $(function() {
     $(".header").load("Header.html");
     $(".main").load("HomePage.html");
     $(".footer").load("Footer.html");
 });

function clickViewListTask() {
$(".main").load("HomePage.html", function(){
    buildTable();
});
}

var tasks = [];


function getListTasks() {
    // call API from server
    $.get("http://localhost:8080/api/v1/tasks", function(data, status) {

        // reset list employees
        tasks = [];


        // error
        if (status == "error") {
            // TODO
            alert("Error when loading data");
            return;
        }

        // success
        tasks = data;
        fillTasksToTable();
    });
}


function fillTasksToTable() {
    tasks.forEach(function(item) {
        $('tbody').append(
            '<tr>' +
            '<td>' + item.Title + '</td>' +
            '<td>' + item.Status + '</td>' +
            '<td>' +
            '<a class="edit" title="Edit" data-toggle="tooltip" onclick="openUpdateModal(' + item.id + ')"><i class="material-icons">&#xE254;</i></a>' +
            '<a class="delete" title="Delete" data-toggle="tooltip" onClick="openConfirmDelete(' + item.id + ')"><i class="material-icons">&#xE872;</i></a>' +
            '</td>' +
            '</tr>')

    });

}

function buildTable() {
    $('tbody').empty();
    getListTasks();
}


function clickCreateNewTask({


})