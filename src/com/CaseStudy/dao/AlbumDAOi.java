package com.CaseStudy.dao;

import java.util.List;

import com.CaseStudy.entities.Album;
import com.CaseStudy.entities.Song;

public interface AlbumDAOi {
	public int addAlbum(Album album);
	public Album getAlbumById(int albumid);
	public List<Song> getAllSongs();
	
}
