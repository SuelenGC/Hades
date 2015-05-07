package br.com.hades.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames = {"nome"}))
public class Produto {
	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	private String nome;
	@NotNull
	private String udm; //TODO transformar em enum
	
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
	public String getUdm() {
		return udm;
	}
	public void setUdm(String udm) {
		this.udm = udm;
	}
	public double getValorUnidade() {
		return valorUnidade;
	}
	public void setValorUnidade(double valorUnidade) {
		this.valorUnidade = valorUnidade;
	}
	public Produto() {
		super();
	}
	public Produto(String nome, String udm, double valorUnidade) {
		super();
		this.nome = nome;
		this.udm = udm;
		this.valorUnidade = valorUnidade;
	}
	public Produto(String nome, double valorUnidade) {
		super();
		this.udm = "m";
		this.nome = nome;
		this.valorUnidade = valorUnidade;
	}
	@NotNull
	private double valorUnidade; //TODO confirmar que nao varia de acordo com a dimensao
	
	public static Produto getFake() {
		// TODO Auto-generated method stub
		return new Produto("Jasmim", "m", 4.2);
	}
}
