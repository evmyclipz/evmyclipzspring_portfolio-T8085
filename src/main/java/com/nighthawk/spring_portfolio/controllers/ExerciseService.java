package com.nighthawk.spring_portfolio.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.nighthawk.spring_portfolio.controllers.ExerciseRepository;  //import Excercise repo to use built in methods
import java.util.List;

@Component
public class ExerciseService {

    private final ExerciseRepository repository;

    @Autowired  //also instatiated repo 
    public ExerciseService(ExerciseRepository repo)
    {
        repository = repo;
    }

    public List<Exercise> getExercises()
    {
        return repository.findAll(); //retreieves Excercise data from sqlite database
    }
    
}
