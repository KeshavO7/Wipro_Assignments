package com.example.Movie_Ticket_Booking_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Movie_Ticket_Booking_System.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
