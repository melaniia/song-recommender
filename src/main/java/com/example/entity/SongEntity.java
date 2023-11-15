package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class SongEntity {
    @Id
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private int likes;
    @Column
    private boolean isFavorite;

    public SongEntity(String name, int likes, boolean isFavorite) {
        this.name = name;
        this.likes = likes;
        this.isFavorite = isFavorite;
    }

    public SongEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
