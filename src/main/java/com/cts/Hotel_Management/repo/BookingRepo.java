package com.cts.Hotel_Management.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.Hotel_Management.entity.Booking;

public interface BookingRepo extends JpaRepository<Booking, Long>{

}
