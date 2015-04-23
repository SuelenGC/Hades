package br.com.hades.model;
import org.junit.* ;
import br.com.hades.domain.Estado;
import static org.junit.Assert.* ;

public class LocalizacaoTest {
	
	Localizacao instancia()
	{
		return new Localizacao(1L, "Rua do Meio do Nada", "Bairro Acre", 666, "Ultima Cidade do Universo", "", 
				"0234150666", Estado.AC);
	}
	
	@Test
	public void testaGetID()
	{
		Localizacao loc = instancia();
		assertTrue(loc.getId()== 1);
	}
	
	@Test
	public void testaSetID()
	{
		Localizacao loc = instancia();
		loc.setId(2L);
		assertTrue(loc.getId()== 2);
		assertFalse(loc.getId()== 1);
	}
	
	@Test
	public void testaGetEndereco()
	{
		Localizacao loc = instancia();
		assertTrue(loc.getEndereco().equals("Rua do Meio do Nada"));
	}
	
	@Test
	public void testaSetEndereco()
	{
		Localizacao loc = instancia();
		loc.setEndereco("Rua Blah");
		assertTrue(loc.getEndereco().equals("Rua Blah"));
		assertFalse(loc.getEndereco().equals("Rua do Meio do Nada"));
	}
	
	@Test
	public void testaGetBairro()
	{
		Localizacao loc = instancia();
		assertTrue(loc.getBairro().equals("Bairro Acre"));
	}
	
	@Test
	public void testaSetBairro()
	{
		Localizacao loc = instancia();
		loc.setBairro("Bairro barrento");
		assertTrue(loc.getBairro().equals("Bairro barrento"));
		assertFalse(loc.getBairro().equals("Bairro Acre"));
	}
	
	@Test
	public void testaGetNumero()
	{
		Localizacao loc = instancia();
		assertTrue(loc.getNumeroEndereco()==666);
	}
	
	@Test
	public void testaSetNumero()
	{
		Localizacao loc = instancia();
		loc.setNumeroEndereco(loc.getNumeroEndereco()+1);
		assertTrue(loc.getNumeroEndereco()==667);
	}
	
	@Test
	public void testaGetComplemento()
	{
		Localizacao loc = instancia();
		assertTrue(loc.getComplementoEndereco().equals(""));
	}
	
	@Test
	public void testaSetComplemento()
	{
		Localizacao loc = instancia();
		loc.setComplementoEndereco("Comp");
		assertTrue(loc.getComplementoEndereco().equals("Comp"));
	}
	
	@Test
	public void testaGetCidade()
	{
		Localizacao loc = instancia();
		assertTrue(loc.getCidade().equals("Ultima Cidade do Universo"));
	}

	@Test
	public void testaSetCidade()
	{
		Localizacao loc = instancia();
		loc.setCidade("Pindamonhangaba");
		assertTrue(loc.getCidade().equals("Pindamonhangaba"));
		assertFalse(loc.getCidade().equals("Ultima Cidade do Universo"));
	}
	
	@Test
	public void testaGetCep()
	{
		Localizacao loc = instancia();
		assertTrue(loc.getCep().equals("0234150666"));
	}

	@Test
	public void testaSetCep()
	{
		Localizacao loc = instancia();
		loc.setCep("84823743");
		assertTrue(loc.getCep().equals("84823743"));
		assertFalse(loc.getCep().equals("0234150666"));
	}

	@Test
	public void testaGetEstado()
	{
		Localizacao loc = instancia();
		assertTrue(loc.getEstado()==br.com.hades.domain.Estado.AC);
	}

	@Test
	public void testaSetEstado()
	{
		Localizacao loc = instancia();
		loc.setEstado(br.com.hades.domain.Estado.SP);
		assertTrue(loc.getEstado()==br.com.hades.domain.Estado.SP);
		assertFalse(loc.getEstado()==br.com.hades.domain.Estado.AC);
	}
}
