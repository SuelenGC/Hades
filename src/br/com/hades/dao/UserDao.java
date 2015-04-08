package br.com.hades.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.hades.model.User;


public class UserDao {
	
	EntityManager em;

	public UserDao() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hades");
		em = factory.createEntityManager();
	}

	public boolean existeUsuario(User user) {
		
		if(user == null) {
			throw new IllegalArgumentException("Usuário não deve ser nulo");
		}
		
		try {
			User userFounded = em.find(User.class, user.getId());
			return userFounded == null ? false : true;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void inserir(User user) {
		em.persist(user);
	}
	
	public void atualizar(User user) {
		em.merge(user);
	}
	
	public void remover(User user) {
		em.remove(user);
	}
	
	private void close() {
		em.close();
	}
}

