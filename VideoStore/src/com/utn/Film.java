package com.utn;

import java.util.Date;

enum Classification {G,PG,R,NC17,UNRATED}
enum Genre {Action,Adventure,Comedy,Drama,Horror,Documentary}

public class Film {
    String title;
    Date releaseDate;
    Integer duration;
    String description;
    String country;
    Genre genre;
    Classification classification;

    public Film(String title, Date releaseDate, Integer duration, String description, String country, Genre genre, Classification classification) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.description = description;
        this.country = country;
        this.genre = genre;
        this.classification = classification;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "Film { " +
                "title: '" + title + "' |" +
                ", releaseDate: " + releaseDate + " |" +
                ", duration: " + duration + " min |" +
                ", description: '" + description + "' |" +
                ", country: " + country + " |" +
                ", genre: " + genre + " |" +
                ", classification=" + classification +
                " }";
    }
}
