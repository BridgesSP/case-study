package com.CaseStudy.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.CaseStudy.entities.Album;
import com.CaseStudy.entities.Song;

public class AlbumDAO implements AlbumDAOi {

	@Override
	public int addAlbum(Album album) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Case-Study");
		EntityManager em = emf.createEntityManager();
		int result = 0;
		
		try {
			em.getTransaction().begin();
			em.persist(album);
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
	public Album getAlbumById(int albumid) {
		Album album = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Case-Study");
		EntityManager em = emf.createEntityManager();
		
		try {
			album = em.find(Album.class, albumid);
		}
		
		catch (Exception e) {
			System.out.println("Error 404: Not found.");
		}
		finally {
		// close //
		em.close();
		emf.close();
		
		}
		
		return album;
	}

	@Override
	public List<Song> getAllSongs() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Case-Study");
		EntityManager em = emf.createEntityManager();
		
		List<Song> songs=null;
		try {
			Query query = em.createQuery("SELECT s FROM Song s");
			songs = query.getResultList();
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
