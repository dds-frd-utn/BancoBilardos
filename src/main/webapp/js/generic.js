function ajax_process (url, metodo) {
    $.ajax({
        method:metodo,
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