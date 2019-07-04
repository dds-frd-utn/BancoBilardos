var loginjs = {
    init: function () {
        var btnIngresar = $('#ingresar').bind('click',function(){
            doc = $('#documento').val();
            if (!doc){
                  alert('Debe ingresar un documento');
            } else {
//                ajax_process('http://localhost:8080/bancobilardos/rest/cliente/'+doc,'GET');
                ajax_process(
                    'http://lsi.no-ip.org:8282/esferopolis/api/ciudadano/'+doc,
                    'GET',
                    function(response) {
                        console.log(response);
                    }
                );   
            }
        });
    }
};
$(document).ready(loginjs.init);