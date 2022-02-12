package com.company;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs;
    private String title;

    /**
     *
     * @param title titulo de la cancion
     */
    public Playlist( String title) {
        this.songs = new ArrayList<>();
        this.title = title;
    }

    public void addSongs(Song song){

        songs.add(song);
    }
    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public String gettitle() {
        return title;
    }

    public void setName(String title) {
        this.title = title;
    }
}
