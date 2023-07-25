package com.bbc.restcrudoperation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bbc.restcrudoperation.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // You can add custom query methods here if needed
	Product findByName(String name);
	
	
	//search product by name
	@Query("Select p from Product p where p.name LIKE %:query%")
    List<Product> searchProducts(String query);
}
