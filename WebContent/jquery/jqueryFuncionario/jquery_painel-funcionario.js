/**
 * 
 */
$(function() {
	$('#btRelatorio').click(function() {
		$(this).addClass('botaoSelecionado');
		$('#btAreaValidacao').removeClass('botaoSelecionado')
		$('#containerAreaValidacao').hide();
		$('#containerRelatorio').slideDown(500);
	});
	$('#btAreaValidacao').click(function() {
		$(this).addClass('botaoSelecionado');
		$('#btRelatorio').removeClass('botaoSelecionado')
		$('#containerRelatorio').hide();
		$('#containerAreaValidacao').slideDown(500);
	});
});