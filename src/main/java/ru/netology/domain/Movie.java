package ru.netology.domain;

public class Movie {
    private int id;
    private int movieId;
    private String name;
    private String genre;
    private String imageUrl;

    public Movie(int id, int movieId, String name, String genre, String imageUrl) {
        this.id = id;
        this.movieId = movieId;
        this.name = name;
        this.genre = genre;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

