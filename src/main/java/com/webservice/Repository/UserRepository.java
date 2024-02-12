package com.webservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.webservice.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {

    
} 
    

