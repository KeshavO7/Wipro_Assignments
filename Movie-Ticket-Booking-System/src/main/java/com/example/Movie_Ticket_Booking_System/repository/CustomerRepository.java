package com.example.Movie_Ticket_Booking_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Movie_Ticket_Booking_System.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}