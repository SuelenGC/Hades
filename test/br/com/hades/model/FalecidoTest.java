package br.com.hades.model;
import br.com.hades.domain.Estado;
import br.com.hades.domain.Sexo;
import br.com.hades.domain.Cor;
import br.com.hades.domain.Documento;
import br.com.hades.domain.EstadoCivil;

import org.junit.* ;

import static org.junit.Assert.* ;

public class FalecidoTest {

	Falecido instancia()

	{
		Localizacao loc = new Localizacao(1L, "Rua do Meio do Nada", "Bairro Acre", 666, "Ultima Cidade do Universo", "", 
				"0234150666", Estado.AC);
		return new Falecido(3L, "Manuela", Sexo.Feminino, Cor.Branca, "brasileira", null, 
			"mecanico", Documento.RG, "85475685-7", "584135795-85", EstadoCivil.Solteiro, 
			loc, true, true, true, true, true, true, 2, "mae maria", "brasileira", EstadoCivil.Casado, 80, 
			"dona de casa", "pai jose", "brasileira", EstadoCivil.Casado, "pedreiro", 82, true);
	}
	
	//testando Id
	@Test
	public void testaId()
	{
		Falecido c = instancia();
		assertTrue(c.getId()==3L);
	}
	@Test
	public void testaSetCartorio()
	{
		Falecido c = instancia();
		c.setId(2L);
		assertTrue(c.getId()== 2L);
	}


	// Testando nome
	@Test
	public void testaNome()
	{
		Falecido c = instancia();
		assertTrue(c.getNome().equals("Manuela"));
	}
	@Test
	public void testaSetNome()
	{
		Falecido c = instancia();
		c.setNome("Jose Rodrigues");
		assertTrue(c.getNome().equals("Jose Rodrigues"));
	}

	// Testando sexo
	@Test
	public void testaSexo()
	{
		Falecido c = instancia();
		assertTrue(c.getSexo() == Sexo.Feminino);
	}
	@Test
	public void testaSetSexo()
	{
		Falecido c = instancia();
		c.setSexo(Sexo.Masculino);
		assertTrue(c.getSexo()==Sexo.Masculino);
	}


	// Testando cor
	@Test
	public void testaCor()
	{
		Falecido c = instancia();
		assertTrue(c.getCor() == Cor.Branca);
	}
	@Test
	public void testaSetCor()
	{
		Falecido c = instancia();
		c.setCor(Cor.Parda);
		assertTrue(c.getCor()==Cor.Parda);
	}


	// Testando naturalidade
	@Test
	public void testaNaturalidade()
	{
		Falecido c = instancia();
		assertTrue(c.getNaturalidade().equals("brasileira"));
	}
	@Test
	public void testaSetNaturalidade()
	{
		Falecido c = instancia();
		c.setNaturalidade("espanhola");
		assertTrue(c.getNaturalidade().equals("espanhola"));
	}


//DATAAAAAA




	// Testando profissao
	@Test
	public void testaProfissao()
	{
		Falecido c = instancia();
		assertTrue(c.getProfissao().equals("mecanico"));
	}
	@Test
	public void testaSetProfissao()
	{
		Falecido c = instancia();
		c.setProfissao("engenheiro");
		assertTrue(c.getProfissao().equals("engenheiro"));
	}



	// Testando documento
	@Test
	public void testaDocumento()
	{
		Falecido c = instancia();
		assertTrue(c.getDocumento() == Documento.RG);
	}
	@Test
	public void testaSetDocumento()
	{
		Falecido c = instancia();
		c.setDocumento(Documento.RNE);
		assertTrue(c.getDocumento()==Documento.RNE);
	}
}