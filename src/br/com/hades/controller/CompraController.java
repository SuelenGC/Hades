package br.com.hades.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.hades.dao.CompraDao;
import br.com.hades.model.Compra;

@Controller
public class CompraController {

	@RequestMapping("produto/formulario")
	public String formulario() {
		return "escolhaProduto/formulario";
	}
	

	@RequestMapping("produto/salvar")
	public String salvar(@Valid Compra escolhaProduto, BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:produto/formulario";
		}
		
		CompraDao escolhaProdutodao = new CompraDao();
		escolhaProdutodao.inserir(escolhaProduto);
		escolhaProdutodao.close();
		
		return "redirect:produtos/formulario";
	}
}
