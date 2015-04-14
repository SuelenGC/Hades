package br.com.hades.model;
import br.com.hades.domain.Estado;
import org.junit.* ;
import static org.junit.Assert.* ;

public class CasamentoTest {

	Casamento instancia()

	{
		//Calendar cal = new Calendar();
		//Date date = new Date();
		//cal.setTime("");
		return new Casamento(3L, "Manuel", null, "cartorio 1", "sao paulo", Estado.SP, 587, 65, 25521);
	}
	
	//testando Id
	@Test
	public void testaId()
	{
		Casamento c = instancia();
		assertTrue(c.getId()==3L);
	}
	@Test
	public void testaSetId()
	{
		Casamento c = instancia();
		c.setId(2L);
		assertTrue(c.getId()== 2L);
	}


	// Testando nome
	@Test
	public void testaNome()
	{
		Casamento c = instancia();
		assertTrue(c.getNome()=="Manuel");
	}
	@Test
	public void testaSetNome()
	{
		Casamento c = instancia();
		c.setNome("Jose Rodrigues");
		assertTrue(c.getNome()=="Jose Rodrigues");
	}



	//dataCasamento
	//@Test
	//public void testaDataCasamento()
	//{
	//	Casamento c = instancia();
	//	assertTrue(c.getDataCasamento()=="Manuel");
	//}
	//@Test
	//public void testaSetDataCasamento()
	//{
	//	Casamento c = instancia();
	//	c.setDataCasamento("Jose Rodrigues");
	//	assertTrue(c.getDataCasamento()=="Jose Rodrigues");
	//}




	//testando cartorio
	@Test
	public void testaCartorio()
	{
		Casamento c = instancia();
		assertTrue(c.getCartorio()=="cartorio 1");
	}
	@Test
	public void testaSetCartorio()
	{
		Casamento c = instancia();
		c.setCartorio("cartorio 7");
		assertTrue(c.getCartorio()=="cartorio 7");
	}


	//Testando cidade
	@Test
	public void testaCidade()
	{
		Casamento c = instancia();
		assertTrue(c.getCidade()=="sao paulo");
	}
	@Test
	public void testaSetCidade()
	{
		Casamento c = instancia();
		c.setCidade("rio de janeiro");
		assertTrue(c.getCidade()=="rio de janeiro");
	}



	//Testando uf
	@Test
	public void testaUf()
	{
		Casamento c = instancia();
		assertFalse(c.getUf() == Estado.RJ);
	}
	@Test
	public void testaEstado2()
	{
		Casamento c = instancia();
		assertTrue(c.getUf() == Estado.SP);
	}
	@Test
	public void testaSetEstado()
	{
		Casamento c = instancia();
		c.setUf(Estado.PA);
		assertTrue(c.getUf() == Estado.PA);
	}

	
	//Testando livro
	@Test
	public void testaLivro()
	{
		Casamento c = instancia();
		assertTrue(c.getLivro()==587);
	}
	@Test
	public void testaSetLivro()
	{
		Casamento c = instancia();
		c.setLivro(661);
		assertTrue(c.getLivro()==661);
	}
	

	// Testando folha
	@Test
	public void testaFolha()
	{
		Casamento c = instancia();
		assertTrue(c.getFolha()==65);
	}
	@Test
	public void testaSetFolha()
	{
		Casamento c = instancia();
		c.setFolha(44);
		assertTrue(c.getFolha()==44);
	}
	

	// Testando num
	@Test
	public void testaNum()
	{
		Casamento c = instancia();
		assertTrue(c.getNum()==25521);
	}
	@Test
	public void testaSetNum()
	{
		Casamento c = instancia();
		c.setNum(9998);
		assertTrue(c.getNum()==9998);
	}
}