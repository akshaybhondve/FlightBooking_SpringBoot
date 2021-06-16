package com.flightbooking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightbooking.model.ScheduleFlight;

public interface ScheduleFlightDao extends JpaRepository<ScheduleFlight, Long>{

	List<ScheduleFlight> findByFromLocationAndToLocation(String fromLocation, String toLocation);

}
