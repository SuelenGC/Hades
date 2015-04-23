package br.com.hades.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.* ;

import br.com.hades.model.DadosObito;
import static org.junit.Assert.* ;

public class DadosObitoTest {
	
	Calendar cal1 = new GregorianCalendar(2007, 1, 1);
	Calendar cal2 = new GregorianCalendar(2012, 9, 5);
	Calendar cal3 = new GregorianCalendar(2007, 1, 2);
	
	DadosObito instancia() {
		return new DadosObito(1L, "Pra la de Bagda", cal1, 
				"Cartorio X", "11:11", "Engasgou com pao", "15145124", "Santo Repouso",
				"Rua d Matao, 1010", cal3, "14:00", "Dr Fulano", "336789324/SP", "Nada a declarar");
				
	}
	
	@Test
	public void testaId()
	{
		DadosObito d = instancia();
		assertTrue(d.getId()==1L);
	}
	
	@Test
	public void testaLocalFalecimento()
	{
		DadosObito d = instancia();
		assertTrue(d.getLocalFalecimento().equals("Pra la de Bagda"));
	}
	
	@Test
	public void testaSetLocalFalecimento()
	{
		DadosObito d = instancia();
		d.setLocalFalecimento("Rua X");
		assertTrue(d.getLocalFalecimento().equals("Rua X"));
	}
	
	@Test
	public void testaDataFalecimento()
	{
		DadosObito d = instancia();
		assertTrue(d.getDataFalecimento().equals(cal1));
	}
	
	@Test
	public void testaSetDataFalecimento()
	{
		DadosObito d = instancia();
		d.setDataFalecimento(cal2);
		assertTrue(d.getDataFalecimento().equals(cal2));
		assertFalse(d.getDataFalecimento().equals(cal1));
	}
	
	@Test
	public void testaCartorio()
	{
		DadosObito d = instancia();
		assertTrue(d.getCartorio().equals("Cartorio X"));
	}
	
	@Test
	public void testaSetCartorio()
	{
		DadosObito d = instancia();
		d.setCartorio("Paraiso");
		assertTrue(d.getCartorio().equals("Paraiso"));
	}
	
	@Test
	public void testaHorarioFalecimento()
	{
		DadosObito d = instancia();
		assertTrue(d.getHorarioFalecimento().equals("11:11"));
	}
	
	@Test
	public void testaSetHorarioFalecimento()
	{
		DadosObito d = instancia();
		d.setHorarioFalecimento("11:42");
		assertTrue(d.getHorarioFalecimento().equals("11:42"));
	}
	
	@Test
	public void testaCausaMortis()
	{
		DadosObito d = instancia();
		assertTrue(d.getCausaMortis().equals("Engasgou com pao"));
	}
	
	@Test
	public void testaSetCausaMortis()
	{
		DadosObito d = instancia();
		d.setCausaMortis("Engasgou com o frango");
		assertTrue(d.getCausaMortis().equals("Engasgou com o frango"));
	}
	
	public void testaProaim()
	{
		DadosObito d = instancia();
		assertTrue(d.getProaim().equals("15145124"));
	}
	
	@Test
	public void testaSetProaim()
	{
		DadosObito d = instancia();
		d.setProaim("5");
		assertTrue(d.getProaim().equals("5"));
	}
	
	public void testaCemiterio()
	{
		DadosObito d = instancia();
		assertTrue(d.getCemiterio().equals("Santo Repouso"));
	}
	
	@Test
	public void testaSetCemiterio()
	{
		DadosObito d = instancia();
		d.setCemiterio("Maldito Repouso");
		assertTrue(d.getCemiterio().equals("Maldito Repouso"));
	}
	
	public void testaEndereco()
	{
		DadosObito d = instancia();
		assertTrue(d.getEndereco().equals("Rua d Matao, 1010"));
	}
	
	@Test
	public void testaSetEndereco()
	{
		DadosObito d = instancia();
		d.setEndereco("Rua d Matao, 1011");
		assertTrue(d.getEndereco().equals("Rua d Matao, 1011"));
	}
	
	@Test
	public void testaDataSepultamento()
	{
		DadosObito d = instancia();
		assertTrue(d.getDataSepultamento().equals(cal3));
	}
	
	@Test
	public void testaSetDataSepultamento()
	{
		DadosObito d = instancia();
		d.setDataSepultamento(cal2);
		assertTrue(d.getDataSepultamento().equals(cal2));
		assertFalse(d.getDataSepultamento().equals(cal3));
	}
	
	@Test
	public void testaHorarioSepultamento()
	{
		DadosObito d = instancia();
		assertTrue(d.getHorarioSepultamento().equals("14:00"));
	}
	
	@Test
	public void testaSetHorarioSepultamento()
	{
		DadosObito d = instancia();
		d.setHorarioSepultamento("11:42");
		assertTrue(d.getHorarioSepultamento().equals("11:42"));
	}
	
	public void testaMedico()
	{
		DadosObito d = instancia();
		assertTrue(d.getMedico().equals("Dr Fulano"));
	}
	
	@Test
	public void testaSetMedico()
	{
		DadosObito d = instancia();
		d.setMedico("Dr Beltrano");
		assertTrue(d.getMedico().equals("Dr Beltrano"));
	}
	
	public void testaCrm()
	{
		DadosObito d = instancia();
		assertTrue(d.getCrm().equals("336789324/SP"));
	}
	
	@Test
	public void testaSetCrm()
	{
		DadosObito d = instancia();
		d.setCrm("33675278529874/SP");
		assertTrue(d.getCrm().equals("33675278529874/SP"));
	}
	
	public void testaObservacoes()
	{
		DadosObito d = instancia();
		assertTrue(d.getObservacoes().equals("Nada a declarar"));
	}
	
	@Test
	public void testaSetObservacoes()
	{
		DadosObito d = instancia();
		d.setObservacoes("Nada a observar");
		assertTrue(d.getObservacoes().equals("Nada a observar"));
	}
}
