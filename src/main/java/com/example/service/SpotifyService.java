package com.example.service;

import com.example.model.Album;
import com.example.model.Artist;
import com.example.model.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;


@Service
public class SpotifyService {
    @Autowired
    private TokenService tokenService;


    public Artist getArtistById(String artistId){
        RestTemplate restTemplate=new RestTemplate();
        Token token = tokenService.getToken();
        HttpHeaders headers1 = new HttpHeaders();
        headers1.add("Authorization", token.getToken_type() + " " + token.getAccess_token());
        HttpEntity<String> entity1 = new HttpEntity<>(headers1);
        ResponseEntity<Artist> artist = restTemplate.exchange("https://api.spotify.com/v1/artists/1Xyo4u8uXC1ZmMpatF05PJ?si=ZXNgslrjQ4GNDDf6WVcFfQ", HttpMethod.GET, entity1, Artist.class);
        return artist.getBody();

    }

    public Album getAlbumById(String albumId){
        RestTemplate restTemplate=new RestTemplate();
        Token token = tokenService.getToken();
        HttpHeaders headers2 = new HttpHeaders();
        headers2.add("Authorization", token.getToken_type() + " " + token.getAccess_token());
        HttpEntity<String> entity1 = new HttpEntity<>(headers2);
        ResponseEntity<Album> album = restTemplate.exchange("https://api.spotify.com/v1/albums/3DT821mYJb7Ore88vA8IOO?si=kY37EyTbR8WcSdNVREJoMg", HttpMethod.GET, entity1, Album.class);

        return album.getBody();
    }

}
