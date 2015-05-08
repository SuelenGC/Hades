package br.com.hades.model;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class DadosObito {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private String localFalecimento;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Calendar dataFalecimento;
	
	@NotNull
	private String cartorio;
	
	@NotNull
	private String horarioFalecimento;
	
	@NotNull
	private String causaMortis;
	
	@NotNull
	private String proaim;
	
	@NotNull
	private String cemiterio;
	
	@NotNull
	private String endereco;

	@NotNull
	@Temporal(TemporalType.DATE)
	private Calendar dataSepultamento;
	
	@NotNull
	private String horarioSepultamento;
	
	@NotNull
	private String medico;
	
	@NotNull
	private String crm;
	
	private String observacoes;
	
	public DadosObito() {
		
	}

	public DadosObito(long id, String localFalecimento,
			Calendar dataFalecimento, String cartorio,
			String horarioFalecimento, String causaMortis, String proaim,
			String cemiterio, String endereco, Calendar dataSepultamento,
			String horarioSepultamento, String medico, String crm,
			String observacoes) {
		super();
		this.id = id;
		this.localFalecimento = localFalecimento;
		this.dataFalecimento = dataFalecimento;
		this.cartorio = cartorio;
		this.horarioFalecimento = horarioFalecimento;
		this.causaMortis = causaMortis;
		this.proaim = proaim;
		this.cemiterio = cemiterio;
		this.endereco = endereco;
		this.dataSepultamento = dataSepultamento;
		this.horarioSepultamento = horarioSepultamento;
		this.medico = medico;
		this.crm = crm;
		this.observacoes = observacoes;
	}

	public long getId() {
		return id;
	}

	public String getLocalFalecimento() {
		return localFalecimento;
	}

	public void setLocalFalecimento(String localFalecimento) {
		this.localFalecimento = localFalecimento;
	}

	public Calendar getDataFalecimento() {
		return dataFalecimento;
	}

	public void setDataFalecimento(Calendar dataFalecimento) {
		this.dataFalecimento = dataFalecimento;
	}

	public String getCartorio() {
		return cartorio;
	}

	public void setCartorio(String cartorio) {
		this.cartorio = cartorio;
	}

	public String getHorarioFalecimento() {
		return horarioFalecimento;
	}

	public void setHorarioFalecimento(String horarioFalecimento) {
		this.horarioFalecimento = horarioFalecimento;
	}

	public String getCausaMortis() {
		return causaMortis;
	}

	public void setCausaMortis(String causaMortis) {
		this.causaMortis = causaMortis;
	}

	public String getProaim() {
		return proaim;
	}

	public void setProaim(String proaim) {
		this.proaim = proaim;
	}

	public String getCemiterio() {
		return cemiterio;
	}

	public void setCemiterio(String cemiterio) {
		this.cemiterio = cemiterio;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Calendar getDataSepultamento() {
		return dataSepultamento;
	}

	public void setDataSepultamento(Calendar dataSepultamento) {
		this.dataSepultamento = dataSepultamento;
	}

	public String getHorarioSepultamento() {
		return horarioSepultamento;
	}

	public void setHorarioSepultamento(String horarioSepultamento) {
		this.horarioSepultamento = horarioSepultamento;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}	
	
}