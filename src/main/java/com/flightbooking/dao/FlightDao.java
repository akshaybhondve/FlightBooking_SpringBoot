package com.flightbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightbooking.model.Flight;

public interface FlightDao extends JpaRepository<Flight, Long>{

}
