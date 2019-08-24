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

function formatDate () {
  var d = new Date(),
      month = '' + (d.getMonth() + 1),
      day = '' + d.getDate(),
      year = d.getFullYear();

  if (month.length < 2) month = '0' + month;
  if (day.length < 2) day = '0' + day;
  return [year, month, day].join('-');
}