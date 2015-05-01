package br.com.hades.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.hades.model.Contratante;

public class ContratanteDao {

	EntityManager em;

	public ContratanteDao() {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("hades");
		em = factory.createEntityManager();
	}

	public boolean existe(Contratante contratante) {

		if (contratante == null) {
			throw new IllegalArgumentException("Contratante não deve ser nulo");
		}

		try {
			Contratante contratanteEncontrado = em.find(Contratante.class,
					contratante.getId());
			return contratanteEncontrado == null ? false : true;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void inserir(Contratante contratante) {
		em.getTransaction().begin();
		em.persist(contratante);
		em.getTransaction().commit();
	}

	public void atualizar(Contratante contratante) {
		em.getTransaction().begin();
		em.merge(contratante);
		em.getTransaction().commit();
	}

	public void remover(Contratante contratante) {
		em.getTransaction().begin();
		em.remove(contratante);
		em.getTransaction().commit();
	}

	public void close() {
		em.close();
	}

	@SuppressWarnings("unchecked")
	public Contratante buscaPorCpf(String cpf) {
		List<Contratante> contratantes = em.createQuery("from Contratante c where c.cpf = :cpf")
										   .setParameter("cpf", cpf)
										   .getResultList();
		
		if (contratantes.size() > 0) {
			return contratantes.get(0);
		}
		return null;
	}

}
