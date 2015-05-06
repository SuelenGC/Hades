$('#pago').click(function(){
	$('#intro_caixa_botoes').children().remove();

	var botao1 = '<button type="button" onClick="ultimo_refresh_botoes();" id="contratacao_normal" class="btn btn-block" style="margin-top:10%;">Contratação <b><u>n</u></b>ormal</button>';
    var botao2 = '<button type="button" onClick="ultimo_refresh_botoes();" id="corpo_vindo_de_fora" class="btn btn-block" style="margin-top:5%;">Corpo vindo de <b><u>f</u></b>ora</button>';
    var botao3 = '<button type="button" onClick="ultimo_refresh_botoes();" id="membro" class="btn btn-block" style="margin-top:5%;"><b><u>M</u></b>embro</button>';
    var botao4 = '<button type="button" onClick="ultimo_refresh_botoes();" id="semi_intacto" class="btn btn-block" style="margin-top:5%;margin-bottom: 5%;"><b><u>S</u></b>emi intacto</button>';
	$('#intro_caixa_botoes').append(botao1).append(botao2).append(botao3).append(botao4);
});

$('#gratuito').click(function(){
	$('#intro_caixa_botoes').children().remove();

	var botao1 = '<button type="button" id="social" class="btn btn-block" style="margin-top:10%;"><b><u>S</u></b>ocial</button>';
    var botao2 = '<button type="button" id="membro" class="btn btn-block" style="margin-top:5%;"><b><u>M</u></b>embro</button>';
    var botao3 = '<button type="button" id="desconhecido" class="btn btn-block" style="margin-top:5%;margin-bottom:%5;"><b><u>D</u></b>esconhecido</button>';
	$('#intro_caixa_botoes').append(botao1).append(botao2).append(botao3);
});

function ultimo_refresh_botoes(){

	$('#intro_caixa_botoes').children().remove();

	var botao1 = '<button type="button" id="sepultamento" class="btn btn-block" style="margin-top:10%;"><b><u>S</u></b>epultamento</button>';
    var botao2 = '<button type="button" id="cremacao" class="btn btn-block" style="margin-top:5%;margin-bottom:%5;"><b><u>C</u></b>remação</button>';
    $('#intro_caixa_botoes').append(botao1).append(botao2); 

};


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
