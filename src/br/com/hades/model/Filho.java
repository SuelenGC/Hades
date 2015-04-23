package br.com.hades.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import br.com.hades.domain.CategoriaIdade;


public class Filho {
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private CategoriaIdade idade;
	
	private String observacoes;

	public Filho(Long id, String nome, CategoriaIdade idade, String observacoes) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.observacoes = observacoes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CategoriaIdade getIdade() {
		return idade;
	}

	public void setIdade(CategoriaIdade idade) {
		this.idade = idade;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}
