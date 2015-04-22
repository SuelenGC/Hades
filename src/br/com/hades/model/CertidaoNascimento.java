package br.com.hades.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.hades.domain.Estado;


@Entity
public class CertidaoNascimento {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String cartorio;
	
	private String idade;
	
	private Estado estado;
	
	private int livro;
	
	private int folha;
	
	private int numCertidao;
	
	private boolean nascObito;

	public CertidaoNascimento(String cartorio, String idade, Estado estado,
			int livro, int folha, int numCertidao, boolean nascObito) {
		super();
		Cartorio = cartorio;
		this.idade = idade;
		this.estado = estado;
		this.livro = livro;
		this.folha = folha;
		this.numCertidao = numCertidao;
		this.nascObito = nascObito;
	}

	public String getCartorio() {
		return Cartorio;
	}

	public void setCartorio(String cartorio) {
		Cartorio = cartorio;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public int getLivro() {
		return livro;
	}

	public void setLivro(int livro) {
		this.livro = livro;
	}

	public int getFolha() {
		return folha;
	}

	public void setFolha(int folha) {
		this.folha = folha;
	}

	public int getNumCertidao() {
		return numCertidao;
	}

	public void setNumCertidao(int numCertidao) {
		this.numCertidao = numCertidao;
	}

	public boolean isNascObito() {
		return nascObito;
	}

	public void setNascObito(boolean nascObito) {
		this.nascObito = nascObito;
	}
	
}
