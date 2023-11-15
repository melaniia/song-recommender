package com.example.service;

import com.example.model.Playlist;
import com.example.model.Song;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class PlaylistService {
    public Playlist getPlaylist(){
        Song melodie= new Song("awks", 4, true);
        Song altaMelodie= new Song("asdk");
        melodie.setLikes(2);
        Playlist playlist1 = new Playlist();
        List<Song> lista1= new ArrayList<>();
        lista1.add(melodie);
        lista1.add(altaMelodie);
        playlist1.setSongs(lista1);
        return playlist1;
    }

}
