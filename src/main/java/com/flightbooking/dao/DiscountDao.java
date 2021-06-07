package com.flightbooking.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flightbooking.model.Discount;

@Repository
public interface DiscountDao extends JpaRepository<Discount, Long> {

	
	@Query("from Discount d where d.discount_code = ?1")
	public Optional<Discount> findDiscountByCode(String code);

}
