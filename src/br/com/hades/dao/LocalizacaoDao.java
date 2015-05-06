package br.com.hades.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.hades.model.Localizacao;

public class LocalizacaoDao {

	EntityManager em;

	public LocalizacaoDao() {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("hades");
		em = factory.createEntityManager();
	}

	public void inserir(Localizacao localizacao) {
		em.getTransaction().begin();
		em.persist(localizacao);
		em.getTransaction().commit();
	}

	public void atualizar(Localizacao localizacao) {
		em.getTransaction().begin();
		em.merge(localizacao);
		em.getTransaction().commit();
	}

	public void remover(Localizacao localizacao) {
		em.getTransaction().begin();
		em.remove(localizacao);
		em.getTransaction().commit();
	}

	public void close() {
		em.close();
	}

}
