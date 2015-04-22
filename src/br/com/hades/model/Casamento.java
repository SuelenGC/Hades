package br.com.hades.model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import br.com.hades.domain.Estado;



@Entity
public class Casamento {
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Date dataCasamento;
	
	private String cartorio;
	
	private String cidade;
	
	private Estado uf;
	
	private int livro;
	
	private int folha;
	
	private int num;

	public Casamento(Long id, String nome, Date dataCasamento, String cartorio,
			String cidade, Estado uf, int livro, int folha, int num) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataCasamento = dataCasamento;
		this.cartorio = cartorio;
		this.cidade = cidade;
		this.uf = uf;
		this.livro = livro;
		this.folha = folha;
		this.num = num;
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

	public Date getDataCasamento() {
		return dataCasamento;
	}

	public void setDataCasamento(Date dataCasamento) {
		this.dataCasamento = dataCasamento;
	}

	public String getCartorio() {
		return cartorio;
	}

	public void setCartorio(String cartorio) {
		this.cartorio = cartorio;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Estado getUf() {
		return uf;
	}

	public void setUf(Estado uf) {
		this.uf = uf;
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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	}
