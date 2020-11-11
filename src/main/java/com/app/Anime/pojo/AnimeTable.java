package com.app.Anime.pojo;

import javax.persistence.*;



@Entity
@Table
public class AnimeTable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int animeid;
	
	@Column(unique=true)
	String animeName;
	
	@Column(unique=true)
	int episodes;
	
	public AnimeTable() {
		// TODO Auto-generated constructor stub
	}


	public AnimeTable(int animeid, String animeName, int episodes) {
		super();
		this.animeid = animeid;
		this.animeName = animeName;
		this.episodes = episodes;
	}


	public long getId() {
		return animeid;
	}


	public String getAnimeName() {
		return animeName;
	}

	public void setAnimeName(String animeName) {
		this.animeName = animeName;
	}

	public int getEpisodes() {
		return episodes;
	}

	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}

	@Override
	public String toString() {
		return "AnimeTable [id=" + animeid + ", animeName=" + animeName + ", episodes=" + episodes + "]";
	}
	
	
	
	

}
