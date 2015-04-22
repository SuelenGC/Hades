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
	
}
