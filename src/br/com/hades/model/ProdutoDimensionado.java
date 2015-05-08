package br.com.hades.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import br.com.hades.domain.DimensaoDeProduto;

@Entity
public class ProdutoDimensionado extends Produto {
	@NotNull
	DimensaoDeProduto dimensao;

	public ProdutoDimensionado(DimensaoDeProduto dimensao) {
		super();
		this.dimensao = dimensao;
	}
	
	public ProdutoDimensionado() {
		
	}

	public DimensaoDeProduto getDimensao() {
		return dimensao;
	}

	public void setDimensao(DimensaoDeProduto dimensao) {
		this.dimensao = dimensao;
	}
}
