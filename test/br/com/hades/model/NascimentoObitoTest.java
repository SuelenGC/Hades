package br.com.hades.model;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.Test;

import br.com.hades.domain.EstadoCivil;

//TODO testar Calendar

public class NascimentoObitoTest {
	NascimentoObito instancia() {
		Testemunha t1 = new Testemunha(1L, "Fulano", EstadoCivil.Casado, "Brasileiro", "Desempregado", "Rua X", "Consolacao");
		Testemunha t2 = new Testemunha(1L, "Beltrano", EstadoCivil.Solteiro, "Americano", "Advogado", "Rua A", "Campo Limpo");
		return new NascimentoObito ("Hospital X", null, "8:00", "Papi", "Grandpa", "Mami", "Grandma", t1, t2, 36, "Normal" );
	}
	
	@Test
	public void testaLocalNascimento()
	{
		NascimentoObito no = instancia();
		assertTrue(no.getLocalNascimento() .equals("Hospital X"));
	}
	@Test
	public void testaSetLocalNascimento()
	{
		NascimentoObito no = instancia();
		no.setLocalNascimento("Hospital PKMN");
		assertTrue(no.getLocalNascimento() .equals("Hospital PKMN"));
	}
	
	@Test
	public void testaHorarioNascimento()
	{
		NascimentoObito no = instancia();
		assertTrue(no.getHorarioNascimento() .equals("8:00"));
	}
	@Test
	public void testaSetHorarioNascimento()
	{
		NascimentoObito no = instancia();
		no.setHorarioNascimento("20:00");
		assertTrue(no.getHorarioNascimento() .equals("20:00"));
	}
	
	@Test
	public void testaGravidez()
	{
		NascimentoObito no = instancia();
		assertTrue(no.getGravidez() .equals("Normal"));
	}
	@Test
	public void testaSetNome()
	{
		NascimentoObito no = instancia();
		no.setGravidez("Cesarea");
		assertTrue(no.getGravidez() .equals("Cesarea"));
	}
	
	@Test
	public void testaAvoPaterno()
	{
		NascimentoObito no = instancia();
		assertTrue(no.getAvoPaterno() .equals("Papi"));
	}
	@Test
	public void testaSetAvoPaterno()
	{
		NascimentoObito no = instancia();
		no.setAvoPaterno("Vovo");
		assertTrue(no.getAvoPaterno() .equals("Vovo"));
	}
	
	@Test
	public void testaAvoMaterno()
	{
		NascimentoObito no = instancia();
		assertTrue(no.getAvoMaterno() .equals("Grandpa"));
	}
	@Test
	public void testaSetAvoMaterno()
	{
		NascimentoObito no = instancia();
		no.setAvoMaterno("Vovo");
		assertTrue(no.getAvoMaterno() .equals("Vovo"));
	}
	
	@Test
	public void testaAvoPaterna()
	{
		NascimentoObito no = instancia();
		assertTrue(no.getAvoPaterna() .equals("Mami"));
	}
	@Test
	public void testaSetAvoPaterna()
	{
		NascimentoObito no = instancia();
		no.setAvoPaterna("Vovo");
		assertTrue(no.getAvoPaterna() .equals("Vovo"));
	}
	
	@Test
	public void testaAvoMaterna()
	{
		NascimentoObito no = instancia();
		assertTrue(no.getAvoMaterna() .equals("Grandma"));
	}
	@Test
	public void testaSetAvoMaterna()
	{
		NascimentoObito no = instancia();
		no.setAvoMaterna("Vovo");
		assertTrue(no.getAvoMaterna() .equals("Vovo"));
	}
	
	@Test
	public void testaTestemunha1()
	{
		NascimentoObito no = instancia();
		assertTrue(no.getTestemunha1().getEndereco().equals("Rua X"));
	}
	@Test
	public void testaSetTestemuha1()
	{
		NascimentoObito no = instancia();
		Testemunha t = new Testemunha(1L, "Cicrano", EstadoCivil.Divorciado, "Sul africano", "Medico", "Rua X", "Consolacao");
		no.setTestemunha1(t);
		assertTrue(no.getTestemunha1().getNome() .equals("Cicrano"));
	}	
	
	@Test
	public void testaTestemunha2()
	{
		NascimentoObito no = instancia();
		assertTrue(no.getTestemunha2().getEndereco().equals("Rua A"));
	}
	@Test
	public void testaSetTestemuha2()
	{
		NascimentoObito no = instancia();
		Testemunha t = new Testemunha(1L, "Cicrano", EstadoCivil.Divorciado, "Sul africano", "Medico", "Rua X", "Consolacao");
		no.setTestemunha2(t);
		assertTrue(no.getTestemunha2().getNome() .equals("Cicrano"));
	}	
	
	@Test
	public void testaSemanasGestacao()
	{
		NascimentoObito no = instancia();
		assertTrue(no.getSemanasGestacao()==36);
	}
	@Test
	public void testaSetSemanasGestacao()
	{
		NascimentoObito no = instancia();
		no.setSemanasGestacao(30);
		assertTrue(no.getSemanasGestacao()==30);
	}	
}
