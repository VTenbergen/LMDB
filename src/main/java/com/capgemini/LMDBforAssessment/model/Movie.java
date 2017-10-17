package com.capgemini.LMDBforAssessment.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
public class Movie {

    @Id
    @Column(name = "movieNumber")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long movieNumber;

    @Length(max = 32, min = 1, message = "Movie title must be between 1 and 32 characters.")
    private String movieTitle;

    @Length(max = 4, min = 1, message = "Year of release number must be between 1 and 4 numbers.")
    @Pattern(regexp="\\d+", message = "Year of release must only contain numbers.")
    private String releaseYear;

    @Length(max = 2, min = 1, message = "Rating must be a value between 1 and 10.")
    @Pattern(regexp="\\d+", message = "Rating must only contain numbers.")
    private String rating;

    private String leadActor;

    private String director;

    @Length(max = 3, min = 1, message = "Duration (in minutes) must be between 1 and 3 numbers.")
    @Pattern(regexp="\\d+", message = "Duration (in minutes) must only contain numbers.")
    private String duration;

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

//    public long getMovieNumber() {
//        return movieNumber;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public String getZipcode() {
//        return zipcode;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public void setZipcode(String zipcode) {
//        this.zipcode = zipcode;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

    @Override
    public String toString() {
        return String.format(
                "Movie[id=%d, movieTitle='%s', rating='%s']",
                movieNumber, movieTitle, rating);
    }
}
