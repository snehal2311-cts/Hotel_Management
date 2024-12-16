package com.cts.Hotel_Management.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BookingDTO {
	
	private Long id;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	private int numOfAdults;
	private int numOfChildren;
	private int totalNumOfGuest;
	private String bookingConfirmationCode;
	private RoomDTO room;
	private UserDTO user;
	

}
