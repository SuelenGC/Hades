package br.com.hades.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

import br.com.hades.domain.Estado;

@Embeddable
public class Localizacao {

	@NotNull	
	private String endereco;
	
	@NotNull	
	private String bairro;
	
	@NotNull	
	private int numeroEndereco;
	
	@NotNull	
	private String cidade;
	
	private String complementoEndereco;
	
	@NotNull	
	private String cep;
	
	@NotNull
	private Estado estado;

	public Localizacao() {}
	
	public Localizacao(Long id, String endereco, String bairro, int numero,
			String cidade, String complemento, String cep, Estado estado) {
		super();
		this.endereco = endereco;
		this.bairro = bairro;
		this.numeroEndereco = numero;
		this.cidade = cidade;
		this.complementoEndereco = complemento;
		this.cep = cep;
		this.estado = estado;
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

	public int getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(int numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return complementoEndereco;
	}

	public void setComplemento(String complemento) {
		this.complementoEndereco = complemento;
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
