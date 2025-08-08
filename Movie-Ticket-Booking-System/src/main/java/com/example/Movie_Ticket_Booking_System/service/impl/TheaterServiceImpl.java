package com.example.Movie_Ticket_Booking_System.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movie_Ticket_Booking_System.entity.Theater;
import com.example.Movie_Ticket_Booking_System.repository.TheaterRepository;
import com.example.Movie_Ticket_Booking_System.service.TheaterService;

@Service
public class TheaterServiceImpl implements TheaterService {

    @Autowired
    private TheaterRepository theaterRepository;

    @Override
    public List<Theater> getAllTheaters() {
        return theaterRepository.findAll();
    }

    @Override
    public Theater getTheaterById(Long id) {
        return theaterRepository.findById(id).orElse(null);
    }

    @Override
    public Theater createTheater(Theater theater) {
        return theaterRepository.save(theater);
    }

    @Override
    public Theater updateTheater(Long id, Theater updated) {
        Theater theater = theaterRepository.findById(id).orElse(null);
        if (theater != null) {
            theater.setName(updated.getName());
            theater.setLocation(updated.getLocation());
            return theaterRepository.save(theater);
        }
        return null;
    }

    @Override
    public void deleteTheater(Long id) {
        theaterRepository.deleteById(id);
    }
}
