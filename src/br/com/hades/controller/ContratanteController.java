package br.com.hades.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.hades.model.Contratante;
import br.com.hades.model.Localizacao;

@Controller
public class ContratanteController {

	@RequestMapping("contratante/formulario")
	public String formulario() {
		return "contratante/formulario";
	}
	

	@RequestMapping("contratante/salvar")
	public String salvar(Contratante contratante, Localizacao localizacao) {
		//Pegar informações da tela
		contratante.setLocalizacao(localizacao);
		
		//Salvar no banco
		
		//Ir para próximo
		return "";
	}
}
