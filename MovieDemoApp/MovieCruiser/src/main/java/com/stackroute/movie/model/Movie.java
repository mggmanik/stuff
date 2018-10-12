package com.stackroute.movie.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {

    @Id
    private int id;
    private String title;
    private int popularity;
    private int vote_average;
    private boolean movieStatus;
    private String release_date;

    public Movie() {
    }

    public Movie(int id, String title, int popularity, int vote_average, boolean movieStatus, String release_date) {
        this.id = id;
        this.title = title;
        this.popularity = popularity;
        this.vote_average = vote_average;
        this.movieStatus = movieStatus;
        this.release_date = release_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public int getVote_average() {
        return vote_average;
    }

    public void setVote_average(int vote_average) {
        this.vote_average = vote_average;
    }

    public boolean isMovieStatus() {
        return movieStatus;
    }

    public void setMovieStatus(boolean movieStatus) {
        this.movieStatus = movieStatus;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", popularity=" + popularity +
                ", vote_average=" + vote_average +
                ", movieStatus=" + movieStatus +
                ", release_date=" + release_date +
                '}';
    }
}
