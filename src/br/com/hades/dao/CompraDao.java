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

	public boolean existe(Compra escolhaProduto) {

		if (escolhaProduto == null) {
			throw new IllegalArgumentException("EscolhaProduto não deve ser nulo");
		}

		try {
			Compra contratanteEncontrado = em.find(Compra.class,
					escolhaProduto.getId());
			return contratanteEncontrado == null ? false : true;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void inserir(Compra escolhaProduto) {
		em.getTransaction().begin();
		em.persist(escolhaProduto);
		em.getTransaction().commit();
	}

	public void atualizar(Compra escolhaProduto) {
		em.getTransaction().begin();
		em.merge(escolhaProduto);
		em.getTransaction().commit();
	}

	public void remover(Compra escolhaProduto) {
		em.getTransaction().begin();
		em.remove(escolhaProduto);
		em.getTransaction().commit();
	}
	
	public Compra buscaPorId(Compra escolhaProduto) {

		if (escolhaProduto == null) {
			throw new IllegalArgumentException("EscolhaProduto não deve ser nulo");
		}

		try {
			Compra contratanteEncontrado = em.find(Compra.class,
					escolhaProduto.getId());
			return contratanteEncontrado;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public Compra buscaPorId(Long id) {
		Compra contratanteEncontrado = em.find(Compra.class,
				id);
		return contratanteEncontrado;
	}

	public void close() {
		em.close();
	}
}