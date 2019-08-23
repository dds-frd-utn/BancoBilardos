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
        contentType: 'application/json',
        dataType:"json",
        url:url,
        success:callback,
        error:function(error){
        }
    });
}