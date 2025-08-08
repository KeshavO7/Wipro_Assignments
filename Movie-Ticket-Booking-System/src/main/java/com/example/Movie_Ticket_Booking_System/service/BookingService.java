package com.example.Movie_Ticket_Booking_System.service;

import java.util.List;

import com.example.Movie_Ticket_Booking_System.entity.Booking;

public interface BookingService {
    Booking createBooking(Booking booking);
    Booking getBookingById(Long id);
    List<Booking> getAllBookings();
    Booking updateBooking(Long id, Booking booking);
    void deleteBooking(Long id);
}