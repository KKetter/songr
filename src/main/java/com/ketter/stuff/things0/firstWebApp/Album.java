package com.ketter.stuff.things0.firstWebApp;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String artist;
    int songCount;
    //total seconds
    double length;
    String imageUrl;

    @OneToMany
    List<Song> songs;

    public Album(){}

    public Album(String title, String artist, int songCount, double length, String imageUrl){
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public Long getID() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public int getSongCount() {
        return this.songCount;
    }

    public double getLength() {
        return this.length;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

}