package com.flightbooking.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbooking.dao.AirlineDao;
import com.flightbooking.model.Airline;

@Service
@Transactional
public class AirlineServiceImpl implements AirlineService{
	
	@Autowired
    private AirlineDao airlineDao;  
      
    @Override  
    public Airline saveAirline(Airline airline) {  
        return airlineDao.save(airline);  
    }  
  
    @Override  
    public List<Airline> getAirlines() {  
        return airlineDao.findAll();  
    }  
  
    @Override  
    public void deleteAirline(Airline airline) {  
        airlineDao.delete(airline);  
    }  
  
    @Override  
    public Optional<Airline> getAirlineByID(Long airline_id) {  
        return airlineDao.findById(airline_id);  
    }  
  
    @Override  
    public Airline updateAirline(Airline airline) {  
        return airlineDao.save(airline);  
    }
}
