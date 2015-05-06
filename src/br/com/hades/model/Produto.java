package br.com.hades.model;

import javax.persistence.Entity;

@Entity
public class Produto {
	private String nome;
	private String udm; //TODO transformar em enum
	private double valorUnidade; //TODO confirmar que nao varia de acordo com a dimensao
}
