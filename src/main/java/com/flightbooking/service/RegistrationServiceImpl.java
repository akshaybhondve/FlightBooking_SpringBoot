package com.flightbooking.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbooking.dao.RegistrationDao;
import com.flightbooking.model.User;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	private RegistrationDao registrationDao;
	
	@Override
	public User saveUser(User user) {
		return registrationDao.save(user);
	}
	
	@Override
	public User fetchUserByEmailId(String email) {
		return registrationDao.findByEmail(email);
	}

	@Override
	public User fetchUserByEmailAndPassword(String email, String password) {
		return registrationDao.findByEmailAndPassword(email,password);
	}
}
