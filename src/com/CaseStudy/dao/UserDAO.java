package com.CaseStudy.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.CaseStudy.entities.Song;
import com.CaseStudy.entities.User;

public class UserDAO implements UserDAOi {

	@Override
	public int addUser(User user) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Case-Study");
		EntityManager em = emf.createEntityManager();
		int result = 0;
		
		try {
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
			result = 1;
		}
		
		catch (Exception e) {
			System.out.println("Error 404: Not found.");
		}
		finally {
		// close //
		em.close();
		emf.close();
		}
		
		return result;
	}

	@Override
	public User getUserById(int userid) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Case-Study");
		EntityManager em = emf.createEntityManager();
		User user = null;
		
		try {
			user = em.find(User.class, userid);
		}
		
		catch (Exception e) {
			System.out.println("Error 404: Not found.");
		}
		finally {
		// close //
		em.close();
		emf.close();
		}
		
		return user;
	}

	@Override
	public List<Song> getUserSongs(int userid, Song song) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Case-Study");
		EntityManager em = emf.createEntityManager();
		List<Song> songs = null;
		
		try {
			em.getTransaction().begin();
			user = em.find(User.class, userid);
			songs = user.getSongs();
			em.getTransaction().commit();
		}
		
		catch (Exception e) {
			System.out.println("Error 404: Not found.");
		}
		finally {
		// close //
		em.close();
		emf.close();
		}
		
		return songs;
	}

}
