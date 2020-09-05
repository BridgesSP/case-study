package com.CaseStudy.entities;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;

public class Cart {

	@Id
	private int userId;
	
	@Basic
	@OneToMany(mappedBy = songcart)
	private List<Song> songs;

	@Basic
	public int getUserId() {
		return userId;
	}

	@Basic
	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Basic
	public List<Song> getSongs() {
		return songs;
	}

	@Basic
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	

}
