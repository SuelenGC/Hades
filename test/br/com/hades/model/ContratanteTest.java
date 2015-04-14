package br.com.hades.model;
import org.junit.* ;
import static org.junit.Assert.* ;

public class ContratanteTest {
	Contratante instancia()
	{
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
		assertTrue(c.getNome().equals("Fulano da Silva"));
	}
	@Test
	public void testaSetNome()
	{
		Contratante c = instancia();
		c.setNome("Beltrano");
		assertTrue(c.getNome().equals("Beltrano"));
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
		assertTrue(c.getRg().equals("5625252"));
	}
	@Test
	public void testaSetRg()
	{
		Contratante c = instancia();
		c.setRg("987654321");
		assertTrue(c.getRg().equals("987654321"));
	}
	
	@Test
	public void testaProfissao()
	{
		Contratante c = instancia();
		assertTrue(c.getProfissao().equals("Estudante"));
	}
	@Test
	public void testaSetProfissao()
	{
		Contratante c = instancia();
		c.setProfissao("Estudante de Computacao");
		assertTrue(c.getProfissao().equals("Estudante de Computacao"));
	}
	
	@Test
	public void testaGrauParentesco()
	{
		Contratante c = instancia();
		assertTrue(c.getGrauParentesco().equals("Filho"));
	}
	@Test
	public void testaSetGrauParentesco()
	{
		Contratante c = instancia();
		c.setGrauParentesco("Irmao");
		assertTrue(c.getGrauParentesco().equals("Irmao"));
	}
	
	@Test
	public void testaTelResidencial()
	{
		Contratante c = instancia();
		assertTrue(c.getTelResidencial().equals("(11)5511-5511"));
	}
	@Test
	public void testaSetTelResidencial()
	{
		Contratante c = instancia();
		c.setTelResidencial("(19)3838-3838");
		assertTrue(c.getTelResidencial().equals("(19)3838-3838"));
	}
	
	@Test
	public void testaTelCelular()
	{
		Contratante c = instancia();
		assertTrue(c.getTelCelular().equals("(11)96666-6666"));
	}
	@Test
	public void testaSetTelCelular()
	{
		Contratante c = instancia();
		c.setTelCelular("(11)91235-8130");
		assertTrue(c.getTelCelular().equals("(11)91235-8130"));
	}
	
	@Test
	public void testaEmail()
	{
		Contratante c = instancia();
		assertTrue(c.getEmail().equals("fulano.silva@gmail.com"));
	}
	@Test
	public void testaSetEmail()
	{
		Contratante c = instancia();
		c.setEmail("email.da.hora@hotmail.com");
		assertTrue(c.getEmail().equals("email.da.hora@hotmail.com"));
	}
	
	@Test
	public void testaNomeMae()
	{
		Contratante c = instancia();
		assertTrue(c.getNomeMae().equals("Mae do Fulano"));
	}
	@Test
	public void testaSetNomeMae()
	{
		Contratante c = instancia();
		c.setNomeMae("Maman");
		assertTrue(c.getNomeMae().equals("Maman"));
	}
	
	@Test
	public void testaLocalizacao()
	{
		Contratante c = instancia();
		assertTrue(c.getLocalizacao().getEndereco().equals("Rua do Meio do Nada"));
	}
	@Test
	public void testaSetLocalizacao()
	{
		Contratante c = instancia();
		Localizacao l = new Localizacao(3L, "Baker Street", "Elementar", 221, "Londres", "B", "53256414", br.com.hades.domain.Estado.SP);
		c.setLocalizacao(l);
		assertTrue(c.getLocalizacao().getEndereco().equals("Baker Street"));
	}
	
	@Test
	public void testaNomeEmpresarial()
	{
		Contratante c = instancia();
		assertTrue(c.getNomeEmpresarial().equals("Fulanos SA"));
	}
	@Test
	public void testaSetNomeEmpresarial()
	{
		Contratante c = instancia();
		c.setNomeEmpresarial("Beltrano Inc.");
		assertTrue(c.getNomeEmpresarial().equals("Beltrano Inc."));
	}
	
	@Test
	public void testaCnpj()
	{
		Contratante c = instancia();
		assertTrue(c.getCnpj().equals("512523526473"));
	}
	@Test
	public void testaSetCnpj()
	{
		Contratante c = instancia();
		c.setCnpj("987654321");
		assertTrue(c.getCnpj().equals("987654321"));
	}
}
