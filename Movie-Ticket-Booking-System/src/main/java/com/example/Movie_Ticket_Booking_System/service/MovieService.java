package com.example.Movie_Ticket_Booking_System.service;

import java.util.List;

import com.example.Movie_Ticket_Booking_System.entity.Movie;

public interface MovieService {
    List<Movie> getAllMovies();
    Movie getMovieById(Long id);
    Movie createMovie(Movie movie);
    Movie updateMovie(Long id, Movie movie);
    void deleteMovie(Long id);
}
