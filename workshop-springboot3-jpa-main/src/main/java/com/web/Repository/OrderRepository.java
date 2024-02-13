package com.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.entities.Order;


public interface OrderRepository extends JpaRepository <Order, Long> {

    
} 