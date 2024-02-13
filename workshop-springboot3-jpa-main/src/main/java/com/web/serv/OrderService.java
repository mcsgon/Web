package com.web.serv;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.Repository.OrderRepository;
import com.web.entities.Order;


@Service
public class OrderService {
    
    @Autowired
    private OrderRepository repository;


    public List <Order> findAll(){
        return repository.findAll();

    }

   
    @SuppressWarnings("null")
    public Order findById (Long id){
        Optional <Order> obj = repository.findById(id);
        return obj.get();
    }
}
