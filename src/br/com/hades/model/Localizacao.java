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
	
	public Localizacao(Long id, String endereco, String bairro, int numero,
			String cidade, String complemento, String cep, Estado estado) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = cidade;
		this.complemento = complemento;
		this.cep = cep;
		this.estado = estado;
	}

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
