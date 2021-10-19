package com.mtbademo.dao;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mtbademo.entities.Booking;

@Repository
public interface BookingRepository extends CrudRepository<Booking, BigInteger> {

}
