package com.SpringBoot.RestApiPractice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserResource {
    @Autowired
    private UserDaoService service;

    @GetMapping("users")
    public List<User> retrieveByAll(){
        return service.findAll();
    }
    @GetMapping("users/{id}")
    public User retrieveOne(@PathVariable int id){
        return service.findOne(id);
    }

}
