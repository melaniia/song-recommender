package com.example.service;

import com.example.model.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class RecommendationService {


    public List<Song> getRecommendations(Song song){
        List<Song> result= new ArrayList<>();
        result.add(new Song("Leru-i ler"));
        result.add(new Song("All I want for Christmas is you"));
        return result;
    }
}
