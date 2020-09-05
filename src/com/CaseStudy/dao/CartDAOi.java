package com.CaseStudy.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface CartDAOi {
	public int addCart(Cart cart);

public int addSong(Song song, Cart cart);

}
