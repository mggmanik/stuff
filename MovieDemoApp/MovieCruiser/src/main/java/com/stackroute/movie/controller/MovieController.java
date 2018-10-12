package com.stackroute.movie.controller;

import com.stackroute.movie.model.Movie;
import com.stackroute.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/movieCruiser")
@CrossOrigin("*")
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public ResponseEntity<?> addMovie(@RequestBody Movie movie) {
        ResponseEntity<?> responseEntity;
        responseEntity = new ResponseEntity<>(movieService.addMovie(movie), HttpStatus.CREATED);
        return responseEntity;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMovie(@PathVariable("id") int id) {
        ResponseEntity<?> responseEntity;
        if (movieService.deleteMovie(id)) {
            responseEntity = new ResponseEntity<>(HttpStatus.OK);
        } else {
            responseEntity = new ResponseEntity<>("Not Found!", HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMovieById(@PathVariable("id") int id) {
        ResponseEntity<?> responseEntity;
        if (movieService.existById(id)) {
            responseEntity = new ResponseEntity<>(HttpStatus.OK);
        } else {
            responseEntity = new ResponseEntity<>("Not Found!", HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    }

    @GetMapping
    public ResponseEntity<?> findAllMovies() {
        ResponseEntity<?> responseEntity;
        responseEntity = new ResponseEntity<>(movieService.findAllMovies(),HttpStatus.OK);
        return responseEntity;
    }
}
