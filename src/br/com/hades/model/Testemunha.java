package br.com.hades.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import br.com.hades.domain.EstadoCivil;

@Entity
public class Testemunha {
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private EstadoCivil estado;
	
	@NotNull
	private String nacionalidade;
	
	private String profissao;
	
	private String endereco;
	
	private String bairro;
}
