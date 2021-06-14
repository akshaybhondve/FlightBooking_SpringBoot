package com.flightbooking.service;

import java.util.List;
import java.util.Optional;

import com.flightbooking.model.ScheduleFlight;

public interface ScheduleFlightService {

	public ScheduleFlight saveScheduleFlight(ScheduleFlight schedule);
    public List<ScheduleFlight> getScheduleFlights();
    public Optional<ScheduleFlight> getScheduleFlightByID(Long id);
}
