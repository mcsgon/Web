package com.webservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {

    
} 
    

