$(function(){
	$('#entrada').click(function() {
		$("#form").attr("action","sistema?log=ComputarVoto");
	});
	$('#btnCorrige').click(function(){
		$("#entrada").val("");
		$("#form").attr("action","sistema?log=ComputarVoto")
	});
	$('#btnBranco').click(function(){
		$("#entrada").val("0");
		$("#form").attr("action","sistema?log=ComputarVoto");
	});
});