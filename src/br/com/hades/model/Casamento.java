package br.com.hades.model;

import java.util.Calendar;

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
	private Long id;
	
	@NotNull
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataCasamento;
	
	private String cartorio;
	
	private String cidade;
	
	private Estado uf;
	
	private int livro;
	
	private int folha;
	
	private int num;
}
