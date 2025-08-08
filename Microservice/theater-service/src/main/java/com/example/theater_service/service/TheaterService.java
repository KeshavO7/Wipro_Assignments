package com.example.theater_service.service;

import java.util.List;
import com.example.theater_service.entity.Theater;

public interface TheaterService {
    List<Theater> getAllTheaters();
    Theater getTheaterById(Long id);
    Theater createTheater(Theater theater);
    Theater updateTheater(Long id, Theater theater);
    void deleteTheater(Long id);
}