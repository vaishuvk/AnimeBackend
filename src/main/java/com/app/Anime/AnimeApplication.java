package com.app.Anime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimeApplication.class, args);
		
		String port=System.getenv("PORT");
		String host=System.getenv("HOST");
		String my_sqluser=System.getenv("MY_SQLUSER");
		String my_sqlpass=System.getenv("MY_SQLPASS");
	}

}
