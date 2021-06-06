package com.flightbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightbooking.model.Discount;

public interface DiscountDao   extends JpaRepository<Discount, Long> {

}
