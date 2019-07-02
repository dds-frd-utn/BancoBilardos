var loginjs = {
    init: function () {
        loginjs.ajax('http://localhost:8080/bancobilardos/rest/cliente/1')
    },
    ajax: function (url) {
        $.ajax({
            method:"GET",
            dataType:"json",
            url:url,
            success:function(response){
                console.log(response);
            },
            error:function(error){
                console.log(error);
            }
        });
    }
};
$(document).ready(loginjs.init);