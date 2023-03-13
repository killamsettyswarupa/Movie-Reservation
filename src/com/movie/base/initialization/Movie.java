package com.movie.base.initialization;

public class Movie {
    String MovieName;
    String MovieDuration;
    String ReleaseYear;

    public Movie(String movieName, String movieDuration, String releaseYear) {
        MovieName = movieName;
        MovieDuration = movieDuration;
        ReleaseYear = releaseYear;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getMovieDuration() {
        return MovieDuration;
    }

    public void setMovieDuration(String movieDuration) {
        MovieDuration = movieDuration;
    }

    public String getReleaseYear() {
        return ReleaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        ReleaseYear = releaseYear;
    }
}
