package br.com.hades.model;
import org.junit.* ;
import static org.junit.Assert.* ;

public class CertidaoNascimentoTest {
	CertidaoNascimento instancia()
	{
		return new CertidaoNascimento("Cartorio Viva", "45", br.com.hades.domain.Estado.SP, 1525, 41, 7521125, false);

		//Adicionar chave
	}

	
	//testando cartorio
	@Test
	public void testaCartorio()
	{
		CertidaoNascimento c = instancia();
		assertTrue(c.getCartorio().equals("Cartorio Viva"));
	}
	@Test
	public void testaSetCartorio()
	{
		CertidaoNascimento c = instancia();
		c.setCartorio("Cartorio vida longa");
		assertTrue(c.getCartorio().equals("Cartorio vida longa"));
	}
	


	// Testando idade
	@Test
	public void testaIdade()
	{
		CertidaoNascimento c = instancia();
		assertTrue(c.getIdade().equals("45"));
	}
	@Test
	public void testaSetIdade()
	{
		CertidaoNascimento c = instancia();
		c.setIdade("72");
		assertTrue(c.getIdade().equals("72"));
	}
	


	//Testando estado
	@Test
	public void testaEstado()
	{
		CertidaoNascimento c = instancia();
		assertFalse(c.getEstado() == br.com.hades.domain.Estado.RJ);
	}
	@Test
	public void testaEstado2()
	{
		CertidaoNascimento c = instancia();
		assertTrue(c.getEstado() == br.com.hades.domain.Estado.SP);
	}
	@Test
	public void testaSetEstado()
	{
		CertidaoNascimento c = instancia();
		c.setEstado(br.com.hades.domain.Estado.AM);
		assertTrue(c.getEstado() == br.com.hades.domain.Estado.AM);
	}
	
	


	//Testando livro
	@Test
	public void testaLivro()
	{
		CertidaoNascimento c = instancia();
		assertTrue(c.getLivro()==1525);
	}
	@Test
	public void testaSetLivro()
	{
		CertidaoNascimento c = instancia();
		c.setLivro(666);
		assertTrue(c.getLivro()==666);
	}
	

	// Testando folha
	@Test
	public void testaFolha()
	{
		CertidaoNascimento c = instancia();
		assertTrue(c.getFolha()==41);
	}
	@Test
	public void testaSetFolha()
	{
		CertidaoNascimento c = instancia();
		c.setFolha(55);
		assertTrue(c.getFolha()==55);
	}
	
	
	//Testando numCertidao
	@Test
	public void testaNumCertidao()
	{
		CertidaoNascimento c = instancia();
		assertTrue(c.getNumCertidao()== 7521125);
	}
	@Test
	public void testaSetNumCertidao()
	{
		CertidaoNascimento c = instancia();
		c.setNumCertidao(123456);
		assertTrue(c.getNumCertidao()==123456);
	}
	

	//Testando nascObito
	@Test
	public void testaNascObito()
	{
		CertidaoNascimento c = instancia();
		assertTrue(c.isNascObito()==false);
	}
	@Test
	public void testaSetNascObito()
	{
		CertidaoNascimento c = instancia();
		c.setNascObito(true);
		assertTrue(c.isNascObito()==true);
	}
}