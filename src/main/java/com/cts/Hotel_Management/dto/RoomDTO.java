package com.cts.Hotel_Management.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class RoomDTO {
 private Long id;
 private String roomType;
 private BigDecimal roomPrice;
 private String roomPhotoUrl;
 private String roomDesc;
 private List<BookingDTO> bookings=new ArrayList<>();
 
}
