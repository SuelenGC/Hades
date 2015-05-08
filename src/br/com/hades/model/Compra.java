package br.com.hades.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import br.com.hades.domain.DimensaoDeProduto;

@Entity
public class Compra {
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private boolean remocaoCorpoNoLocalDeFalecimento;
	
	private String localRemocao;
	private String enderecoRemocao;
	
	private boolean finalizada;
	
	//@ManyToOne(cascade = CascadeType.ALL)
	@ElementCollection
    @CollectionTable 
	List<ItemCompra> listaDeProdutos = new ArrayList<ItemCompra>();
	
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
			double taxaAdicional, String observacoes) {
		super();
		this.remocaoCorpoNoLocalDeFalecimento = remocaoCorpoNoLocalDeFalecimento;
		this.localRemocao = localRemocao;
		this.enderecoRemocao = enderecoRemocao;
		this.taxaAdicional = taxaAdicional;
		this.observacoes = observacoes;
	}
	
	
	public Compra(boolean remocaoCorpoNoLocalDeFalecimento,
			String localRemocao, String enderecoRemocao,
			ArrayList<ItemCompra> listaDeProdutos, double taxaAdicional,
			String observacoes) {
		super();
		this.remocaoCorpoNoLocalDeFalecimento = remocaoCorpoNoLocalDeFalecimento;
		this.localRemocao = localRemocao;
		this.enderecoRemocao = enderecoRemocao;
		this.listaDeProdutos = listaDeProdutos;
		this.taxaAdicional = taxaAdicional;
		this.observacoes = observacoes;
	}

	public Compra() {
		
	}
	
	public boolean isFinalizada() {
		return finalizada;
	}

	public void setFinalizada(boolean finalizada) {
		this.finalizada = finalizada;
	}

	public List<ItemCompra> getListaDeProdutos() {
		return listaDeProdutos;
	}

	public void setListaDeProdutos(ArrayList<ItemCompra> listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	}

	public static Compra getFake() {
		ArrayList<ItemCompra> lista = new ArrayList<ItemCompra>();
		lista.add(ItemCompra.getFake());
		return new Compra(false, "Hospital X", "Rua X", lista, 1.0, "Bla");
	}
}