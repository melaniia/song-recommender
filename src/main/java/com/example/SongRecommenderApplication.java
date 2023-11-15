package com.example;

	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration;

@SpringBootApplication()
	public class SongRecommenderApplication {

		public static void main(String[] args) {
			SpringApplication.run(SongRecommenderApplication.class, args);
		}

	}


