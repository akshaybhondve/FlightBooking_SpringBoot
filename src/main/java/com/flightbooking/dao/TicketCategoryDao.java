package com.flightbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightbooking.model.TicketCategory;

public interface TicketCategoryDao extends JpaRepository<TicketCategory, Long> {

}
