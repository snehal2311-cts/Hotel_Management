package com.cts.Hotel_Management.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

	private Long id;
	private String email;
	private String phnNumber;
	private String role;
	private List<BookingDTO> bookings=new ArrayList<>(); 
	
}
