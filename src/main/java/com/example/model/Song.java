package com.example.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Song {
    private String name;
    private Integer likes;
    private Boolean isFavorite;

    @JsonCreator
    public Song(@JsonProperty(value = "name") String name,
                @JsonProperty(value = "likes") Integer likes,
                @JsonProperty(value="isFavorite") Boolean isFavorite) {
        this.name = name;
        this.likes = likes;
        this.isFavorite = isFavorite;
    }

    public Song() {
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

   public Boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(Boolean favorite) {
        isFavorite = favorite;
    }

    public Song(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;   
        }
}

