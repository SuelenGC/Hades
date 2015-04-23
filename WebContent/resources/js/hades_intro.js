$('#pago').click(function(){
	$('#intro_caixa_botoes').children().remove();

	var botao1 = '<button type="button" onClick="ultimo_refresh_botoes();" id="contratacao_normal" class="btn btn-block" style="margin-top:10%;">Contratação normal</button>';
    var botao2 = '<button type="button" onClick="ultimo_refresh_botoes();" id="corpo_vindo_de_fora" class="btn btn-block" style="margin-top:5%;">Corpo vindo de fora</button>';
    var botao3 = '<button type="button" onClick="ultimo_refresh_botoes();" id="membro" class="btn btn-block" style="margin-top:5%;">Membro</button>';
    var botao4 = '<button type="button" onClick="ultimo_refresh_botoes();" id="semi_intacto" class="btn btn-block" style="margin-top:5%;margin-bottom: 5%;">Semi intacto</button>';
	$('#intro_caixa_botoes').append(botao1).append(botao2).append(botao3).append(botao4);
});

$('#gratuito').click(function(){
	$('#intro_caixa_botoes').children().remove();

	var botao1 = '<button type="button" id="social" class="btn btn-block" style="margin-top:10%;">Social</button>';
    var botao2 = '<button type="button" id="membro" class="btn btn-block" style="margin-top:5%;">Membro</button>';
    var botao3 = '<button type="button" id="desconhecido" class="btn btn-block" style="margin-top:5%;margin-bottom:%5;">Desconhecido</button>';
	$('#intro_caixa_botoes').append(botao1).append(botao2).append(botao3);
});

function ultimo_refresh_botoes(){

	$('#intro_caixa_botoes').children().remove();

	var botao1 = '<button type="button" id="sepultamento" class="btn btn-block" style="margin-top:10%;">Sepultamento</button>';
    var botao2 = '<button type="button" id="cremacao" class="btn btn-block" style="margin-top:5%;margin-bottom:%5;">Cremação</button>';
    $('#intro_caixa_botoes').append(botao1).append(botao2); 

};