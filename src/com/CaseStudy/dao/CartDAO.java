package com.CaseStudy.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.CaseStudy.entities.Song;

public class CartDAO implements CartDAOi {
	
	@Override
	public int addCart(Cart cart) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Case-Study");
		EntityManager em = emf.createEntityManager();
		int result = 0;
		
		try {
			em.getTransaction().begin();
			em.persist(cart);
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
	public int addSong(Song song, Cart cart) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Case-Study");
		EntityManager em = emf.createEntityManager();
		int result = 0;
		
		List<Song> cartsongs = new Arraylist<>();
		
		
		try {
			em.getTransaction().begin();
			cartsongs = cart.getSongs();
			cartsongs.add(song);
			cart.setSongs(cartsongs);
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
	
}
