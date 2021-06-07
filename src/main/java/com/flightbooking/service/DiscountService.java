package com.flightbooking.service;

import java.util.List;
import java.util.Optional;

import com.flightbooking.model.Discount;

public interface DiscountService {

	public Discount saveDiscount(Discount airline);  
    public List<Discount> getDiscounts();
    public Optional<Discount> getDiscountByCode(String discount_code);
}
