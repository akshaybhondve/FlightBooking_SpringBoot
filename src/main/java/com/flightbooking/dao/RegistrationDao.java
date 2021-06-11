package com.flightbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.flightbooking.model.User;

public interface RegistrationDao extends JpaRepository<User, Integer>{
	
	public User findByEmail(String email);
	public User findByEmailAndPassword(String email, String password);
}
