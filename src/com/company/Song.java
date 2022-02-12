package com.company;

import java.util.Date;

public abstract class Song {
    private String title;
    private Date date;
    private String id;
    private float duration;
    private String genre;
    private String cover;
    private String descrip;

    public Song(String title, String id, Date date, float duration, String genre, String cover, String descrip) {
        this.title = title;
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.descrip = descrip;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescription(String descrip) {
        this.descrip = descrip;
    }

}



