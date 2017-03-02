package com.himansu.service;

import java.util.List;

import com.himansu.model.BookingDetails;
import com.himansu.model.HotelDetail;

public interface HotelBookingService {

	public List<String> getCities();

	public List<String> getHotelsByCity(String city);

	public String bookHotel(BookingDetails bookingDetails);

	public List<HotelDetail> getHotelDetailsbyCity(String city);

}
