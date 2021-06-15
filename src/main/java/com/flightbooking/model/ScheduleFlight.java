package com.flightbooking.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="schedule_flight")
public class ScheduleFlight {


	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long schedule_id;

	private String airline_name;
    
    private Long flight_id;
    
    private String from_location;
    
    private String to_location;
    
    private String fligh_date;  
    
    private String flight_time;
    
    private Integer no_of_businessseat;
    
    private Integer no_of_firstseat;
    
    private Integer no_of_economyseat;

	public Long getSchedule_id() {
		return schedule_id;
	}

	public void setSchedule_id(Long schedule_id) {
		this.schedule_id = schedule_id;
	}

	public String getAirline_name() {
		return airline_name;
	}

	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}

	public Long getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(Long flight_id) {
		this.flight_id = flight_id;
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

	public String getFligh_date() {
		return fligh_date;
	}

	public void setFligh_date(String fligh_date) {
		this.fligh_date = fligh_date;
	}

	public String getFlight_time() {
		return flight_time;
	}

	public void setFlight_time(String flight_time) {
		this.flight_time = flight_time;
	}

	public Integer getNo_of_businessseat() {
		return no_of_businessseat;
	}

	public void setNo_of_businessseat(Integer no_of_businessseat) {
		this.no_of_businessseat = no_of_businessseat;
	}

	public Integer getNo_of_firstseat() {
		return no_of_firstseat;
	}

	public void setNo_of_firstseat(Integer no_of_firstseat) {
		this.no_of_firstseat = no_of_firstseat;
	}

	public Integer getNo_of_economyseat() {
		return no_of_economyseat;
	}

	public void setNo_of_economyseat(Integer no_of_economyseat) {
		this.no_of_economyseat = no_of_economyseat;
	}
    
    
    
}
