package br.com.hades.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import br.com.hades.domain.Estado;

@Entity
public class Localizacao {

	@Id
	@GeneratedValue
	private long id;
	
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

	public Localizacao(long id, String endereco, String bairro,
			int numeroEndereco, String cidade, String complementoEndereco,
			String cep, Estado estado) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.bairro = bairro;
		this.numeroEndereco = numeroEndereco;
		this.cidade = cidade;
		this.complementoEndereco = complementoEndereco;
		this.cep = cep;
		this.estado = estado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getComplementoEndereco() {
		return complementoEndereco;
	}

	public void setComplementoEndereco(String complementoEndereco) {
		this.complementoEndereco = complementoEndereco;
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
