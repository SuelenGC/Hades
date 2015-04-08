package br.com.hades.model;

import javax.persistence.Entity;

import br.com.hades.domain.Estado;


@Entity
public class CertidaoNascimento {
	private String Cartorio;
	
	private String idade;
	
	private Estado estado;
	
	private int livro;
	
	private int folha;
	
	private int numCertidao;
	
	private boolean nascObito;
	
}
