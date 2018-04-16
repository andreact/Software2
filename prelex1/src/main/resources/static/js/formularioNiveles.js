$(function(){
    $("#btnAgregarn").click(enviarNivel)

});


function enviarNivel() {
    var codigo = $('#inputCodigo').val();
    var nombre = $('#inputNombre').val();
    var idioma = $('#inputIdioma').val();

    var datos = {
        "codigo": codigo,
        "nombre": nombre,
        "idioma": idioma,
    };


    $.ajax({
        type: 'POST',
        url: '/niveles',
        contentType: 'application/json',
        data: JSON.stringify(datos),
        success: function (data) {
            // your code from above
            console.log("Success")
            window.location.href = '/niveles';
        },
        error: function (xhr, textStatus, error) {
            console.log(xhr.statusText);
            console.log(textStatus);
            console.log(error);
        }
    });
}