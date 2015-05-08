package br.com.hades.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IntroController {
	@RequestMapping("menu/intro_hades")
	public String intro() {
		return "menu/intro_hades";
	}
}
