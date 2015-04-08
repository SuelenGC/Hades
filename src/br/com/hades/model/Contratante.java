package br.com.hades.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames = {"cpf"}))
public class Contratante {

	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	private String nome;
	
	@NotNull 
	private String cpf;
	
	@NotNull 
	private String rg;
	
	private String profissao;
	
	private String grauParentesco;
	
	private String telResidencial;
	
	private String telCelular;
	
	private String email;
	
	@NotNull	
	private String nomeMae;
	
	@NotNull
	private Localizacao localizacao;

	private String nomeEmpresarial;
	private String cnpj;
}
