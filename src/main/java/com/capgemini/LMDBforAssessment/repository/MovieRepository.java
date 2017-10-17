package com.capgemini.LMDBforAssessment.repository;

import com.capgemini.LMDBforAssessment.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}

// Slechts een Repo..