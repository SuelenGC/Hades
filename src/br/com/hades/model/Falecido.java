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
}
