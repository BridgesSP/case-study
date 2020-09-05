package com.CaseStudy.dao;

import java.util.List;

import com.CaseStudy.entities.Song;


public interface SongDAOi {
	public int addSong(Song song);
	public Song getSongById(int songid);

}
