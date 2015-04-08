package br.com.hades.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import br.com.hades.domain.Estado;

@Entity
public class Localizacao {

	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull	
	private String endereco;
	
	@NotNull	
	private String bairro;
	
	@NotNull	
	private int numero;
	
	@NotNull	
	private String cidade;
	
	private String complemento;
	
	@NotNull	
	private String cep;
	
	@NotNull
	private Estado estado;
}
