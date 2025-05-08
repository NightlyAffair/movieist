package com.nithvin.movies;

//contains a method run()
import org.springframework.boot.SpringApplication;
//Contains annotation for below
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

}
