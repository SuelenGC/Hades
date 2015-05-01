package br.com.hades.controller;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.hades.dao.ContratanteDao;
import br.com.hades.domain.Estado;
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
	
	@ResponseBody
	@RequestMapping("contratante/busca/cpf/{cpf}")
	public Contratante buscaPorCpf(@PathVariable String cpf) {
//		ContratanteDao contratantedao = new ContratanteDao();
		Contratante contratante = null;//contratantedao.buscaPorCpf(cpf);
		
		Localizacao localizacao = new Localizacao(1L, "Av. dos Ourives", "Jd. Sao Saverio", 433, "São Paulo", "ap 12 bl 1", "04194-260", Estado.SP);
		contratante = new Contratante(1L, "Suelen Goularte Carvalho", "342.302.848.37", "40536691-2", "Mobile Leader", "Filha", "(11) 8888-8888", "(11) 95020-0060", "suelengcarvalho@gmail.com", "Sonia Goularte", localizacao, "sem nome", "");
		
		//model.addAttribute("contratante", contratante);
		return contratante;
	}
}
