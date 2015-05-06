package br.com.hades.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.hades.dao.DadosObitoDao;
import br.com.hades.model.DadosObito;

@Controller
public class DadosObitoController {

	@RequestMapping("dadosObito/formulario")
	public String formulario() {
		return "dadosObito/formulario";
	}
	

	@RequestMapping("dadosObito/salvar")
	public String salvar(@Valid DadosObito dadosObito, BindingResult result) {
		if (result.hasErrors()) {
			return "dadosObito/formulario";
		}
		
		DadosObitoDao dadosObitodao = new DadosObitoDao();
		dadosObitodao.inserir(dadosObito);
		dadosObitodao.close();
		
		return "dadosObito/ok";
	}
}
