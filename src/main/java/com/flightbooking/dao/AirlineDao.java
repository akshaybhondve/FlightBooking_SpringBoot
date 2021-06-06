package com.flightbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightbooking.model.Airline;

public interface AirlineDao  extends JpaRepository<Airline, Long> {

}
