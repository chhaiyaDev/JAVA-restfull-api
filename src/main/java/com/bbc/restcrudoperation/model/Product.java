package com.bbc.restcrudoperation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private double price;
	    
		// getter method
	    public String getName() {
	    	return name;
	    }
	    
	    public double getPrice() {
	    	return price;
	    }
	    
	    public Long getId() {
	    	return id;
	    }
	    
	    // setter method
	    public void setName(String name) {
	    	this.name = name;
	    }
	    
	    public void setPrice(double price) {
	    	this.price = price;
	    }
	    
	    public void setId(Long id) {
	    	this.id = id;
	    }
		
}
