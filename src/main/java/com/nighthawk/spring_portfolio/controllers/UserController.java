package com.nighthawk.spring_portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(path="api/v1/users")
public class UserController {

    private final UserService userService;

    @Autowired //will create cs object automatically
    public UserController(UserService us)
    {
        userService = us;
    }

    @GetMapping() //will also apply the same path as the request mapping annotation
    public List<UserInfo> getUsers()
    {
        return userService.getUsers(); //return a list 
    }
    
}
