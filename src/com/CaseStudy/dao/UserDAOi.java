package com.CaseStudy.dao;

import java.util.List;

import com.CaseStudy.entities.Song;
import com.CaseStudy.entities.User;


public interface UserDAOi {
	public int addUser(User user);
	public User getUserById(int userid);
	public List<Song> getUserSongs(int userid, Song song);
}
