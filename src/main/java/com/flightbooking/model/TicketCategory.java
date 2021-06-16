package com.flightbooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket_category")
public class TicketCategory {
	

	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long ticket_category_id;

	private String airline_name;
    
    private String ticket_type;
    
    private Long ticket_price;

	public Long getTicket_category_id() {
		return ticket_category_id;
	}

	public void setTicket_category_id(Long ticket_category_id) {
		this.ticket_category_id = ticket_category_id;
	}

	public String getAirline_name() {
		return airline_name;
	}

	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}

	public String getTicket_type() {
		return ticket_type;
	}

	public void setTicket_type(String ticket_type) {
		this.ticket_type = ticket_type;
	}

	public Long getTicket_price() {
		return ticket_price;
	}

	public void setTicket_price(Long ticket_price) {
		this.ticket_price = ticket_price;
	}

}
