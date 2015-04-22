package br.com.hades.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class NascimentoObito {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private String localNascimento;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	private String horarioNascimento;
	
	@NotNull
	private String avoPaterno;
	
	@NotNull
	private String avoMaterno;
	
	@NotNull
	private String avoPaterna;
	
	@NotNull
	private String avoMaterna;
	
	//@NotNull
	//private Testemunha testemunha1;
	
	//@NotNull
	//private Testemunha testemunha2;
	
	@NotNull
	private int semanasGestacao;
	
	@NotNull
	private String gravidez;
}
