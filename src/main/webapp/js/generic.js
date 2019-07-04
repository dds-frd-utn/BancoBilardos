console.log('generic.js');
function ajax_process ( 
    url, 
    metodo, 
    data,
    callback
) {
    console.log(data);
    if (!data) { data = ''; }
    $.ajax({
        data: data,
        method:metodo,
        dataType:"json",
        url:url,
        success:callback,
        error:function(error){
            console.log(error);
        }
    });
}