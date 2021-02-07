package com.example.soap221.Controller;

import com.example.soap221.model.User;
import com.example.soap221.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
@ComponentScan(basePackages = "com.example.soap221.repository.UserRepository")
public class UserController {

    @Autowired
    public UserRepository userRepository;

    @GetMapping
     public List<User> getAllUsers() {

        List<User> users = new ArrayList<>();
        userRepository.findAll()
                .forEach(users::add);
        return users;
     }
    @GetMapping("hi")
    public String gg() {

        return "Hiii";
    }


    @PostMapping
    public List<User> create(@RequestBody final User user){

        userRepository.save(user);

        List<User> users = new ArrayList<>();
        userRepository.findAll()
                .forEach(users::add);
        return users;
    }
}

