
$('#filtro_anterior').click(function(){
	$('#pago').trigger('click');
});
$('#cancelar').click(function(){
	$('#pago').trigger('click');
});
$('#pago').click(function(){
	$('#intro_caixa_botoes').children().remove();
	$('#titulo_caixa').children().remove();
	var titulo = '<h1>Tipo de Contratação</h1>';
    var url = 'tipoOperacao=1';
	var botao1 = '<button type="button" onClick="destino_final(1, \''+ url+'\');" id="contratacao_normal" class="btn btn-block" style="margin-top:10%;">1. Contratação <b><u>n</u></b>ormal</button>';
    var botao2 = '<button type="button" onClick="destino_final(2, \''+ url+'\');" id="corpo_vindo_de_fora" class="btn btn-block" style="margin-top:5%;">2. Corpo vindo de <b><u>f</u></b>ora</button>';
    var botao3 = '<button type="button" onClick="destino_final(3, \''+ url+'\');" id="membro" class="btn btn-block" style="margin-top:5%;">3. <b><u>M</u></b>embro</button>';
    var botao4 = '<button type="button" onClick="destino_final(4, \''+ url+'\');" id="semi_intacto" class="btn btn-block" style="margin-top:5%;margin-bottom: 5%;">4. <b><u>S</u></b>emi intacto</button>';
    $('#titulo_caixa').append(titulo);
	$('#intro_caixa_botoes').append(botao1).append(botao2).append(botao3).append(botao4);
});
$('#pago').click(function(){
	$('#intro_caixa_botoes').children().remove();
	$('#titulo_caixa').children().remove();
	var titulo = '<h1>Tipo de Contratação</h1>';
    var url = 'tipoOperacao=1';
	var botao1 = '<button type="button" onClick="destino_final(1, \''+ url+'\');" id="contratacao_normal" class="btn btn-block" style="margin-top:10%;">1. Contratação <b><u>n</u></b>ormal</button>';
    var botao2 = '<button type="button" onClick="destino_final(2, \''+ url+'\');" id="corpo_vindo_de_fora" class="btn btn-block" style="margin-top:5%;">2. Corpo vindo de <b><u>f</u></b>ora</button>';
    var botao3 = '<button type="button" onClick="destino_final(3, \''+ url+'\');" id="membro" class="btn btn-block" style="margin-top:5%;">3. <b><u>M</u></b>embro</button>';
    var botao4 = '<button type="button" onClick="destino_final(4, \''+ url+'\');" id="semi_intacto" class="btn btn-block" style="margin-top:5%;margin-bottom: 5%;">4. <b><u>S</u></b>emi intacto</button>';
    $('#titulo_caixa').append(titulo);
	$('#intro_caixa_botoes').append(botao1).append(botao2).append(botao3).append(botao4);
});

$('#gratuito').click(function(){
	$('#intro_caixa_botoes').children().remove();
	$('#titulo_caixa').children().remove();
	var titulo = '<h1>Tipo de Contratação</h1>';
	var url = "tipoOperacao=2";
	var botao1 = '<button type="button" onclick="contratacoes_gratuito(1, \''+ url+'\');"  id="social" class="btn btn-block" style="margin-top:10%;">1. <b><u>S</u></b>ocial</button>';
    var botao2 = '<button type="button" onclick="contratacoes_gratuito(2, \''+ url+'\');"  id="membro" class="btn btn-block" style="margin-top:5%;">2. <b><u>M</u></b>embro</button>';
    var botao3 = '<button type="button" onclick="contratacoes_gratuito(3, \''+ url+'\');"  id="desconhecido" class="btn btn-block" style="margin-top:5%;margin-bottom:5%;">3. <b><u>D</u></b>esconhecido</button>';
	$('#intro_caixa_botoes').append(botao1).append(botao2).append(botao3);
	$('#titulo_caixa').append(titulo);
});

$('#registro_de_obito').click(function(){
	/* FINAL */
	var url = "tipoOperacao=3";
});

function destino_final(valor, urlAnterior){
	var	url = urlAnterior + "&tipoContratacao="+valor;
	$('#intro_caixa_botoes').children().remove();
	$('#titulo_caixa').children().remove();
	var titulo = '<h1>Destino Final</h1>';

	var botao1 = '<button type="button" onclick="destinoFinal(1, \''+ url+'\');" id="sepultamento" class="btn btn-block" style="margin-top:10%;">1. <b><u>S</u></b>epultamento</button>';
    var botao2 = '<button type="button" onclick="destinoFinal(2, \''+ url+'\');" id="cremacao" class="btn btn-block" style="margin-top:5%;margin-bottom:5%;">2. <b><u>C</u></b>remação</button>';
    $('#intro_caixa_botoes').append(botao1).append(botao2); 
    $('#titulo_caixa').append(titulo);

}

function inicio(){
	$('#intro_caixa_botoes').children().remove();
	$('#titulo_caixa').children().remove();
	var titulo = '<h1>Tipo de Contratação</h1>';
    var url = 'tipoOperacao=1';
	var botao1 = '<button type="button" onClick="destino_final(1, \''+ url+'\');" id="contratacao_normal" class="btn btn-block" style="margin-top:10%;">1. Contratação <b><u>n</u></b>ormal</button>';
    var botao2 = '<button type="button" onClick="destino_final(2, \''+ url+'\');" id="corpo_vindo_de_fora" class="btn btn-block" style="margin-top:5%;">2. Corpo vindo de <b><u>f</u></b>ora</button>';
    var botao3 = '<button type="button" onClick="destino_final(3, \''+ url+'\');" id="membro" class="btn btn-block" style="margin-top:5%;">3. <b><u>M</u></b>embro</button>';
    var botao4 = '<button type="button" onClick="destino_final(4, \''+ url+'\');" id="semi_intacto" class="btn btn-block" style="margin-top:5%;margin-bottom: 5%;">4. <b><u>S</u></b>emi intacto</button>';
    $('#titulo_caixa').append(titulo);
	$('#intro_caixa_botoes').append(botao1).append(botao2).append(botao3).append(botao4);
	var	url = urlAnterior + "&tipoContratacao="+valor;
	var titulo = '<h1>Destino Final</h1>';

	var botao1 = '<button type="button" onclick="destinoFinal(1, \''+ url+'\');" id="sepultamento" class="btn btn-block" style="margin-top:10%;">1. <b><u>S</u></b>epultamento</button>';
    var botao2 = '<button type="button" onclick="destinoFinal(2, \''+ url+'\');" id="cremacao" class="btn btn-block" style="margin-top:5%;margin-bottom:5%;">2. <b><u>C</u></b>remação</button>';
    $('#intro_caixa_botoes').append(botao1).append(botao2); 
    $('#titulo_caixa').append(titulo);
}

function contratacoes_gratuito(valor, urlAnterior)
{
	var url = urlAnterior + "&tipoContratacao=" + valor +"&destFinal=1";
	/* FINAL */
}

function destinoFinal(valor, urlAnterior)
{
	var url = urlAnterior + "&destFinal=" + valor;
	/* FINAL */
}




function textsizer(e){
    var evtobj=window.event? event : e //distinguish between IE's explicit event object (window.event) and Firefox's implicit.
    var unicode=evtobj.charCode? evtobj.charCode : evtobj.keyCode
    var actualkey=String.fromCharCode(unicode)
    
    verifica_acao(actualkey);
   

    //alert(actualkey);
}

function verifica_acao(tecla){
	if($('#pago').length == 1){
		acao_primeira_tela(tecla);
	}
	else if($('#contratacao_normal').length == 1){
	    acao_segunda_tela_pago(tecla);
	}
	else if($('#social').length == 1){
	    acao_segunda_tela_gratuito(tecla);	    
	}
	else if($('#sepultamento').length == 1){
	    acao_terceira_tela(tecla);	    
	}

}

function acao_primeira_tela(tecla){
	if(tecla == 'p' || tecla == 'P' || tecla == 1){
    	$('#pago').trigger('click');
    }
    else if(tecla == 'g' || tecla == 'G' || tecla == 2){
    	$('#gratuito').trigger('click');
    }
    else if(tecla == 'r' || tecla == 'R' || tecla == 3){
    	$('#registro_de_obito').trigger('click');
    }
}

function acao_segunda_tela_pago(tecla){
	if(tecla == 'n' || tecla == 'N' || tecla == 1){
    	$('#contratacao_normal').trigger('click');
    }
    else if(tecla == 'f' || tecla == 'F' || tecla == 2){
    	$('#corpo_vindo_de_fora').trigger('click');
    }
    else if(tecla == 'm' || tecla == 'M' || tecla == 3){
    	$('#membro').trigger('click');
    }
    else if(tecla == 's' || tecla == 'S' || tecla == 4){
    	$('#semi_intacto').trigger('click');
    }
}

function acao_segunda_tela_gratuito(tecla){
	if(tecla == 's' || tecla == 'S' || tecla == 1){
    	$('#social').trigger('click');
    }
    else if(tecla == 'm' || tecla == 'M' || tecla == 2){
    	$('#membro').trigger('click');
    }
    else if(tecla == 'd' || tecla == 'D' || tecla == 3){
    	$('#desconhecido').trigger('click');
    }
}

function acao_terceira_tela(tecla){
	if(tecla == 's' || tecla == 'S' || tecla == 1){
    	$('#sepultamento').trigger('click');
    }
    else if(tecla == 'c' || tecla == 'C' || tecla == 2){
    	$('#cremacao').trigger('click');
    }
}

document.onkeypress = textsizer
