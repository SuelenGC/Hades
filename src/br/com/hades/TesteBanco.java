package br.com.hades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.hades.model.User;

public class TesteBanco {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hades");
		EntityManager em = factory.createEntityManager();
		
		//User user = new User("suelen", "123");
		//em.persist(user);//inserir
		
		//em.getTransaction().begin();
		//user.setLogin("suelengc");
		//em.merge(user);
		
		User user2 = em.find(User.class, 2L);
		
		System.out.println(user2.getLogin());
		em.getTransaction().begin();
		user2.setLogin("OutroLogin");
		em.merge(user2);
		em.getTransaction().commit();
		
		
		
		em.close();
		
	}
}
