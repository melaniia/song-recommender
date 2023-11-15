package com.example.controller;

import java.util.List;

import com.example.model.Album;
import com.example.model.Artist;
import com.example.service.SongService;
import com.example.service.SpotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.example.model.Song;
import com.example.service.PlaylistService;
import com.example.service.RecommendationService;

@RestController
public class SongRecommenderController {
	@Autowired
	private RecommendationService recommendationService;
	@Autowired
	private PlaylistService playlistService;
	@Autowired
	private SpotifyService spotifyService;
	@Autowired
	private SongService songService;
	@GetMapping("/hello")
	public List<Song> helloWorld() {
		playlistService.getPlaylist();
		return recommendationService.getRecommendations(null);
	}
	@GetMapping("/artist")
	public Artist getArtist(){
		return spotifyService.getArtistById("123");
	}
	@GetMapping("/album")
	public Album getAlbum(){
		return spotifyService.getAlbumById("3DT821mYJb7Ore88vA8IOO?si=kY37EyTbR8WcSdNVREJoMg");

	}

	@PostMapping(value = "/songs", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addSong(@RequestBody Song song){
		songService.addSong(song);
	}
	@GetMapping("/songs/{id}")
	public Song getSongById(@PathVariable int id){
		return songService.findById(id);
	}
}
