package com.capgemini.LMDBforAssessment.repository;

import com.capgemini.model.Guest;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Guest, Long> {
}

