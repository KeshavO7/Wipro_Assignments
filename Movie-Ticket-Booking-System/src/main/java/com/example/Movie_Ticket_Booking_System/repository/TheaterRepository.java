package com.example.Movie_Ticket_Booking_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Movie_Ticket_Booking_System.entity.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Long> {
}