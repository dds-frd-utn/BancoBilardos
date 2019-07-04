function ajax_process (url, metodo, callback) {
    $.ajax({
        method:metodo,
        dataType:"json",
        url:url,
        success:callback,
        error:function(error){
            throw new Exception(error);
        }
    });
}