package com.nighthawk.spring_portfolio.controllers;

import org.springframework.context.annotation.Configuration;

import com.nighthawk.spring_portfolio.controllers.ExerciseRepository;
import com.nighthawk.spring_portfolio.controllers.Exercise;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.*;

@Configuration //
public class ExerciseConfig {

    
    @Bean //for insertion of data inside table
    CommandLineRunner commandLineRunner(ExerciseRepository repository)
    {

        return args -> {

                repository.deleteAllInBatch();  

                Exercise c1 = new Exercise("Cycling",30);
                Exercise c2 = new Exercise("Squats",10);
                Exercise c3 = new Exercise("Lunges-Left",10);
                Exercise c4 = new Exercise("Lunges-Right",10);
                Exercise c5 = new Exercise("Biceps-Left",10);
                Exercise c6 = new Exercise("Biceps-Right",10);
                Exercise c7 = new Exercise("Stretchings",30);
                Exercise c8 = new Exercise("Pistol Squats", 10);
                
                              
                repository.saveAll(List.of(c1,c2,c3,c4,c5,c6,c7,c8));  //will save Excercise  data into sqlite database.
        };
    }
    
}

