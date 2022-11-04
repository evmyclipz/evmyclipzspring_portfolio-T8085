package com.nighthawk.spring_portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import com.nighthawk.spring_portfolio.controllers.ExerciseService;
import com.nighthawk.spring_portfolio.controllers.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(path="api/v1/")
public class ExerciseController {
    
     
   // private final ExerciseService exerciseService;
    private final UserService userService;

    @Autowired //will create cs object automatically
    public ExerciseController(/*ExerciseService cs,*/UserService us)
    {
        //exerciseService = cs;
        userService = us;
    }

    @GetMapping("fitnessApp") //will also apply the same path as the request mapping annotation
    public List<Exercise> getExercises()
    {
        return userService.getExercises(); //return a list 
    }

    @GetMapping("users") //will also apply the same path as the request mapping annotation
    public List<UserInfo> getUsers()
    {
        return userService.getUsers(); //return a list 
    }

}
