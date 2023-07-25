package com.bbc.restcrudoperation.service;

public class ApiResponse {
	
	private String status;
	private String message;
	
	public ApiResponse(String status,String message) {
		this.status = status;
		this.message = message;
	}
	
	// setter method
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	// getter method
	public String getStatus() {
		return status;
	}
	
	public String getMessage() {
		return message;
	}
}
