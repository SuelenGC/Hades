package br.com.hades.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.hades.model.DadosObito;

public class DadosObitoDao {

	EntityManager em;

	public DadosObitoDao() {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("hades");
		em = factory.createEntityManager();
	}

	public boolean existe(DadosObito obito) {

		if (obito == null) {
			throw new IllegalArgumentException("DadosObito não deve ser nulo");
		}

		try {
			DadosObito contratanteEncontrado = em.find(DadosObito.class,
					obito.getId());
			return contratanteEncontrado == null ? false : true;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void inserir(DadosObito obito) {
		em.getTransaction().begin();
		em.persist(obito);
		em.getTransaction().commit();
	}

	public void atualizar(DadosObito obito) {
		em.getTransaction().begin();
		em.merge(obito);
		em.getTransaction().commit();
	}

	public void remover(DadosObito obito) {
		em.getTransaction().begin();
		em.remove(obito);
		em.getTransaction().commit();
	}
	
	public DadosObito buscaPorId(DadosObito obito) {

		if (obito == null) {
			throw new IllegalArgumentException("DadosObito não deve ser nulo");
		}

		try {
			DadosObito contratanteEncontrado = em.find(DadosObito.class,
					obito.getId());
			return contratanteEncontrado;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public DadosObito buscaPorId(Long id) {
		DadosObito contratanteEncontrado = em.find(DadosObito.class,
				id);
		return contratanteEncontrado;
	}

	public void close() {
		em.close();
	}
}