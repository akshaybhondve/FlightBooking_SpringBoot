package com.flightbooking.service;

import java.util.List;

import com.flightbooking.model.Discount;

public interface DiscountService {

	public Discount saveDiscount(Discount airline);  
    public List<Discount> getDiscounts();
}
