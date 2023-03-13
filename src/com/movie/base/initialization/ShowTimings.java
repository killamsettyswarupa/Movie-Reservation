package com.movie.base.initialization;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

public class ShowTimings {
    LocalTime[] MovieTime;


    public LocalTime[]  getMovieTime() {
        return this.MovieTime;
    }

    public void setMovieTime(LocalTime[] movieTime) {
        this.MovieTime = movieTime;
    }
}
