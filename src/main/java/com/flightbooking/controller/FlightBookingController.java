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

import com.flightbooking.model.Discount;
import com.flightbooking.model.FlightBooking;
import com.flightbooking.model.ScheduleFlight;
import com.flightbooking.service.FlightBookingService;
import com.flightbooking.service.ScheduleFlightService;

@RestController
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api_v1")
public class FlightBookingController {

	@Autowired
    private FlightBookingService flightBookingService; 
	
	@Autowired
    private ScheduleFlightService scheduleFlightService;
      
    @PostMapping("save-booking")  
    public FlightBooking saveFlightBooking(@RequestBody FlightBooking booking) {  
         return flightBookingService.saveFlightBooking(booking);
    }
    
    @GetMapping("from_location-{from_location}/to_location-{to_location}")  
    public List<ScheduleFlight> getScheduledFlightsByLocation(@PathVariable("from_location") String from_location,@PathVariable("to_location") String to_location) {  
        return scheduleFlightService.getScheduledFlightsByLocation(from_location,to_location);  
          
    }
      
    @GetMapping("bookings")  
    public List<FlightBooking> getAllFlightBookings() {  
         return flightBookingService.getFlightBookings();  
          
    }  
      
    @DeleteMapping("delete-booking/{booking_id}")  
    public void deleteFlightBooking(@PathVariable("booking_id") Long booking_id,FlightBooking booking) {  
    	booking.setFlightbooking_id(booking_id);  
    	flightBookingService.deleteFlightBooking(booking);  
    }  
  
    @GetMapping("booking/{booking_id}")  
    public Optional<FlightBooking> allFlightBookingByID(@PathVariable("booking_id") Long booking_id,FlightBooking booking) {  
    	booking.setFlightbooking_id(booking_id);  
        return flightBookingService.getFlightBookingByID(booking_id);  
          
    }  
      
    @PostMapping("update-booking/{booking_id}")  
    public FlightBooking updateFlightBooking(@RequestBody FlightBooking booking,@PathVariable("booking_id") Long booking_id) {  
    	booking.setFlightbooking_id(booking_id);  
        return flightBookingService.updateFlightBooking(booking);  
    }  
}
