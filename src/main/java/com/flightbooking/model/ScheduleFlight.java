package com.flightbooking.model;


import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="schedule_flight")
public class ScheduleFlight {


	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long schedule_id;

	private String airline_name;
    
    private Long flight_id;
    
    @Column(name="from_location")
    private String fromLocation;
    
    @Column(name="to_location")
    private String toLocation;
    
    private LocalDate flight_date;  
    
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

	
	public LocalDate getFlight_date() {
		return flight_date;
	}

	public void setFlight_date(LocalDate flight_date) {
		this.flight_date = flight_date;
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

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
    
    
    
}
