package com.mtbademo.services;

import java.math.BigInteger;
import com.mtbademo.exception.RecordNotFoundException;
import com.mtbademo.exception.ScheduledFlightNotFoundException;
import com.mtbademo.entities.ScheduledFlight;

public interface ScheduledFlightService {
	public ScheduledFlight addScheduledFlight(ScheduledFlight scheduledFlight);
	public ScheduledFlight modifyScheduledFlight(ScheduledFlight scheduledFlight);
	public String removeScheduledFlight(BigInteger id) throws RecordNotFoundException;
	public Iterable<ScheduledFlight> viewAllScheduledFlights();
	public ScheduledFlight viewScheduledFlight(BigInteger id) throws ScheduledFlightNotFoundException;
	

}
