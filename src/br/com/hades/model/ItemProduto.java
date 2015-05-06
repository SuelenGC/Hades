package br.com.hades.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class ItemProduto {
	
	@OneToOne
	private Produto produto; //TODO fazer interface do produto com dimensao
	
	private int quantidade;
}
