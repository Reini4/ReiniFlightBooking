package com.mtbademo.dao;


import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mtbademo.entities.Flight;
@Repository
public interface FlightRepository extends CrudRepository<Flight,BigInteger>{

}
