package com.flightbooking.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbooking.dao.FlightDao;
import com.flightbooking.model.Flight;

@Service
@Transactional
public class FlightServiceImpl implements FlightService{

	@Autowired
    private FlightDao flightDao;  
      
    @Override  
    public Flight saveFlight(Flight ticket) {  
        return flightDao.save(ticket);
    }

	@Override
	public List<Flight> getFlights() {
		return flightDao.findAll();  
	}

	@Override
	public Optional<Flight> getFlightByID(Long TicketCategoryID) {
		return flightDao.findById(TicketCategoryID);  
	}

}
