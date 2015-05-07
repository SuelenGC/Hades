package br.com.hades.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.hades.model.Compra;

public class CompraDao {

	EntityManager em;

	public CompraDao() {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("hades");
		em = factory.createEntityManager();
	}

	public boolean existe(Compra compra) {

		if (compra == null) {
			throw new IllegalArgumentException("EscolhaProduto não deve ser nulo");
		}

		try {
			Compra compraEncontrada = em.find(Compra.class,
					compra.getId());
			return compraEncontrada == null ? false : true;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void inserir(Compra compra) {
		em.getTransaction().begin();
		em.persist(compra);
		em.getTransaction().commit();
	}

	public void atualizar(Compra compra) {
		em.getTransaction().begin();
		em.merge(compra);
		em.getTransaction().commit();
	}

	public void remover(Compra compra) {
		em.getTransaction().begin();
		em.remove(compra);
		em.getTransaction().commit();
	}
	
	public Compra buscaPorId(Compra compra) {

		if (compra == null) {
			throw new IllegalArgumentException("EscolhaProduto não deve ser nulo");
		}

		try {
			Compra compraEncontrada = em.find(Compra.class,
					compra.getId());
			return compraEncontrada;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public Compra buscaPorId(Long id) {
		Compra compraEncontrada = em.find(Compra.class,
				id);
		return compraEncontrada;
	}

	public void close() {
		em.close();
	}
}