package com.web.serv;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.Repository.UserRepository;
import com.web.entities.User;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;


    public List<User> findAll(){
        return repository.findAll();

    }

    @SuppressWarnings("null")
    public User findById (Long id){
        Optional <User> obj = repository.findById(id);
        return obj.get();
    }
}