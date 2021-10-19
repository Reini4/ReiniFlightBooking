package com.mtbademo.services;

import java.math.BigInteger;
import org.springframework.http.ResponseEntity;
import com.mtbademo.entities.Users;

public interface UserService {

	public ResponseEntity<Users> createUser(Users newUser);
	public Users updateUser(Users newUser);
	public String deleteUser(BigInteger UserId);
	public Iterable<Users> displayAllUser();
	public ResponseEntity<Users> findUserById(BigInteger userId);
}