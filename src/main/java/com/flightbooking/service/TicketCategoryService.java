package com.flightbooking.service;

import java.util.List;
import java.util.Optional;

import com.flightbooking.model.TicketCategory;

public interface TicketCategoryService {

	public TicketCategory saveTicketCategory(TicketCategory ticket);
    public List<TicketCategory> getTicketCategories();
    public Optional<TicketCategory> getTicketCategoryByTicketCategoryID(Long TicketCategoryID);
}

