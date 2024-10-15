package org.http.backend.repository;

import org.http.backend.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository  extends MongoRepository<Movie, String> {
    @Override
    List<Movie> findAll();

    List<Movie> findByNameContains(String name);

}
