package com.skillstorm.telecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.telecom.beans.User;
import com.skillstorm.telecom.services.UserService;

@RestController  
@RequestMapping("telecom/v1") // take in http requests to /movies/v1
// IMPLEMENT CROSS ORIGIN ACCESS WHEN ANGULAR APP IS DEPLOYED
public class UserController {
	
	
	@Autowired
	UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		
		List<User> allUsers = service.findAll();
		
		return new ResponseEntity<>(allUsers, HttpStatus.OK);
	}
	
	@PostMapping("user")
	public ResponseEntity<User> save(@RequestBody User user) {
		
		User newUser = service.save(user);
		
		return new ResponseEntity<User>(newUser, HttpStatus.CREATED);
	}
}
