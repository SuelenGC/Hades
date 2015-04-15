package br.com.hades.model;

import org.junit.* ;
import static org.junit.Assert.* ;

public class UserTest {

	User instancia()
	{		
		return new User(1L, "erika", "banana");
	}
		
	@Test
	public void testaLogin()
	{
		User c = instancia();
		assertTrue(c.getLogin().equals("erika"));
	}
	
	@Test
	public void testaSetLogin()
	{
		User c = instancia();
		c.setLogin("victor");
		assertTrue(c.getLogin().equals("victor"));
		assertFalse(c.getLogin().equals("erika"));
	}
	
	@Test
	public void testaSenha()
	{
		User c = instancia();
		assertTrue(c.getSenha().equals("banana"));
	}
	
	@Test
	public void testaSetSenha()
	{
		User c = instancia();
		c.setSenha("laranja");
		assertTrue(c.getSenha().equals("laranja"));
		assertFalse(c.getSenha().equals("banana"));
	}
	
	@Test
	public void testaId()
	{
		User c = instancia();
		assertTrue(c.getId() == 1L);
	}
	
}
