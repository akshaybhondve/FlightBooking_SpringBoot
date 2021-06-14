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

	private Long airline_id;
    
    private String flight_id;
    
    @Temporal(TemporalType.DATE)
    private Date schedule_date;  
    
    private String schedule_time;

	public Long getSchedule_id() {
		return schedule_id;
	}

	public void setSchedule_id(Long schedule_id) {
		this.schedule_id = schedule_id;
	}

	public Long getAirline_id() {
		return airline_id;
	}

	public void setAirline_id(Long airline_id) {
		this.airline_id = airline_id;
	}

	public String getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(String flight_id) {
		this.flight_id = flight_id;
	}

	public Date getSchedule_date() {
		return schedule_date;
	}

	public void setSchedule_date(Date schedule_date) {
		this.schedule_date = schedule_date;
	}

	public String getSchedule_time() {
		return schedule_time;
	}

	public void setSchedule_time(String schedule_time) {
		this.schedule_time = schedule_time;
	}

	@Override
	public String toString() {
		return "ScheduleFlight [schedule_id=" + schedule_id + ", airline_id=" + airline_id + ", flight_id=" + flight_id
				+ ", schedule_date=" + schedule_date + ", schedule_time=" + schedule_time + "]";
	}
    
    
}
