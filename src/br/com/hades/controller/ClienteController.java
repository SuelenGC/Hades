package br.com.hades.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClienteController {

	@RequestMapping("cliente/formulario")
	public String form() {
		return "cliente/formulario";
	}
}
