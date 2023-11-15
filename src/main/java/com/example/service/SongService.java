package com.example.service;

import com.example.entity.SongEntity;
import com.example.model.Song;
import com.example.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SongService {
    @Autowired
    private SongRepository songRepository;
    public void addSong(Song song){
        songRepository.save(new SongEntity(song.getName(), song.getLikes(), song.isFavorite()));

    }
    public Song findById(int id){
        Optional<SongEntity> entity = songRepository.findById(id);
        if (entity.isPresent()) {
            SongEntity songEntity = entity.get();
            return new Song(songEntity.getName(), songEntity.getLikes(), songEntity.isFavorite());
        }

        return new Song();
    }
}
