package com.nighthawk.spring_portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.nighthawk.spring_portfolio.controllers.CardioExerciseService;

import java.util.*;

@RestController
@GetMapping(path="api/v1/fitnessApp")
public class CardioExcerciseController {
    
    @Autowired   
    private final CardioExerciseService cardioService;

    public CardioExcerciseController(CardioExerciseService cs)
    {
        cardioService = cs;
    }

    @GetMapping
    public List<CardioExercise> getExercises()
    {
        return cs.getExercises();
    }

}
