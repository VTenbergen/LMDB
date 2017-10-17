package com.capgemini.LMDBforAssessment.model;

import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;
import javax.persistence.*;

@Entity
public class Movie {

    @Id
    @Column(name = "movieNumber")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long movieNumber;

    //  @Length geeft een maximum lengte aan
    @Length(max = 32, min = 1, message = "Movie title must be between 1 and 32 characters.")
    private String movieTitle;

    //  @Length geeft een maximum lengte aan
    //  @Pattern geeft een vereist patroon in het invoerveld aan
    @Pattern(regexp="\\d+", message = "Year of release must only contain numbers.")
    @Length(max = 4, min = 1, message = "Year of release number must be between 1 and 4 numbers.")
    private String releaseYear;

    //  @Length geeft een maximum lengte aan
    //  @Pattern geeft een vereist patroon in het invoerveld aan
    @Pattern(regexp="\\d+", message = "Rating must only contain numbers.")
    @Length(max = 2, min = 1, message = "Rating must be a value between 1 and 10.")
    private String rating;

    private String leadActor;

    private String director;

    //  @Length geeft een maximum lengte aan
    //  @Pattern geeft een vereist patroon in het invoerveld aan
    @Pattern(regexp="\\d+", message = "Duration (in minutes) must only contain numbers.")
    @Length(max = 3, min = 1, message = "Duration (in minutes) must be between 1 and 3 numbers.")
    private String duration;

    //  @Length geeft een maximum lengte aan
    @Length(max = 3, min = 2, message = "Watched must be between 2 and 3 characters.")
    private String watched;

    public Movie() {
    }

    public long getMovieNumber() {
        return movieNumber;
    }

    public void setMovieNumber(long movieNumber) {
        this.movieNumber = movieNumber;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getWatched() {
        return watched;
    }

    public void setWatched(String watched) {
        this.watched = watched;
    }

    @Override
    public String toString() {
        return String.format(
                "Movie[id=%d, movieTitle='%s', rating='%s']",
                movieNumber, movieTitle, rating);
    }
}
