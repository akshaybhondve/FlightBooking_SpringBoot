package com.flightbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flightbooking.model.User;
import com.flightbooking.service.RegistrationService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;
	
	@PostMapping("/registration")
	public User getRegistration(@RequestBody User user) throws Exception {
		String checkEmailID = user.getEmail();
		if(checkEmailID != null && !"".equals(checkEmailID)) {
			User checkUser = registrationService.fetchUserByEmailId(checkEmailID);
			if(checkUser!=null) {
				throw new Exception("user with "+checkEmailID+" already exist");
			}
		}
		User userObj = null; 
		userObj = registrationService.saveUser(user);
		return userObj;
	}
	
	@GetMapping("/register-{email}")
	public User getUserByEmail(@PathVariable("email") String email) throws Exception {
		User checkUser = registrationService.fetchUserByEmailId(email);
		return checkUser;
	}
	
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		String validEmail = user.getEmail();
		String validPassword = user.getPassword();
		
		User userObj = null;
		if((validEmail != null && !"".equals(validEmail)) && (validPassword !=null && !"".equals(validPassword))) {
			userObj = registrationService.fetchUserByEmailAndPassword(validEmail,validPassword);
		}
		if(userObj==null) {
			throw new Exception("bad credentials...");
		}
		return userObj;
	}
	
}
