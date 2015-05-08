package br.com.hades.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.hades.dao.CompraDao;
import br.com.hades.model.Compra;

@Controller
public class CompraController {

	@RequestMapping("compra/formulario")
	public String formulario() {
		return "compra/formulario";
	}
	

	@RequestMapping("compra/salvar")
	public String salvar(@Valid Compra compra, BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:compra/formulario";
		}
		
		CompraDao compraDao = new CompraDao();
		compraDao.inserir(compra);
		//compraDao.inserir(Compra.getFake());
		compraDao.close();
		
		return "redirect:compra/formulario";
	}
}
