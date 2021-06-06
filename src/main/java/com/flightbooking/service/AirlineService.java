package com.flightbooking.service;

import com.flightbooking.model.Airline;
import java.util.List;
import java.util.Optional;

public interface AirlineService {
	
	public Airline saveAirline(Airline airline);  
    public List<Airline> getAirlines();  
    public void deleteAirline(Airline airline);  
    public Optional<Airline> getAirlineByID(Long airline_id);  
    public Airline updateAirline(Airline airline);  

}
