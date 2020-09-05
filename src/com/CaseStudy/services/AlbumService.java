package com.CaseStudy.services;

import java.util.List;

import com.CaseStudy.dao.AlbumDAO;
import com.CaseStudy.entities.Album;
import com.CaseStudy.entities.Song;

public class AlbumService {
	private AlbumDAO albumDao = new AlbumDAO();
	
	public int addAlbumService(Album album) {
		int result = albumDao.addAlbum(album);
		return result;
	}

	public Album getAlbumByIdService(int albumid) {
		Album album = albumDao.getAlbumById(albumid);
		return album;
	}

	public List<Song> getAllSongsService() {
		List<Song> songs = albumDao.getAllSongs();
		return songs;
	}

}
