package com.app.Anime.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Anime.pojo.AnimeTable;
import com.app.Anime.repository.AnimeRepository;
@Service
@Transactional
public class AnimeServiceImp implements AnimeService{
	
	@Autowired
	private AnimeRepository animerepository;
	

	@Override
	public AnimeTable createAnime(AnimeTable anime) {
		// TODO Auto-generated method stub
		return animerepository.save(anime);
	}


	@Override
	public List<AnimeTable> getAllAnime() {
		// TODO Auto-generated method stub
		return animerepository.findAll();
	}


	@Override
	public AnimeTable postAnime(AnimeTable anime) {
		// TODO Auto-generated method stub
		return animerepository.save(anime);
	}
	
	
	

//	@Override
//	public AnimeTable updateAnime(AnimeTable anime) {
//Optional<AnimeTable> AnimeDb = this.animerepository.findById(anime.getId());
//		
//		if(AnimeDb.isPresent()) {
//			AnimeTable animeUpdate = AnimeDb.get();
//			animeUpdate.setId(anime.getId());
//			animeUpdate.setAnimeName(anime.getAnimeName());
//			animeUpdate.setEpisodes(anime.getEpisodes());
//			animerepository.save(animeUpdate);
//			return animeUpdate;
//		}else {}
//	}
//
//	@Override
//	public List<AnimeTable> getAllAnimeTable() {
//		return this.animerepository.findAll();
//	}
//
//	@Override
//	public AnimeTable getAnimeTableById(int AnimeId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void deleteanime(int Id) {
//		// TODO Auto-generated method stub
//		
//	}

}
