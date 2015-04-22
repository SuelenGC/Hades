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

	public Testemunha(Long id, String nome, EstadoCivil estado,
			String nacionalidade, String profissao, String endereco,
			String bairro) {
		super();
		this.id = id;
		this.nome = nome;
		this.estado = estado;
		this.nacionalidade = nacionalidade;
		this.profissao = profissao;
		this.endereco = endereco;
		this.bairro = bairro;
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

	public EstadoCivil getEstado() {
		return estado;
	}

	public void setEstado(EstadoCivil estado) {
		this.estado = estado;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
}
