package com.flightbooking.service;

import java.util.List;
import java.util.Optional;

import com.flightbooking.model.Flight;

public interface FlightService {

	public Flight saveFlight(Flight ticket);
    public List<Flight> getFlights();
    public Optional<Flight> getFlightByID(Long id);
}
