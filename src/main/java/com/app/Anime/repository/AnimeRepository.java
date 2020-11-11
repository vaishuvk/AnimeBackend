package com.app.Anime.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Anime.pojo.AnimeTable;

public interface AnimeRepository extends JpaRepository<AnimeTable, Long>{
	

}
