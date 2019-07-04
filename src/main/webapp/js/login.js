var loginjs = {
    init: function () {
        $('#ingresar').bind('click',function(){
            doc = $('#documento').val();
            if (!doc){
                  alert('Debe ingresar un documento');
            } else {
//                ajax_process('http://localhost:8080/bancobilardos/rest/cliente/'+doc,'GET');
                ajax_process(
                    'http://localhost:8080/bancobilardos/rest/cliente/'+doc,
                    'GET',
                    function(response) {
                        if (response) {
                            window.open('pinicio.html','_self');
                            console.log('se encontro ID');
                        } else {
                            console.log('no se encontro ID');
                        }
//                        
                    }
                );   
            }
        });
    }
};
$(document).ready(loginjs.init);