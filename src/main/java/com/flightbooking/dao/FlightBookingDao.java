package com.flightbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightbooking.model.FlightBooking;

public interface FlightBookingDao extends JpaRepository<FlightBooking, Long> {
	

}
