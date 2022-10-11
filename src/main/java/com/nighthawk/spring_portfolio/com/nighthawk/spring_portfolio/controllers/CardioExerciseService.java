package com.nighthawk.spring_portfolio.controllers;

import org.springframework.sterotype.Service;
import org.springframework.sterotype.Autowired;

@Service
public class CardioExerciseService {

    private final CardioExcerciseRepositary repository;

    @Autowired
    public CardioExerciseService(CardioExcerciseRepositary repo)
    {
        repository = repo;
    }

    public List<CardioExercise> getExercises()
    {
        return repository.findAll();
    }
    
}
