package com.example.service;

import com.example.model.Playlist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PlaylistServiceTest {
    @Test
    public void getPlaylistTest(){
    PlaylistService playlistService = new PlaylistService();
    Playlist actual = playlistService.getPlaylist();

        Assertions.assertEquals("asdk", actual.getSongs().get(1).getName());
    }
    @Test
    public void isCorrectSize(){
        PlaylistService playlistService = new PlaylistService();
        Playlist actual=playlistService.getPlaylist();
        Assertions.assertEquals(2, actual.getSongs().size());
    }
    @Test
    public void isCorrectName(){
        PlaylistService playlistService = new PlaylistService();
        Playlist actual=playlistService.getPlaylist();
        Assertions.assertEquals("awks", actual.getSongs().get(0).getName());
        Assertions.assertEquals(2, actual.getSongs().get(0).getLikes());

    }



}
