package com.skillstorm.telecom.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.telecom.beans.User;
import com.skillstorm.telecom.data.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User save(User user) {
		return repo.save(user);
	}
	
}
