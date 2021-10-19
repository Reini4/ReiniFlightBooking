package com.mtbademo.dao;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import com.mtbademo.entities.Users;

public interface UserRepository extends CrudRepository<Users, BigInteger>{
}


