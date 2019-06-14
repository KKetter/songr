package com.ketter.stuff.things0.firstWebApp;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    double length;
    int trackNumber;
    //fk from Album table - title?
    String containingAlbum;

    @ManyToOne
    Album album;

    public Song(){}

    public Song(String title, double length, int trackNumber, String containingAlbum){
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.containingAlbum = containingAlbum;
    }

    public Album getAlbum() {
        return this.album;
    }

    public double getLength() {
        return this.length;
    }

    public int getTrackNumber() {
        return this.trackNumber;
    }

    public Long getId() {
        return this.id;
    }

    public String getContainingAlbum() {
        return this.containingAlbum;
    }

    public String getTitle() {
        return this.title;
    }
}

