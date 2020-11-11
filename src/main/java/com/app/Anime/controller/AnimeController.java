package com.app.Anime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Anime.pojo.AnimeTable;
import com.app.Anime.services.AnimeService;

@RestController
@RequestMapping("/anime")
@CrossOrigin(origins = "http://localhost:4200")
public class AnimeController {
	@Autowired
	private AnimeService animeService;
	
	
	@GetMapping("/getAll")
	public List<AnimeTable> getAllAnime()
	{
		
		return this.animeService.getAllAnime();
	}
	
	@PostMapping("/addAnime")
	public AnimeTable animePost(@RequestBody AnimeTable anime)
	{
		return this.animeService.postAnime(anime);
	}
}


