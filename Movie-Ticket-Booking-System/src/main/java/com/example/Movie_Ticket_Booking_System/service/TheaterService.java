package com.example.Movie_Ticket_Booking_System.service;

import java.util.List;

import com.example.Movie_Ticket_Booking_System.entity.Theater;

public interface TheaterService {
    List<Theater> getAllTheaters();
    Theater getTheaterById(Long id);
    Theater createTheater(Theater theater);
    Theater updateTheater(Long id, Theater theater);
    void deleteTheater(Long id);
}