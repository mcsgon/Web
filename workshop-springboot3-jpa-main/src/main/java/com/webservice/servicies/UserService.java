package com.webservice.servicies;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.Repository.UserRepository;
import com.webservice.entities.User;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;


    public List <User> findAll(){
        return repository.findAll();

    }

    @SuppressWarnings("null")
    public User findyById (Long id){
        Optional <User> obj = repository.findById(id);
        return obj.get();
    }
}