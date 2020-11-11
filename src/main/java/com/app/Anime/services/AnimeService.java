package com.app.Anime.services;

import java.util.List;

import com.app.Anime.pojo.AnimeTable;

public interface AnimeService {
	AnimeTable createAnime(AnimeTable anime);
	List<AnimeTable> getAllAnime();
	AnimeTable postAnime(AnimeTable anime);


}
