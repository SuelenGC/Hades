package br.com.hades.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import br.com.hades.domain.Cor;
import br.com.hades.domain.Documento;
import br.com.hades.domain.EstadoCivil;
import br.com.hades.domain.Sexo;

@Entity
public class Falecido {

	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private Sexo sexo;
	
	@NotNull
	private Cor cor;
	
	@NotNull
	private String naturalidade;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Calendar nascimento;
	
	private String profissao;
	
	private Documento documento;
	
	private String numDocumento;
	
	private String cpf;
	
	private EstadoCivil estadoCivil;
	
	@NotNull
	private Localizacao localizacao;
	
	@NotNull
	private boolean marcaPasso;
	
	@NotNull
	private boolean eleitor;
	
	@NotNull
	private boolean reservista;
	
	@NotNull
	private boolean inss;
	
	@NotNull
	private boolean inventariar;
	
	@NotNull
	private boolean testamento;
	
	private int beneficio;
	
	@NotNull
	private String nomeMae;
	
	private String naturalidadeMae;
	
	@NotNull
	private EstadoCivil estadoMae;
	
	private int idadeMae;
	
	private String profissaoMae;
	
	@NotNull
	private String nomePai;
	
	private String naturalidadePai;
	
	@NotNull
	private EstadoCivil estadoPai;
	
	private String profissaoPai;
	
	private int idadePai;
	
	@NotNull
	private boolean deixaFilhos;

	public Falecido(Long id, String nome, Sexo sexo, Cor cor,
			String naturalidade, Calendar nascimento, String profissao,
			Documento documento, String numDocumento, String cpf,
			EstadoCivil estadoCivil, Localizacao localizacao,
			boolean marcaPasso, boolean eleitor, boolean reservista,
			boolean inss, boolean inventariar, boolean testamento,
			int beneficio, String nomeMae, String naturalidadeMae,
			EstadoCivil estadoMae, int idadeMae, String profissaoMae,
			String nomePai, String naturalidadePai, EstadoCivil estadoPai,
			String profissaoPai, int idadePai, boolean deixaFilhos) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.cor = cor;
		this.naturalidade = naturalidade;
		this.nascimento = nascimento;
		this.profissao = profissao;
		this.documento = documento;
		this.numDocumento = numDocumento;
		this.cpf = cpf;
		this.estadoCivil = estadoCivil;
		this.localizacao = localizacao;
		this.marcaPasso = marcaPasso;
		this.eleitor = eleitor;
		this.reservista = reservista;
		this.inss = inss;
		this.inventariar = inventariar;
		this.testamento = testamento;
		this.beneficio = beneficio;
		this.nomeMae = nomeMae;
		this.naturalidadeMae = naturalidadeMae;
		this.estadoMae = estadoMae;
		this.idadeMae = idadeMae;
		this.profissaoMae = profissaoMae;
		this.nomePai = nomePai;
		this.naturalidadePai = naturalidadePai;
		this.estadoPai = estadoPai;
		this.profissaoPai = profissaoPai;
		this.idadePai = idadePai;
		this.deixaFilhos = deixaFilhos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	public boolean isMarcaPasso() {
		return marcaPasso;
	}

	public void setMarcaPasso(boolean marcaPasso) {
		this.marcaPasso = marcaPasso;
	}

	public boolean isEleitor() {
		return eleitor;
	}

	public void setEleitor(boolean eleitor) {
		this.eleitor = eleitor;
	}

	public boolean isReservista() {
		return reservista;
	}

	public void setReservista(boolean reservista) {
		this.reservista = reservista;
	}

	public boolean isInss() {
		return inss;
	}

	public void setInss(boolean inss) {
		this.inss = inss;
	}

	public boolean isInventariar() {
		return inventariar;
	}

	public void setInventariar(boolean inventariar) {
		this.inventariar = inventariar;
	}

	public boolean isTestamento() {
		return testamento;
	}

	public void setTestamento(boolean testamento) {
		this.testamento = testamento;
	}

	public int getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(int beneficio) {
		this.beneficio = beneficio;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNaturalidadeMae() {
		return naturalidadeMae;
	}

	public void setNaturalidadeMae(String naturalidadeMae) {
		this.naturalidadeMae = naturalidadeMae;
	}

	public EstadoCivil getEstadoMae() {
		return estadoMae;
	}

	public void setEstadoMae(EstadoCivil estadoMae) {
		this.estadoMae = estadoMae;
	}

	public int getIdadeMae() {
		return idadeMae;
	}

	public void setIdadeMae(int idadeMae) {
		this.idadeMae = idadeMae;
	}

	public String getProfissaoMae() {
		return profissaoMae;
	}

	public void setProfissaoMae(String profissaoMae) {
		this.profissaoMae = profissaoMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNaturalidadePai() {
		return naturalidadePai;
	}

	public void setNaturalidadePai(String naturalidadePai) {
		this.naturalidadePai = naturalidadePai;
	}

	public EstadoCivil getEstadoPai() {
		return estadoPai;
	}

	public void setEstadoPai(EstadoCivil estadoPai) {
		this.estadoPai = estadoPai;
	}

	public String getProfissaoPai() {
		return profissaoPai;
	}

	public void setProfissaoPai(String profissaoPai) {
		this.profissaoPai = profissaoPai;
	}

	public int getIdadePai() {
		return idadePai;
	}

	public void setIdadePai(int idadePai) {
		this.idadePai = idadePai;
	}

	public boolean isDeixaFilhos() {
		return deixaFilhos;
	}

	public void setDeixaFilhos(boolean deixaFilhos) {
		this.deixaFilhos = deixaFilhos;
	}
	
	
}
