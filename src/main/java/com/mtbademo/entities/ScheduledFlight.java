package com.mtbademo.entities;
import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ScheduledFlight {

	@Id
	@Column(name = "schedule_flight_id")
	private BigInteger scheduleFlightId;

	@OneToOne(fetch = FetchType.EAGER)
	
	private Flight flight;

	@Column(name = "available_seats")

	private Integer availableSeats;

	@OneToOne(cascade = CascadeType.ALL)
	private Schedule schedule;
	public ScheduledFlight() {

	}

	public ScheduledFlight(BigInteger scheduleFlightId, com.mtbademo.entities.Flight flight, Integer availableSeats,
			Schedule schedule) {
		super();
		this.scheduleFlightId = scheduleFlightId;
		this.flight = flight;
		this.availableSeats = availableSeats;
		this.schedule = schedule;
	}

	public BigInteger getScheduleFlightId() {
		return scheduleFlightId;
	}

	public void setScheduleFlightId(BigInteger scheduleFlightId) {
		this.scheduleFlightId = scheduleFlightId;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "ScheduledFlight [scheduleFlightId=" + scheduleFlightId + ", flight=" + flight + ", availableSeats="
				+ availableSeats + ", schedule=" + schedule + "]";
	}
}

