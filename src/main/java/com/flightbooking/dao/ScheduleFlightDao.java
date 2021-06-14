package com.flightbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightbooking.model.ScheduleFlight;

public interface ScheduleFlightDao extends JpaRepository<ScheduleFlight, Long>{

}
