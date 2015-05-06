package br.com.hades.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String salvar(@Valid Contratante contratante, BindingResult result, @ModelAttribute Localizacao localizacao) {
		if (result.hasErrors()) {
			return "contratante/formulario";
		}
		
		contratante.setLocalizacao(localizacao);
		ContratanteDao contratantedao = new ContratanteDao();
		contratantedao.inserir(contratante);
		
		contratantedao.close();
		
		return "redirect:/falecido/formulario";
	}
	
	@ResponseBody
	@RequestMapping("contratante/busca/cpf/{cpf}")
	public Contratante buscaPorCpf(@PathVariable String cpf) {
		ContratanteDao contratantedao = new ContratanteDao();
		return Contratante.getFake();
		//return contratantedao.buscaPorCpf(cpf);
	}
}
