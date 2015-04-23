package br.com.hades.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.hades.dao.ContratanteDao;
import br.com.hades.model.Contratante;
import br.com.hades.model.Localizacao;

@Controller
public class ContratanteController {

	@RequestMapping("contratante/formulario")
	public String formulario() {
		return "contratante/formulario";
	}
	

	@RequestMapping("contratante/salvar")
	public String salvar(@Valid Contratante contratante, BindingResult result) {
		if (result.hasErrors()) {
			return "contratante/formulario";
		}
		
//		contratante.setLocalizacao(localizacao);
		ContratanteDao contratantedao = new ContratanteDao();
		contratantedao.inserir(contratante);
		contratantedao.close();
		
		return "contratante/ok";
	}
}
