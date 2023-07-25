package com.bbc.restcrudoperation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bbc.restcrudoperation.model.User;
import com.bbc.restcrudoperation.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}

	public User getUserById(Long id) {
		return userRepository.findById(id).orElse(null);
	}

}
