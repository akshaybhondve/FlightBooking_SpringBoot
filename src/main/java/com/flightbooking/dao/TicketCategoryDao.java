package com.flightbooking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.flightbooking.model.TicketCategory;

public interface TicketCategoryDao extends JpaRepository<TicketCategory, Long> {

	@Query("from TicketCategory tc where tc.airline_name = ?1")
	List<TicketCategory> getTicketPricesByAirlineName(String airlineName);

}
