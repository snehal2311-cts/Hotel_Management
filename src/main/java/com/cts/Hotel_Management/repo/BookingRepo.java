package com.cts.Hotel_Management.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.Hotel_Management.entity.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Long>{

	
	List<Booking> findByRoomId(Long roomId); 
	
	List<Booking> findByBookingConfirmationCode(String ConfirmationCode);
	
	List<Booking> findByUserId(Long userId);
}
