package br.com.hades.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.hades.model.Falecido;

public class FalecidoDao {

	EntityManager em;

	public FalecidoDao() {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("hades");
		em = factory.createEntityManager();
	}

	public boolean existe(Falecido falecido) {

		if (falecido == null) {
			throw new IllegalArgumentException("Falecido não deve ser nulo");
		}

		try {
			Falecido contratanteEncontrado = em.find(Falecido.class,
					falecido.getId());
			return contratanteEncontrado == null ? false : true;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void inserir(Falecido falecido) {
		em.getTransaction().begin();
		em.persist(falecido);
		em.getTransaction().commit();
	}

	public void atualizar(Falecido falecido) {
		em.getTransaction().begin();
		em.merge(falecido);
		em.getTransaction().commit();
	}

	public void remover(Falecido falecido) {
		em.getTransaction().begin();
		em.remove(falecido);
		em.getTransaction().commit();
	}
	
	public Falecido buscaPorId(Falecido falecido) {

		if (falecido == null) {
			throw new IllegalArgumentException("Falecido não deve ser nulo");
		}

		try {
			Falecido contratanteEncontrado = em.find(Falecido.class,
					falecido.getId());
			return contratanteEncontrado;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public Falecido buscaPorId(Long id) {
		Falecido contratanteEncontrado = em.find(Falecido.class,
				id);
		return contratanteEncontrado;
	}

	public void close() {
		em.close();
	}
}