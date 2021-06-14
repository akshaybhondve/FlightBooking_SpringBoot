package com.flightbooking.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbooking.dao.TicketCategoryDao;
import com.flightbooking.model.Discount;
import com.flightbooking.model.TicketCategory;

@Service
@Transactional
public class TicketCategoryServiceImpl implements TicketCategoryService{

	@Autowired
    private TicketCategoryDao ticketCategoryDao;  
      
    @Override  
    public TicketCategory saveTicketCategory(TicketCategory ticket) {  
        return ticketCategoryDao.save(ticket);
    }

	@Override
	public List<TicketCategory> getTicketCategories() {
		return ticketCategoryDao.findAll();  
	}

	@Override
	public Optional<TicketCategory> getTicketCategoryByTicketCategoryID(Long TicketCategoryID) {
		return ticketCategoryDao.findById(TicketCategoryID);  
	}

	 
}
