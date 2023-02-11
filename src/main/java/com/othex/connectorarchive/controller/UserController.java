package com.othex.connectorarchive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.othex.connectorarchive.model.User;
import com.othex.connectorarchive.repository.UserRepository;

@RestController("api/users")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("all")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

}