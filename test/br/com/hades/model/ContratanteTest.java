package br.com.hades.model;
import org.junit.* ;
import static org.junit.Assert.* ;

public class ContratanteTest {
	Contratante instancia()
	{
//		(Long id, String nome, String cpf, String rg,
//				String profissao, String grauParentesco, String telResidencial,
//				String telCelular, String email, String nomeMae,
//				Localizacao localizacao, String nomeEmpresarial, String cnpj)
		
		return new Contratante(1L, "Fulano da Silva", "12341515", "5625252", "Estudante", "Filho", "(11)5511-5511", "(11)96666-6666",
				"fulano.silva@gmail.com", "Mae do Fulano", new Localizacao(1L, "Rua do Meio do Nada", "Bairro Acre", 666, "Ultima Cidade do Universo", "", 
				"0234150666", br.com.hades.domain.Estado.AC), "Fulanos SA", "512523526473");
	}

	
	@Test
	public void testaId()
	{
		Contratante c = instancia();
		assertTrue(c.getId()==1L);
	}
	@Test
	public void testaSetId()
	{
		Contratante c = instancia();
		c.setId(2L);
		assertTrue(c.getId()==2L);
	}
	
	
	@Test
	public void testaNome()
	{
		Contratante c = instancia();
		assertTrue(c.getNome()=="Fulano da Silva");
	}
	@Test
	public void testaSetNome()
	{
		Contratante c = instancia();
		c.setNome("Beltrano");
		assertTrue(c.getNome()=="Beltrano");
	}
	
	
	@Test
	public void testaCpf()
	{
		Contratante c = instancia();
		assertFalse(c.getCpf() == "08574596412");
	}
	@Test
	public void testaCpf2()
	{
		Contratante c = instancia();
		assertTrue(c.getCpf() == "12341515");
	}
	@Test
	public void testaCpf3()
	{
		Contratante c = instancia();
		c.setCpf("012345678");
		assertTrue(c.getCpf() == "012345678");
	}
	
	
	@Test
	public void testaRg()
	{
		Contratante c = instancia();
		assertTrue(c.getRg()=="5625252");
	}
	@Test
	public void testaSetRg()
	{
		Contratante c = instancia();
		c.setRg("987654321");
		assertTrue(c.getRg()=="987654321");
	}
	
	
	
	

//	(1L, "Fulano da Silva", "12341515", "5625252", "Estudante", "Filho", "(11)5511-5511", "(11)96666-6666",
	//		"fulano.silva@gmail.com", "Mae do Fulano", new Localizacao(1L, "Rua do Meio do Nada", "Bairro Acre", 666, "Ultima Cidade do Universo", "", 
		//	"0234150666", br.com.hades.domain.Estado.AC), "Fulanos SA", "512523526473");
	
//	(Long id, String nome, String cpf, String rg,
//	String profissao, String grauParentesco, String telResidencial,
//	String telCelular, String email, String nomeMae,
//	Localizacao localizacao, String nomeEmpresarial, String cnpj)
}
