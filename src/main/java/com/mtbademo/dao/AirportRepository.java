package com.mtbademo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.mtbademo.entities.Airport;

@Repository
public interface AirportRepository extends CrudRepository<Airport, String> {

}

