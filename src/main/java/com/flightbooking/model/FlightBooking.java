package com.flightbooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight_booking")
public class FlightBooking {
	
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long flightbooking_id;
	
    private String flight_type;
    private String from_location;
    private String to_location;
    private String onward_journey_date;
    private String return_journey_date;
    private String return_flight_rate;
    private String onward_flight_rate;
    private String onward_meal;
    private String return_meal;    
    private String discount;
    private String onward_seat;
    private String return_seat;
    private String final_flight_rate;
    
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
	public String getOnward_journey_date() {
		return onward_journey_date;
	}
	public void setOnward_journey_date(String onward_journey_date) {
		this.onward_journey_date = onward_journey_date;
	}
	public String getReturn_journey_date() {
		return return_journey_date;
	}
	public void setReturn_journey_date(String return_journey_date) {
		this.return_journey_date = return_journey_date;
	}
	public String getReturn_flight_rate() {
		return return_flight_rate;
	}
	public void setReturn_flight_rate(String return_flight_rate) {
		this.return_flight_rate = return_flight_rate;
	}
	public String getOnward_flight_rate() {
		return onward_flight_rate;
	}
	public void setOnward_flight_rate(String onward_flight_rate) {
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
	public String getFinal_flight_rate() {
		return final_flight_rate;
	}
	public void setFinal_flight_rate(String final_flight_rate) {
		this.final_flight_rate = final_flight_rate;
	}
	
	@Override
	public String toString() {
		return "FlightBooking [flightbooking_id=" + flightbooking_id + ", flight_type=" + flight_type
				+ ", from_location=" + from_location + ", to_location=" + to_location + ", onward_journey_date="
				+ onward_journey_date + ", return_journey_date=" + return_journey_date + ", return_flight_rate="
				+ return_flight_rate + ", onward_flight_rate=" + onward_flight_rate + ", onward_meal=" + onward_meal
				+ ", return_meal=" + return_meal + ", discount=" + discount + ", onward_seat=" + onward_seat
				+ ", return_seat=" + return_seat + ", final_flight_rate=" + final_flight_rate + "]";
	}
    
}
