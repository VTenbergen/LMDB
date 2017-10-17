package com.capgemini.LMDBforAssessment.controller;

import com.capgemini.LMDBforAssessment.model.Movie;
import com.capgemini.LMDBforAssessment.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import static com.capgemini.LMDBforAssessment.utils.ErrorMapping.mapErrorFields;


@RestController
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    // @RequestMapping zorgt voor de mapping naar de URL zoals gedefinieerd
    @RequestMapping(value = "/api/movie" , method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Movie> movieList() {
        return movieRepository.findAll();
    }

    // @RequestMapping zorgt voor de mapping naar de URL zoals gedefinieerd
    @RequestMapping(value = "/api/movie", method = RequestMethod.POST)
    public Movie process(@Valid @RequestBody Movie movie) {

        movieRepository.save(movie);
        return movie;
    }

    // @RequestMapping zorgt voor de mapping naar de URL zoals gedefinieerd
    @RequestMapping(value = "/api/movie", method = RequestMethod.DELETE)
    public Movie deleteMovie(@RequestBody Movie movie) {

        movieRepository.delete(movie);
        return movie;
    }

    // @RequestMapping zorgt voor de mapping naar de URL zoals gedefinieerd
    @RequestMapping(value = "/api/movie", method = RequestMethod.PUT)
    public Movie updateMovie(@Valid @RequestBody Movie movie) {

        movieRepository.save(movie);
        return movie;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public List<String> processValidationError(MethodArgumentNotValidException ex) {
        return mapErrorFields(ex);
    }
}