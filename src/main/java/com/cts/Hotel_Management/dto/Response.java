package com.cts.Hotel_Management.dto;

import java.util.List;

import lombok.Data;

@Data
public class Response {
	
	private int statusCode;
	private String message;
	private String token;
	private String role;
	private String expirationTime;
	private String bookinConfirmationCode;
	private UserDTO user;
	private RoomDTO room;
	private BookingDTO booking;
	private List<UserDTO> userList;
	private List<RoomDTO> roomList;
	private List<BookingDTO> bookingList;
}
