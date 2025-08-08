package com.example.booking_service.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.booking_service.entity.Booking;
import com.example.booking_service.repository.BookingRepository;
import com.example.booking_service.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking getBookingById(Long id) {
        return bookingRepository.findById(id).orElse(null);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking updateBooking(Long id, Booking updatedBooking) {
        Optional<Booking> existingBookingOpt = bookingRepository.findById(id);
        if (existingBookingOpt.isPresent()) {
            Booking existingBooking = existingBookingOpt.get();
            existingBooking.setBookingDate(updatedBooking.getBookingDate());
            existingBooking.setSeats(updatedBooking.getSeats());
            existingBooking.setMovieId(updatedBooking.getMovieId());
            existingBooking.setTheaterId(updatedBooking.getTheaterId());
            existingBooking.setCustomerId(updatedBooking.getCustomerId());
            return bookingRepository.save(existingBooking);
        } else {
            return null;
        }
    }

    @Override
    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }
}
