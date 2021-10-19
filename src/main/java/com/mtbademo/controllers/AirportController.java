package com.mtbademo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtbademo.exception.RecordAlreadyPresentException;
import com.mtbademo.exception.RecordNotFoundException;
import com.mtbademo.entities.Airport;
import com.mtbademo.services.AirportService;

@RestController
@RequestMapping("/flight")
public class AirportController {
	@Autowired(required = true)
	AirportService airportService;

	@GetMapping("/airline/viewAirport/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public Airport viewAirport(@PathVariable("id") String airportCode) {
		return airportService.viewAirport(airportCode);
	}

	@GetMapping("/airline/allAirport")
	public Iterable<Airport> viewAllAirport() {
		return airportService.viewAllAirport();
	}

	@PostMapping("/airline/addAirport")
	@ExceptionHandler(RecordAlreadyPresentException.class)
	public ResponseEntity<Airport> addAirport(@RequestBody Airport airport) {
		return airportService.addAirport(airport);
	}

	@PutMapping("/airline/updateAirport")
	@ExceptionHandler(RecordNotFoundException.class)
	public void modifyAirport(@RequestBody Airport airport) {
		airportService.modifyAirport(airport);
	}

	@DeleteMapping("/airline/deleteAirport/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public void removeAirport(@PathVariable("id") String airportCode) {
		airportService.removeAirport(airportCode);
	}
}
