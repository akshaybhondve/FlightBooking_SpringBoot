package com.flightbooking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightbooking.model.Airline;
import com.flightbooking.service.AirlineService;

@RestController
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api_v1") 
public class AirlinesController {
	
	 	@Autowired
	    private AirlineService airlineService;  
	      
	    @PostMapping("save-airline")  
	    public Airline saveAirline(@RequestBody Airline airline) {  
	         return airlineService.saveAirline(airline);  
	          
	    }  
	      
	    @GetMapping("airlines")  
	    public List<Airline> getAllAirlines() {  
	         return airlineService.getAirlines();  
	          
	    }  
	      
	    @DeleteMapping("delete-airline/{airline_id}")  
	    public void deleteAirline(@PathVariable("airline_id") Long airline_id,Airline airline) {  
	    	airline.setAirline_id(airline_id);  
	        airlineService.deleteAirline(airline);  
	    }  
	  
	    @GetMapping("airline/{airline_id}")  
	    public Optional<Airline> allAirlineByID(@PathVariable("airline_id") Long airline_id,Airline airline) {  
	    	airline.setAirline_id(airline_id);  
	         return airlineService.getAirlineByID(airline_id);  
	          
	    }  
	      
	    @PostMapping("update-airline/{airline_id}")  
	    public Airline updateAirline(@RequestBody Airline airline,@PathVariable("airline_id") Long airline_id) {  
	    	airline.setAirline_id(airline_id);  
	        return airlineService.updateAirline(airline);  
	    }  

}
