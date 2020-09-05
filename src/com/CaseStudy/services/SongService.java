package com.CaseStudy.services;

import com.CaseStudy.dao.SongDAO;
import com.CaseStudy.entities.Song;

public class SongService {
	
	private SongDAO songdao = new SongDAO();
	public int addSongService(Song song) {
	int result = songdao.addSong(song);	
		return result;
	}
	
	public Song getSongByIdService(int songid) {
	Song song = songdao.getSongById(songid);
		return song;
	}

}
