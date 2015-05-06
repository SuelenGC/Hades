package br.com.hades.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.hades.domain.DimensaoDeProduto;

@Entity
public class Compra {
	@Id
	@GeneratedValue
	private long id;
	
	private boolean remocaoCorpoNoLocalDeFalecimento;
	
	private String localRemocao;
	private String enderecoRemocao;
	
	private DimensaoDeProduto urna; //TODO tirar daqui quando tiver a interface do produto com tamanho
	private DimensaoDeProduto revestimento;
	
	ArrayList<ItemProduto> listaDeProdutos; //TODO usar interface
	
	private double taxaAdicional;
	
	private String observacoes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isRemocaoCorpoNoLocalDeFalecimento() {
		return remocaoCorpoNoLocalDeFalecimento;
	}

	public void setRemocaoCorpoNoLocalDeFalecimento(
			boolean remocaoCorpoNoLocalDeFalecimento) {
		this.remocaoCorpoNoLocalDeFalecimento = remocaoCorpoNoLocalDeFalecimento;
	}

	public String getLocalRemocao() {
		return localRemocao;
	}

	public void setLocalRemocao(String localRemocao) {
		this.localRemocao = localRemocao;
	}

	public String getEnderecoRemocao() {
		return enderecoRemocao;
	}

	public void setEnderecoRemocao(String enderecoRemocao) {
		this.enderecoRemocao = enderecoRemocao;
	}

	public DimensaoDeProduto getUrna() {						
		return urna;
	}

	public void setUrna(DimensaoDeProduto urna) {
		this.urna = urna;
	}

	public DimensaoDeProduto getRevestimento() {
		return revestimento;
	}

	public void setRevestimento(DimensaoDeProduto revestimento) {
		this.revestimento = revestimento;
	}

	public double getTaxaAdicional() {
		return taxaAdicional;
	}

	public void setTaxaAdicional(double taxaAdicional) {
		this.taxaAdicional = taxaAdicional;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Compra(boolean remocaoCorpoNoLocalDeFalecimento,
			String localRemocao, String enderecoRemocao,
			DimensaoDeProduto urna, DimensaoDeProduto revestimento,
			double taxaAdicional, String observacoes) {
		super();
		this.remocaoCorpoNoLocalDeFalecimento = remocaoCorpoNoLocalDeFalecimento;
		this.localRemocao = localRemocao;
		this.enderecoRemocao = enderecoRemocao;
		this.urna = urna;
		this.revestimento = revestimento;
		this.taxaAdicional = taxaAdicional;
		this.observacoes = observacoes;
	}
	
	public Compra() {
		
	}
}