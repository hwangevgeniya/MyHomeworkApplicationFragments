package com.geektech.myhomeworkapplicationfragments;

public class Song {

    private String songName, artistName, duration;
    private int index;

    public Song(int index, String songName, String artistName, String duration) {
        this.songName = songName;
        this.artistName = artistName;
        this.index = index;
        this.duration = duration;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
