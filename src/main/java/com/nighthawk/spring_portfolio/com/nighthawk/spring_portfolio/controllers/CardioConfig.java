package com.nighthawk.spring_portfolio.controllers;

import org.springframework.context.annotation.Configuration;

import com.nighthawk.spring_portfolio.controllers.CardioExcerciseRepositary;
import com.nighthawk.spring_portfolio.controllers.CardioExcercise;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Configuration
public class CardioConfig {

    @Bean
    CommandLineRunner commandLineRunner(CardioExcerciseRepositary repository)
    {
        return args -> {
                CardioExercise c1 = new CardioExcercise("Cycling",30);
                CardioExercise c2 = new CardioExcercise("Walking",60);
                CardioExercise c3 = new CardioExcercise("Jogging",30);
                
                repository.saveAll(List.of(c1,c2,c3));
        };
    }
}
