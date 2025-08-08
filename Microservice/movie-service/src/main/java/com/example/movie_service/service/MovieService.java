package com.example.movie_service.service;

import java.util.List;

import com.example.movie_service.entity.Movie;


public interface MovieService {
    List<Movie> getAllMovies();
    Movie getMovieById(Long id);
    Movie createMovie(Movie movie);
    Movie updateMovie(Long id, Movie movie);
    void deleteMovie(Long id);
}