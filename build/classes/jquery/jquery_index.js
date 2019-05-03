$(function(){
	$('#btVotar').click(function(){
		$("#form").attr("action","sistema?log=ValidarUsuario")
		$('#containerForm').toggleClass('tamanhoContainerLogin');
		$('#containerBotoes').hide();
		$('#containerForm').slideDown(500);
	});
	$('#btAreaMesario').click(function(){
		$("#form").attr("action","sistema?log=ValidarMesario");
		$('#containerForm').toggleClass('tamanhoContainerLogin');
		$('#containerBotoes').hide();
		$('#containerForm').slideDown(500);
	});
	$('#btAreaSupervisor').click(function(){
		$("#form").attr("action","sistema?log=ValidarChefe");
		$('#containerForm').toggleClass('tamanhoContainerLogin');
		$('#containerBotoes').hide();
		$('#containerForm').slideDown(500);
	});
	$('#btVoltar').click(function(){
		$('#containerForm').hide();
		$('#containerBotoes').slideDown(500);
	});
	$("#btLogar").click(function() {
		var URLModel = $("#form").attr("action")
		$.ajax({
			method: "POST",
			url: URLModel,
			data: {usuario: $("#nUsuario").val(), senha: $("#senha").val()},
			success: function(dados){
				
			}
		})
	})
});