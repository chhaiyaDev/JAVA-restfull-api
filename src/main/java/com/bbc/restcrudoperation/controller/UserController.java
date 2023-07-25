package com.bbc.restcrudoperation.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbc.restcrudoperation.model.User;
import com.bbc.restcrudoperation.service.ApiResponse;
import com.bbc.restcrudoperation.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private final UserService userService; 
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
    	
        User user =  userService.getUserById(id);
        if(user!=null) {
        	return ResponseEntity.ok(user);
        }
        
        ApiResponse response = new ApiResponse("404","User not found");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        
    }

}
