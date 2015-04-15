package br.com.hades.model;
import br.com.hades.domain.Estado;
import br.com.hades.domain.Sexo;
import br.com.hades.domain.Cor;
import br.com.hades.domain.Documento;
import br.com.hades.domain.EstadoCivil;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.* ;
import static org.junit.Assert.* ;

public class FalecidoTest {

	Localizacao loc = new Localizacao(1L, "Rua do Meio do Nada", "Bairro Acre", 666, 
			                          "Ultima Cidade do Universo", "", "0234150666", Estado.AC);
	Localizacao loc2 = new Localizacao(2L, "Rua do Matao", "Butanta", 1100, "Sao Paulo", "", 
					                   "06540900", Estado.SP);
	Calendar cal1 = new GregorianCalendar(2007, 1, 1);
	Calendar cal2 = new GregorianCalendar(2012, 9, 5);

	Falecido instancia()
	{		
		return new Falecido(3L, "Manuela", Sexo.Feminino, Cor.Branca, "brasileira", cal1, 
			                "mecanico", Documento.RG, "85475685-7", "584135795-85", EstadoCivil.Solteiro, 
			                loc, true, true, true, true, true, true, 2, "mae maria", "brasileira", EstadoCivil.Casado, 80, 
			                "dona de casa", "pai jose", "brasileira", EstadoCivil.Casado, "pedreiro", 82, true);
	}
	
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

	@Test
	public void testaNascimento()
	{
		Falecido c = instancia();
		assertTrue(c.getNascimento().equals(cal1));
	}
	
	@Test
	public void testaSetNascimento()
	{
		Falecido c = instancia();
		c.setNascimento(cal2);
		assertTrue(c.getNascimento().equals(cal2));
		assertFalse(c.getNascimento().equals(cal1));
	}

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

	@Test
	public void testaNumDocumento()
	{
		Falecido c = instancia();
		assertTrue(c.getNumDocumento().equals("85475685-7"));
	}
	
	@Test
	public void testaSetNumDocumento()
	{
		Falecido c = instancia();
		c.setNumDocumento("737646244-3");
		assertTrue(c.getNumDocumento().equals("737646244-3"));
		assertFalse(c.getNumDocumento().equals("85475685-7"));
	}
	
	@Test
	public void testaCpf()
	{
		Falecido c = instancia();
		assertTrue(c.getCpf().equals("584135795-85"));
	}
	
	@Test
	public void testaSetCpf()
	{
		Falecido c = instancia();
		c.setCpf("747347843-3");
		assertTrue(c.getCpf().equals("747347843-3"));
		assertFalse(c.getCpf().equals("85475685-7"));
	}
	
	@Test
	public void testaEstadoCivil()
	{
		Falecido c = instancia();
		assertTrue(c.getEstadoCivil() == EstadoCivil.Solteiro);
	}
	
	@Test
	public void testaSetEstadoCivil()
	{
		Falecido c = instancia();
		c.setEstadoCivil(EstadoCivil.Casado);
		assertTrue(c.getEstadoCivil() == EstadoCivil.Casado);
		assertFalse(c.getEstadoCivil() == EstadoCivil.Solteiro);
	}
	
	@Test
	public void testaLocalizacao()
	{
		Falecido c = instancia();
		assertTrue(c.getLocalizacao() == loc);
	}
	
	@Test
	public void testaSetLocalizacao()
	{
		Falecido c = instancia();
		c.setLocalizacao(loc2);
		assertTrue(c.getLocalizacao() == loc2);
		assertFalse(c.getLocalizacao() == loc);
	}
	
	@Test
	public void testaMarcaPasso()
	{
		Falecido c = instancia();
		assertTrue(c.isMarcaPasso() == true);
	}
	
	@Test
	public void testaSetMarcaPasso()
	{
		Falecido c = instancia();
		c.setMarcaPasso(false);
		assertTrue(c.isMarcaPasso() == false);
		assertFalse(c.isMarcaPasso() == true);
	}
	
	@Test
	public void testaEleitor()
	{
		Falecido c = instancia();
		assertTrue(c.isEleitor() == true);
	}
	
	@Test
	public void testaSetEleitor()
	{
		Falecido c = instancia();
		c.setEleitor(false);
		assertTrue(c.isEleitor() == false);
		assertFalse(c.isEleitor() == true);
	}
	
	@Test
	public void testaReservista()
	{
		Falecido c = instancia();
		assertTrue(c.isReservista() == true);
	}
	
	@Test
	public void testaSetReservista()
	{
		Falecido c = instancia();
		c.setReservista(false);
		assertTrue(c.isReservista() == false);
		assertFalse(c.isReservista() == true);
	}
	
	@Test
	public void testaInss()
	{
		Falecido c = instancia();
		assertTrue(c.isInss() == true);
	}
	
	@Test
	public void testaSetInss()
	{
		Falecido c = instancia();
		c.setInss(false);
		assertTrue(c.isInss() == false);
		assertFalse(c.isInss() == true);
	}
	
	@Test
	public void testaInventariar()
	{
		Falecido c = instancia();
		assertTrue(c.isInventariar() == true);
	}
	
	@Test
	public void testaSetInventariar()
	{
		Falecido c = instancia();
		c.setInventariar(false);
		assertTrue(c.isInventariar() == false);
		assertFalse(c.isInventariar() == true);
	}
	
	@Test
	public void testaTestamento()
	{
		Falecido c = instancia();
		assertTrue(c.isTestamento() == true);
	}
	
	@Test
	public void testaSetTestamento()
	{
		Falecido c = instancia();
		c.setTestamento(false);
		assertTrue(c.isTestamento() == false);
		assertFalse(c.isTestamento() == true);
	}
	
	@Test
	public void testaBeneficio()
	{
		Falecido c = instancia();
		assertTrue(c.getBeneficio() == 2);
	}
	
	@Test
	public void testaSetBeneficio()
	{
		Falecido c = instancia();
		c.setBeneficio(1);
		assertTrue(c.getBeneficio() == 1);
		assertFalse(c.getBeneficio() == 2);
	}
	
	@Test
	public void testaNomeMae()
	{
		Falecido c = instancia();
		assertTrue(c.getNomeMae().equals("mae maria"));
	}
	
	@Test
	public void testaSetNomeMae()
	{
		Falecido c = instancia();
		c.setNomeMae("mae joana");
		assertTrue(c.getNomeMae().equals("mae joana"));
		assertFalse(c.getNomeMae().equals("mae maria"));
	}
	
	@Test
	public void testaNaturalidadeMae()
	{
		Falecido c = instancia();
		assertTrue(c.getNaturalidadeMae().equals("brasileira"));
	}
	
	@Test
	public void testaSetNaturalidadeMae()
	{
		Falecido c = instancia();
		c.setNaturalidadeMae("argentina");
		assertTrue(c.getNaturalidadeMae().equals("argentina"));
		assertFalse(c.getNaturalidadeMae().equals("brasileira"));
	}
	
	@Test
	public void testaEstadoMae()
	{
		Falecido c = instancia();
		assertTrue(c.getEstadoMae() == EstadoCivil.Casado);
	}
	
	@Test
	public void testaSetEstadoMae()
	{
		Falecido c = instancia();
		c.setEstadoMae(EstadoCivil.Viuvo);
		assertTrue(c.getEstadoMae() == EstadoCivil.Viuvo);
		assertFalse(c.getEstadoMae() == EstadoCivil.Casado);
	}
	
	@Test
	public void testaIdadeMae()
	{
		Falecido c = instancia();
		assertTrue(c.getIdadeMae() == 80);
	}
	
	@Test
	public void testaSetIdadeMae()
	{
		Falecido c = instancia();
		c.setIdadeMae(81);
		assertTrue(c.getIdadeMae() == 81);
		assertFalse(c.getIdadeMae() == 80);
	}
	
	@Test
	public void testaProfissaoMae()
	{
		Falecido c = instancia();
		assertTrue(c.getProfissaoMae().equals("dona de casa"));
	}
	
	@Test
	public void testaSetProfissaoMae()
	{
		Falecido c = instancia();
		c.setProfissaoMae("banqueira");
		assertTrue(c.getProfissaoMae().equals("banqueira"));
		assertFalse(c.getProfissaoMae().equals("dona de casa"));
	}
	
	@Test
	public void testaNomePai()
	{
		Falecido c = instancia();
		assertTrue(c.getNomePai().equals("pai jose"));
	}
	
	@Test
	public void testaSetNomePai()
	{
		Falecido c = instancia();
		c.setNomePai("pai mei");
		assertTrue(c.getNomePai().equals("pai mei"));
		assertFalse(c.getNomePai().equals("pai jose"));
	}
	
	@Test
	public void testaNaturalidadePai()
	{
		Falecido c = instancia();
		assertTrue(c.getNaturalidadePai().equals("brasileira"));
	}
	
	@Test
	public void testaSetNaturalidadePai()
	{
		Falecido c = instancia();
		c.setNaturalidadePai("argentina");
		assertTrue(c.getNaturalidadePai().equals("argentina"));
		assertFalse(c.getNaturalidadePai().equals("brasileira"));
	}
	
	@Test
	public void testaEstadoPai()
	{
		Falecido c = instancia();
		assertTrue(c.getEstadoPai() == EstadoCivil.Casado);
	}
	
	@Test
	public void testaSetEstadoPai()
	{
		Falecido c = instancia();
		c.setEstadoPai(EstadoCivil.Viuvo);
		assertTrue(c.getEstadoPai() == EstadoCivil.Viuvo);
		assertFalse(c.getEstadoPai() == EstadoCivil.Casado);
	}
	
	@Test
	public void testaIdadePai()
	{
		Falecido c = instancia();
		assertTrue(c.getIdadePai() == 82);
	}
	
	@Test
	public void testaSetIdadePai()
	{
		Falecido c = instancia();
		c.setIdadePai(81);
		assertTrue(c.getIdadePai() == 81);
		assertFalse(c.getIdadePai() == 82);
	}
	
	@Test
	public void testaProfissaoPai()
	{
		Falecido c = instancia();
		assertTrue(c.getProfissaoPai().equals("pedreiro"));
	}
	
	@Test
	public void testaSetProfissaoPai()
	{
		Falecido c = instancia();
		c.setProfissaoPai("dono de casa");
		assertTrue(c.getProfissaoPai().equals("dono de casa"));
		assertFalse(c.getProfissaoPai().equals("pedreiro"));
	}
	
	@Test
	public void testaDeixaFilhos()
	{
		Falecido c = instancia();
		assertTrue(c.isDeixaFilhos() == true);
	}
	
	@Test
	public void testaSetDeixaFilhos()
	{
		Falecido c = instancia();
		c.setDeixaFilhos(false);
		assertTrue(c.isDeixaFilhos() == false);
		assertFalse(c.isDeixaFilhos() == true);
	}
}