package br.com.hades.model;
import org.junit.* ;

import br.com.hades.domain.Estado;
import static org.junit.Assert.* ;
import br.com.hades.domain.Estado;
public class LocalizacaoTest {
	
	Localizacao instancia()
	{
		return new Localizacao(1L, "Rua do Meio do Nada", "Bairro Acre", 666, "Ultima Cidade do Universo", "", 
				"0234150666", br.com.hades.domain.Estado.AC);
	}
//	@Test
//	public void testaInicializacao()
////	{(Long id, String endereco, String bairro, int numero,
////			String cidade, String complemento, String cep, Estado estado)
//	{
//		Localizacao loc = new Localizacao(new Long(1), "Rua do Meio do Nada", "Bairro Acre", 666, "Ultima Cidade do Universo", "", 
//				"0234150666", br.com.hades.domain.Estado.AC);
//		assertTrue(loc.getEndereco()=="Rua do Meio do Nada");
//		assertTrue(loc.getBairro()=="Bairro Acre");
//		loc.setBairro("Bairro barrento");
//		assertTrue(loc.getBairro()=="Bairro barrento");
//		assertFalse(loc.getBairro()=="Bairro Acre");
//	}
	
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
		assertTrue(loc.getEndereco()=="Rua do Meio do Nada");
	}
	
	@Test
	public void testaSetEndereco()
	{
		Localizacao loc = instancia();
		loc.setEndereco("Rua Blah");
		assertTrue(loc.getEndereco()=="Rua Blah");
		assertFalse(loc.getEndereco()=="Rua do Meio do Nada");
	}
	
	@Test
	public void testaGetBairro()
	{
		Localizacao loc = instancia();
		assertTrue(loc.getBairro()=="Bairro Acre");
//		loc.setBairro("Bairro barrento");
//		assertTrue(loc.getBairro()=="Bairro barrento");
//		assertFalse(loc.getBairro()=="Bairro Acre");
	}
	
	@Test
	public void testaSetBairro()
	{
		Localizacao loc = instancia();
		loc.setBairro("Bairro barrento");
		assertTrue(loc.getBairro()=="Bairro barrento");
		assertFalse(loc.getBairro()=="Bairro Acre");
	}
	
	@Test
	public void testaGetNumero()
	{
		Localizacao loc = instancia();
		assertTrue(loc.getNumero()==666);
	}
	
	@Test
	public void testaSetNumero()
	{
		Localizacao loc = instancia();
		loc.setNumero(loc.getNumero()+1);
		assertTrue(loc.getNumero()==667);
	}
	
	@Test
	public void testaGetComplemento()
	{
		Localizacao loc = instancia();
		assertTrue(loc.getComplemento()=="");
	}
	
	@Test
	public void testaSetComplemento()
	{
		Localizacao loc = instancia();
		loc.setComplemento("Comp");
		assertTrue(loc.getComplemento()=="Comp");
	}
	
	@Test
	public void testaGetCidade()
	{
		Localizacao loc = instancia();
		assertTrue(loc.getCidade()=="Ultima Cidade do Universo");
	}

	@Test
	public void testaSetCidade()
	{
		Localizacao loc = instancia();
		loc.setCidade("Pindamonhangaba");
		assertTrue(loc.getCidade()=="Pindamonhangaba");
		assertFalse(loc.getCidade()=="Ultima Cidade do Universo");
	}
	
	@Test
	public void testaGetCep()
	{
		Localizacao loc = instancia();
		assertTrue(loc.getCep()=="0234150666");
	}

	@Test
	public void testaSetCep()
	{
		Localizacao loc = instancia();
		loc.setCep("84823743");
		assertTrue(loc.getCep()=="84823743");
		assertFalse(loc.getCep()=="0234150666");
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
