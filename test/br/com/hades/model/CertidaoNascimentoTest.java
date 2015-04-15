package br.com.hades.model;
import org.junit.* ;
import static org.junit.Assert.* ;
import br.com.hades.domain.Estado;


public class CertidaoNascimentoTest {
	CertidaoNascimento instancia()
	{
		return new CertidaoNascimento("Cartorio Viva", "45", Estado.SP, 1525, 41, 7521125, false);
	}

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

	@Test
	public void testaEstado()
	{
		CertidaoNascimento c = instancia();
		assertFalse(c.getEstado() == Estado.RJ);
	}
	
	@Test
	public void testaEstado2()
	{
		CertidaoNascimento c = instancia();
		assertTrue(c.getEstado() == Estado.SP);
	}
	
	@Test
	public void testaSetEstado()
	{
		CertidaoNascimento c = instancia();
		c.setEstado(Estado.AM);
		assertTrue(c.getEstado() == Estado.AM);
	}

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