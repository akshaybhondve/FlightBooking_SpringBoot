package com.flightbooking.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbooking.dao.FlightBookingDao;
import com.flightbooking.model.FlightBooking;

@Service
@Transactional
public class FlightBookingServiceImpl implements FlightBookingService{

	@Autowired	
    private FlightBookingDao flightBookingDao;  
      
    @Override  
    public FlightBooking saveFlightBooking(FlightBooking flightBooking) {  
        return flightBookingDao.save(flightBooking);  
    }  
  
    @Override  
    public List<FlightBooking> getFlightBookings() {  
        return flightBookingDao.findAll();  
    }  
  
    @Override  
    public void deleteFlightBooking(FlightBooking flightBooking) {  
    	flightBookingDao.delete(flightBooking);  
    }  
  
    @Override  
    public Optional<FlightBooking> getFlightBookingByID(Long flightBooking_id) {  
        return flightBookingDao.findById(flightBooking_id);  
    }  
  
    @Override  
    public FlightBooking updateFlightBooking(FlightBooking flightBooking) {  
        return flightBookingDao.save(flightBooking);  
    }
}
