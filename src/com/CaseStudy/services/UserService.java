package com.CaseStudy.services;

import java.util.List;

import com.CaseStudy.dao.UserDAO;
import com.CaseStudy.entities.Song;
import com.CaseStudy.entities.User;

public class UserService { 
	
	private UserDAO userdao = new UserDAO();
	public int addUserService(User user) {
	int result = userdao.addUser(user);
		return result;
	}

	public User getUserByIdService(int userid) {
	User user = userdao.getUserById(userid);
		return user;
	}

	public List<Song> getUserSongs() {
	List<Song> songs = userdao.getUserSongs();
		return songs;
	}

}
