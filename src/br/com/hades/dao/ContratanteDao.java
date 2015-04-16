package br.com.hades.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.hades.model.Contratante;


public class ContratanteDao {
	
	EntityManager em;

	public ContratanteDao() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hades");
		em = factory.createEntityManager();
	}

	public boolean existeUsuario(Contratante contratante) {
		
		if(contratante == null) {
			throw new IllegalArgumentException("Contratante não deve ser nulo");
		}
		
		try {
			Contratante contratanteEncontrado = em.find(Contratante.class, contratante.getId());
			return contratanteEncontrado == null ? false : true;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void inserir(Contratante contratante) {
		em.persist(contratante);
	}
	
	public void atualizar(Contratante contratante) {
		em.merge(contratante);
	}
	
	public void remover(Contratante contratante) {
		em.remove(contratante);
	}
	
	private void close() {
		em.close();
	}
}

