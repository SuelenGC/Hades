package br.com.hades.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FilhoTest {
	Filho instancia() {
		return new Filho(1L, "Filhao da Silva", br.com.hades.model.CategoriaIdade.Maior, "Nada a comentar");
	}
	
	@Test
	public void testaId()
	{
		Filho f = instancia();
		assertTrue(f.getId()==1L);
	}
	@Test
	public void testaSetId()
	{
		Filho f = instancia();
		f.setId(2L);
		assertTrue(f.getId()==2L);
	}
	
	@Test
	public void testaNome()
	{
		Filho f = instancia();
		assertTrue(f.getNome().equals("Filhao da Silva"));
	}
	@Test
	public void testaSetNome()
	{
		Filho f = instancia();
		f.setNome("Fulano");
		assertTrue(f.getNome().equals("Fulano"));
	}
	
	@Test
	public void testaIdade()
	{
		Filho f = instancia();
		assertTrue(f.getIdade()==br.com.hades.model.CategoriaIdade.Maior);
	}
	@Test
	public void testaSetIdade()
	{
		Filho f = instancia();
		f.setIdade(br.com.hades.model.CategoriaIdade.Menor);
		assertTrue(f.getIdade()==br.com.hades.model.CategoriaIdade.Menor);
	}
	
	@Test
	public void testaObservacoes()
	{
		Filho f = instancia();
		assertTrue(f.getObservacoes().equals("Nada a comentar"));
	}
	@Test
	public void testaSetObservacoes()
	{
		Filho f = instancia();
		f.setObservacoes("Bla");
		assertTrue(f.getObservacoes().equals("Bla"));
	}
}
