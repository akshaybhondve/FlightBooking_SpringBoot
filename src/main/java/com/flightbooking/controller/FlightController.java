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

import com.flightbooking.model.Flight;
import com.flightbooking.service.FlightService;

@RestController
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api_v1") 
public class FlightController {

	@Autowired
    private FlightService flightService;  	
      
    @PostMapping("save-flight")  
    public Flight saveFlight(@RequestBody Flight flight) {  
         return flightService.saveFlight(flight);  
          
    }  
      
    @GetMapping("flights")
    public List<Flight> getAllFlights() {  
         return flightService.getFlights();  
          
    }
    
    @GetMapping("flight-{flight_id}")  
    public Optional< Flight> findFlightByID(@PathVariable("flight_id") Long flight_id) {  
        return flightService.getFlightByID(flight_id);  
          
    }
}
