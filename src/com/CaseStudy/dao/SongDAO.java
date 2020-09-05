package com.CaseStudy.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.CaseStudy.entities.Song;

public class SongDAO implements SongDAOi {

	@Override
	public int addSong(Song song) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Case-Study");
		EntityManager em = emf.createEntityManager();
		int result = 0;
		
		try {
			em.getTransaction().begin();
			em.persist(song);
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
	public Song getSongById(int songid) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Case-Study");
		EntityManager em = emf.createEntityManager();
		Song song = null;
		
		try {
			song = em.find(Song.class, songid);
		}
		
		catch (Exception e) {
			System.out.println("Error 404: Not found.");
		}
		finally {
		// close //
		em.close();
		emf.close();
		}
		
		return song;
	}

}
