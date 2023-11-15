package com.example.model;

import java.io.Serializable;
import java.util.List;

public class Artist implements Serializable {
    private List<String> genres;
    private String id;
    private String name;
    private int popularity;
    private String type;

    public String getName() {
        return name;
    }


}
