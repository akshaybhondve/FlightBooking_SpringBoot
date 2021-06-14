package com.flightbooking.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbooking.dao.ScheduleFlightDao;
import com.flightbooking.model.ScheduleFlight;

@Service
@Transactional
public class ScheduleFlightServiceImpl implements ScheduleFlightService{

	@Autowired
    private ScheduleFlightDao flightDao;  
      
    @Override  
    public ScheduleFlight saveScheduleFlight(ScheduleFlight schedule) {  
        return flightDao.save(schedule);
    }

	@Override
	public List<ScheduleFlight> getScheduleFlights() {
		return flightDao.findAll();  
	}

	@Override
	public Optional<ScheduleFlight> getScheduleFlightByID(Long id) {
		return flightDao.findById(id);  
	}
}
