/**
 * Created by andrea
 */
$(function(){
    $("#btnIncribir").click(enviarPreinscripcion)

});


function enviarPreinscripcion(){
    var tipoId = $('#inputTipoId').val();
    var numeroDocumento = $('#inputDocumento').val();
    var nombres = $('#inputNombres').val();
    var apellidos = $('#inputApellidos').val();
    var telefono = $('#inputTelefono').val();
    var datos = {
        "tipoId" : tipoId,
        "numeroDocumento" : numeroDocumento,
        "nombres" : nombres,
        "apellidos" : apellidos,
        "telefono" : telefono
    };


    $.ajax({
        type: 'POST',
        url: '/preinscripcion',
        contentType: 'application/json',
        data: JSON.stringify(datos),
        success: function(data){
            // your code from above
            console.log("Success")
            window.location.href= '/preinscripciones';
        },
        error: function(xhr, textStatus, error){
            console.log(xhr.statusText);
            console.log(textStatus);
            console.log(error);
        }
    });

}