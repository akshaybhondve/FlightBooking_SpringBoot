package com.flightbooking.service;

import com.flightbooking.model.User;


public interface RegistrationService {

	public User saveUser(User user);
	public User fetchUserByEmailId(String email);
	public User fetchUserByEmailAndPassword(String email, String validPassword);
}
