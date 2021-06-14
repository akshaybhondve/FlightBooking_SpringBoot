package com.flightbooking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightbooking.model.ScheduleFlight;
import com.flightbooking.service.ScheduleFlightService;

@RestController
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api_v1") 
public class ScheduleFlightController {

	@Autowired
    private ScheduleFlightService scheduleService;  	
      
    @PostMapping("save-scheduleflight")  
    public ScheduleFlight saveScheduleFlight(@RequestBody ScheduleFlight schedule) {  
         return scheduleService.saveScheduleFlight(schedule);  
          
    }  
      
    @GetMapping("scheduleflights")
    public List<ScheduleFlight> getAllScheduleFlights() {  
         return scheduleService.getScheduleFlights();  
          
    }
    
    @GetMapping("schedule-{schedule_id}")  
    public Optional< ScheduleFlight> findScheduleFlightByID(@PathVariable("schedule_id") Long schedule_id) {  
        return scheduleService.getScheduleFlightByID(schedule_id);  
          
    }
}
