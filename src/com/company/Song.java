package com.company;
/**
 * @autor Jair Rincon - jairesrival2@gmail.com
 * @autor Esteban Garibello - kurosakinero23@gmail.com
 */
import java.util.Date;


public abstract class Song {
    private String title;
    private Date date;
    private String id;
    private float duration;
    private String genre;
    private String cover;
    private String description;

    /**
     *
     * @param title titulo de la cancion
     * @param id identificador
     * @param date fecha de la cancion
     * @param duration duracion
     * @param genre genero de musica
     * @param cover caratula de la musica
     * @param description descripcion
     */
    public Song(String title, String id, Date date, float duration, String genre, String cover, String description) {
        this.title = title;
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
    }

    /**
     *setter and getter
     */
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}



