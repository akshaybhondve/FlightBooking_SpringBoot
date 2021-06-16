package com.flightbooking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight_booking")
public class FlightBooking implements Serializable{
	
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long flightbooking_id;
	
    private String flight_type;
    
    @Column(name="from_location")
    private String from_location;
    
    @Column(name="to_location")
    private String to_location;
    private Long return_flight_rate;
    private Long onward_flight_rate;
    private Long onward_scheduled_flight;
    private Long return_scheduled_flight;
    private String onward_meal;
    private String return_meal;    
    private String discount;
    private String onward_seat;
    private String return_seat;
    private Long final_flight_rate;
    
    public Long getFlightbooking_id() {
		return flightbooking_id;
	}


	public void setFlightbooking_id(Long flightbooking_id) {
		this.flightbooking_id = flightbooking_id;
	}


	public String getFlight_type() {
		return flight_type;
	}


	public void setFlight_type(String flight_type) {
		this.flight_type = flight_type;
	}


	public String getFrom_location() {
		return from_location;
	}


	public void setFrom_location(String from_location) {
		this.from_location = from_location;
	}


	public String getTo_location() {
		return to_location;
	}


	public void setTo_location(String to_location) {
		this.to_location = to_location;
	}


	public Long getOnward_scheduled_flight() {
		return onward_scheduled_flight;
	}


	public void setOnward_scheduled_flight(Long onward_scheduled_flight) {
		this.onward_scheduled_flight = onward_scheduled_flight;
	}


	public Long getReturn_scheduled_flight() {
		return return_scheduled_flight;
	}


	public void setReturn_scheduled_flight(Long return_scheduled_flight) {
		this.return_scheduled_flight = return_scheduled_flight;
	}


	public Long getReturn_flight_rate() {
		return return_flight_rate;
	}


	public void setReturn_flight_rate(Long return_flight_rate) {
		this.return_flight_rate = return_flight_rate;
	}


	public Long getOnward_flight_rate() {
		return onward_flight_rate;
	}


	public void setOnward_flight_rate(Long onward_flight_rate) {
		this.onward_flight_rate = onward_flight_rate;
	}


	public String getOnward_meal() {
		return onward_meal;
	}


	public void setOnward_meal(String onward_meal) {
		this.onward_meal = onward_meal;
	}


	public String getReturn_meal() {
		return return_meal;
	}


	public void setReturn_meal(String return_meal) {
		this.return_meal = return_meal;
	}


	public String getDiscount() {
		return discount;
	}


	public void setDiscount(String discount) {
		this.discount = discount;
	}


	public String getOnward_seat() {
		return onward_seat;
	}


	public void setOnward_seat(String onward_seat) {
		this.onward_seat = onward_seat;
	}


	public String getReturn_seat() {
		return return_seat;
	}


	public void setReturn_seat(String return_seat) {
		this.return_seat = return_seat;
	}


	public Long getFinal_flight_rate() {
		return final_flight_rate;
	}


	public void setFinal_flight_rate(Long final_flight_rate) {
		this.final_flight_rate = final_flight_rate;
	}


	
    

    
}
