package com.CaseStudy.entities;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.CaseStudy.entities.*;

@Entity
public class Song {
	@Id
	private int songid;
	
	@Basic
	private String songtitle;
	
	@Basic
	private String songartist;
	
	@Basic
	@ManyToOne
	private List<Song> songalbum;
	
	@Basic
	private double songprice;
	
	@ManyToOne
	private Cart cartsong;

	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Song(int songid, String songtitle, String songartist, List<Song> songalbum, double songprice) {
		super();
		this.songid = songid;
		this.songtitle = songtitle;
		this.songartist = songartist;
		this.songalbum = songalbum;
		this.songprice = songprice;
	}

	public int getSongid() {
		return songid;
	}

	public void setSongid(int songid) {
		this.songid = songid;
	}

	public String getSongtitle() {
		return songtitle;
	}

	public void setSongtitle(String songtitle) {
		this.songtitle = songtitle;
	}

	public String getSongartist() {
		return songartist;
	}

	public void setSongartist(String songartist) {
		this.songartist = songartist;
	}

	public List<Song> getSongalbum() {
		return songalbum;
	}

	public void setSongalbum(List<Song> songalbum) {
		this.songalbum = songalbum;
	}

	public double getSongprice() {
		return songprice;
	}

	public void setSongprice(double songprice) {
		this.songprice = songprice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((songalbum == null) ? 0 : songalbum.hashCode());
		result = prime * result + ((songartist == null) ? 0 : songartist.hashCode());
		result = prime * result + songid;
		long temp;
		temp = Double.doubleToLongBits(songprice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((songtitle == null) ? 0 : songtitle.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		if (songalbum == null) {
			if (other.songalbum != null)
				return false;
		} else if (!songalbum.equals(other.songalbum))
			return false;
		if (songartist == null) {
			if (other.songartist != null)
				return false;
		} else if (!songartist.equals(other.songartist))
			return false;
		if (songid != other.songid)
			return false;
		if (Double.doubleToLongBits(songprice) != Double.doubleToLongBits(other.songprice))
			return false;
		if (songtitle == null) {
			if (other.songtitle != null)
				return false;
		} else if (!songtitle.equals(other.songtitle))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Song [songid=" + songid + ", songtitle=" + songtitle + ", songartist=" + songartist + ", songalbum="
				+ songalbum + ", songprice=" + songprice + "]";
	}
	
	
}
