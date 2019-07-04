function ajax_process ( 
    url, 
    metodo, 
    data,
    callback
) {
    if (!data) { data = ''; }
    $.ajax({
        data: data
        method:metodo,
        dataType:"json",
        url:url,
        success:callback,
        error:function(error){
            throw new Exception(error);
        }
    });
}