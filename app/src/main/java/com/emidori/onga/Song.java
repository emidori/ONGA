package com.emidori.onga;

/**
 * Created by Esther on 20/06/2016.
 * Song class - Model data for a single audio file.
 */
public class Song {

    private long id;
    private String title;
    private String artist;

    public Song(long songID, String songTitle, String songArtist){

        id=songID;
        title=songTitle;
        artist=songArtist;
    }

    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}




}
