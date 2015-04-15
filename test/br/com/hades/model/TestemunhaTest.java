package br.com.hades.model;

import static org.junit.Assert.*;
import org.junit.*;
import br.com.hades.domain.EstadoCivil;

public class TestemunhaTest {
	
	Testemunha instancia() {
		return new Testemunha(1L, "Fulano", EstadoCivil.Casado, "Brasileiro", "Desempregado", "Rua X", "Consolacao");
	}
	
	@Test
	public void testaId()
	{
		Testemunha t = instancia();
		assertTrue(t.getId() == 1L);
	}
	
	@Test
	public void testaSetId()
	{
		Testemunha t = instancia();
		t.setId(2L);
		assertTrue(t.getId() == 2L);
	}
	
	@Test
	public void testaNome()
	{
		Testemunha t = instancia();
		assertTrue(t.getNome() .equals("Fulano"));
	}
	
	@Test
	public void testaSetNome()
	{
		Testemunha t = instancia();
		t.setNome("Beltrano");
		assertTrue(t.getNome() .equals("Beltrano"));
	}
	
	@Test
	public void testaEstado()
	{
		Testemunha t = instancia();
		assertTrue(t.getEstado() == EstadoCivil.Casado);
	}
	
	@Test
	public void testaSetEstado()
	{
		Testemunha t = instancia();
		t.setEstado(EstadoCivil.Divorciado);
		assertTrue(t.getEstado() == EstadoCivil.Divorciado);
	}
	
	@Test
	public void testaNacionalidade()
	{
		Testemunha t = instancia();
		assertTrue(t.getNacionalidade() .equals("Brasileiro"));
	}
	
	@Test
	public void testaSetNacionalidade()
	{
		Testemunha t = instancia();
		t.setNacionalidade("Frances");
		assertTrue(t.getNacionalidade() .equals("Frances"));
	}
	
	@Test
	public void testaProfissao()
	{
		Testemunha t = instancia();
		assertTrue(t.getProfissao() .equals("Desempregado"));
	}
	
	@Test
	public void testaSetProfissao()
	{
		Testemunha t = instancia();
		t.setProfissao("Eletricista");
		assertTrue(t.getProfissao() .equals("Eletricista"));
	}
	
	@Test
	public void testaEndereco()
	{
		Testemunha t = instancia();
		assertTrue(t.getEndereco() .equals("Rua X"));
	}
	
	@Test
	public void testaSetEndereco()
	{
		Testemunha t = instancia();
		t.setEndereco("Avenida Y");
		assertTrue(t.getEndereco() .equals("Avenida Y"));
	}
	
	@Test
	public void testaBairro()
	{
		Testemunha t = instancia();
		assertTrue(t.getBairro() .equals("Consolacao"));
	}
	
	@Test
	public void testaSetBairro()
	{
		Testemunha t = instancia();
		t.setBairro("Liberdade");
		assertTrue(t.getBairro() .equals("Liberdade"));
	}
}
