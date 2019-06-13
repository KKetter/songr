package com.ketter.stuff.things0.firstWebApp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Album {

    @Id
    Long id;
    String title;
    String artist;
    int songCount;
    //total seconds
    double length;
    String imageUrl;

    public Album(){
        this.id = id;
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