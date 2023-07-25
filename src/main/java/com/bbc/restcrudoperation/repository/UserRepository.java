package com.bbc.restcrudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bbc.restcrudoperation.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
