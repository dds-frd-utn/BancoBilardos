var loginjs = {
    init: function () {
        $('#ingresar').bind('click',function(){
            ajax_process('http://localhost:8080/bancobilardos/rest/cliente/1','GET');
//            window.open('pinicio.html');
        });
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