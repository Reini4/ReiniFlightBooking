package com.mtbademo.services;

import org.springframework.http.ResponseEntity;

import com.mtbademo.entities.Airport;

public interface AirportService {
	public Iterable<Airport> viewAllAirport();
	public Airport viewAirport(String airportCode);
	public ResponseEntity<Airport> addAirport(Airport airport);
	public Airport modifyAirport(Airport airport);
	public String removeAirport(String airportCode);
}
