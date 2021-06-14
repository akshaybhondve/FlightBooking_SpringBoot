package com.flightbooking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="airline") 
public class Airline {
	
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long airline_id;
	
    private String airline_name;  
    
    
    private String airline_logo;
    
    private String airline_contact;
    
    private String airline_address;
    
    
	public Long getAirline_id() {
		return airline_id;
	}
	public void setAirline_id(Long airline_id) {
		this.airline_id = airline_id;
	}
	public String getAirline_name() {
		return airline_name;
	}
	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}
	public String getAirline_contact() {
		return airline_contact;
	}
	public void setAirline_contact(String airline_contact) {
		this.airline_contact = airline_contact;
	}
	public String getAirline_address() {
		return airline_address;
	}
	public void setAirline_address(String airline_address) {
		this.airline_address = airline_address;
	}
	public String getAirline_logo() {
		return airline_logo;
	}
	public void setAirline_logo(String airline_logo) {
		this.airline_logo = airline_logo;
	}

	
    
}
