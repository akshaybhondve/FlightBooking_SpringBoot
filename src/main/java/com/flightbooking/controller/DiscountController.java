package com.flightbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightbooking.model.Discount;
import com.flightbooking.service.DiscountService;

@RestController
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api_v1") 
public class DiscountController {

	@Autowired
    private DiscountService discountService;  	
      
    @PostMapping("save-discount")  
    public Discount saveDiscount(@RequestBody Discount discount) {  
         return discountService.saveDiscount(discount);  
          
    }  
      
    @GetMapping("discounts")  
    public List<Discount> getAllDiscounts() {  
         return discountService.getDiscounts();  
          
    }
}
