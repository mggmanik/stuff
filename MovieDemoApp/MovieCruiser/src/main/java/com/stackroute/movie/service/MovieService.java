package com.stackroute.movie.service;

import com.stackroute.movie.model.Movie;

import java.util.List;

public interface MovieService {

    Movie addMovie(Movie movie);

    boolean deleteMovie(int id);

    boolean existById(int id);

    List<Movie> findAllMovies();
}
