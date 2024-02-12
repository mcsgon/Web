package com.webservice.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.webservice.entities.User;

@RestController
@RequestMapping (value ="/users")
public class UserResource {
    
    @GetMapping
    public ResponseEntity <User> findAll (){
        User u= new User(1L, "jose", "jose@gmail.com", "119537258", "458");
        return ResponseEntity.ok().body(u);
    }
}
