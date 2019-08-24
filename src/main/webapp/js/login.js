var loginjs = {
    init: function () {
        $('#ingresar').bind('click',function(){
            doc = $('#documento').val();
            if (!doc) {
                  alert('Debe ingresar un documento');
            } else {

                ajax_process(
                    'http://localhost:8080/BancoBilardos/rest/cliente/'+doc,
                    'GET',
                    '',
                    function(response) {
                        if (response) {
                            var urlredireccion = 'http://localhost:8080/BancoBilardos/pinicio.html?id='+doc;
                            window.location.href=urlredireccion;  
                            console.log('se encontro ID');
                        } else {
                            alert('El ciudadano no se encuentra dado de alta.');
                        }
//                        
                    }
                );   
            }
        });
    }
};
$(document).ready(loginjs.init);