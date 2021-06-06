package com.flightbooking.service;

import java.util.List;
import java.util.Optional;
import com.flightbooking.model.FlightBooking;

public interface FlightBookingService {
	
	public FlightBooking saveFlightBooking(FlightBooking booking);
    public List<FlightBooking> getFlightBookings();  
    public void deleteFlightBooking(FlightBooking flightBooking);  
    public Optional<FlightBooking> getFlightBookingByID(Long flightBooking_id);  
    public FlightBooking updateFlightBooking(FlightBooking flightBooking);  
}
