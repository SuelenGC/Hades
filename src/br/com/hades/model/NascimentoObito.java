package br.com.hades.model;

import java.util.Calendar;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


public class NascimentoObito {
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
	
	@NotNull
	private Testemunha testemunha1, testemunha2;
	
	@NotNull
	private int semanasGestacao;
	
	@NotNull
	private String gravidez;

	public NascimentoObito(String localNascimento, Calendar dataNascimento,
			String horarioNascimento, String avoPaterno, String avoMaterno,
			String avoPaterna, String avoMaterna, Testemunha testemunha1,
			Testemunha testemunha2, int semanasGestacao, String gravidez) {
		super();
		this.localNascimento = localNascimento;
		this.dataNascimento = dataNascimento;
		this.horarioNascimento = horarioNascimento;
		this.avoPaterno = avoPaterno;
		this.avoMaterno = avoMaterno;
		this.avoPaterna = avoPaterna;
		this.avoMaterna = avoMaterna;
		this.testemunha1 = testemunha1;
		this.testemunha2 = testemunha2;
		this.semanasGestacao = semanasGestacao;
		this.gravidez = gravidez;
	}

	public String getLocalNascimento() {
		return localNascimento;
	}

	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getHorarioNascimento() {
		return horarioNascimento;
	}

	public void setHorarioNascimento(String horarioNascimento) {
		this.horarioNascimento = horarioNascimento;
	}

	public String getAvoPaterno() {
		return avoPaterno;
	}

	public void setAvoPaterno(String avoPaterno) {
		this.avoPaterno = avoPaterno;
	}

	public String getAvoMaterno() {
		return avoMaterno;
	}

	public void setAvoMaterno(String avoMaterno) {
		this.avoMaterno = avoMaterno;
	}

	public String getAvoPaterna() {
		return avoPaterna;
	}

	public void setAvoPaterna(String avoPaterna) {
		this.avoPaterna = avoPaterna;
	}

	public String getAvoMaterna() {
		return avoMaterna;
	}

	public void setAvoMaterna(String avoMaterna) {
		this.avoMaterna = avoMaterna;
	}

	public Testemunha getTestemunha1() {
		return testemunha1;
	}

	public void setTestemunha1(Testemunha testemunha1) {
		this.testemunha1 = testemunha1;
	}

	public Testemunha getTestemunha2() {
		return testemunha2;
	}

	public void setTestemunha2(Testemunha testemunha2) {
		this.testemunha2 = testemunha2;
	}

	public int getSemanasGestacao() {
		return semanasGestacao;
	}

	public void setSemanasGestacao(int semanasGestacao) {
		this.semanasGestacao = semanasGestacao;
	}

	public String getGravidez() {
		return gravidez;
	}

	public void setGravidez(String gravidez) {
		this.gravidez = gravidez;
	}
}
