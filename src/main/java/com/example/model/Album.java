package com.example.model;

import java.io.Serializable;
import java.util.List;

public class Album implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String album_type;

    private String label;
    private String name;
    private int popularity;
    private String release_date;
    private int total_tracks;
    private int offset;
    private int total;

    public String getName() { return name;
    }
}
