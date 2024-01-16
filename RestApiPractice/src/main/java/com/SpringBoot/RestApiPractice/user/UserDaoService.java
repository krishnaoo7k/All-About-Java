package com.SpringBoot.RestApiPractice.user;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserDaoService {
    private UserRepository repository;

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1,"Krishna", LocalDate.now().minusYears(23)));
        users.add(new User(2,"Don", LocalDate.now().minusYears(50)));
        users.add(new User(3,"Wick", LocalDate.now().minusYears(25)));
    }
    public List<User> findAll(){
        return users;
    }

    public User findOne(int id){
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return new User("user not found");
    }
}
