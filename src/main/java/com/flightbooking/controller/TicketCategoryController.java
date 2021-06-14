package com.flightbooking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightbooking.model.Discount;
import com.flightbooking.model.TicketCategory;
import com.flightbooking.service.TicketCategoryService;

@RestController
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api_v1/ticket")
public class TicketCategoryController {

	@Autowired
    private TicketCategoryService categoryService;  	
	
	@PostMapping("save-ticketcategory")  
    public TicketCategory saveTicketCategory(@RequestBody TicketCategory ticket) {  
         return categoryService.saveTicketCategory(ticket);  
          
    }
	
	@GetMapping("ticket-categorys")
    public List<TicketCategory> getAllTicketCategories() {  
         return categoryService.getTicketCategories();  
          
    }
    
    @GetMapping("ticket-{ticket_category_id}")  
    public Optional<TicketCategory> findTicketCategoryByID(@PathVariable("ticket_category_id") Long ticket_category_id) {  
        return categoryService.getTicketCategoryByTicketCategoryID(ticket_category_id);  
          
    }
	
}
