package br.com.hades.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.hades.dao.FalecidoDao;
import br.com.hades.dao.LocalizacaoDao;
import br.com.hades.model.Falecido;
import br.com.hades.model.Localizacao;

@Controller
public class FalecidoController {

	@RequestMapping("falecido/formulario")
	public String formulario() {
		return "falecido/formulario";
	}
	

	@RequestMapping("falecido/salvar")
	public String salvar(@Valid Falecido falecido, BindingResult result, @ModelAttribute Localizacao localizacao) {
		if (result.hasErrors()) {
			return "falecido/formulario";
		}
		
		falecido.setLocalizacao(localizacao);
		FalecidoDao falecidodao = new FalecidoDao();
		falecidodao.inserir(falecido);
		falecidodao.close();
		
		return "redirect:falecido/dadosObito";
	}
}
