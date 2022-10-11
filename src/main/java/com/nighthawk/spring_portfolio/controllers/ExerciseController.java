package com.nighthawk.spring_portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.nighthawk.spring_portfolio.controllers.ExerciseService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(path="api/v1/fitnessApp")
public class ExerciseController {
    
     
    private final ExerciseService exerciseService;

    @Autowired 
    public ExerciseController(ExerciseService cs)
    {
        exerciseService = cs;
    }

    @GetMapping()
    public List<Exercise> getExercises()
    {
        return exerciseService.getExercises();
    }

}
