package com.shilpy.recyclerviewexample;

/**
 * Created by Shilpy on 8/23/2016.
 */
public class Movie {
    private String title, genre;
    private int img;

    public Movie() {
    }

    public Movie(int img,String title, String genre) {
        this.img = img;
        this.title = title;
        this.genre = genre;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img1) {
        this.img = img1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
