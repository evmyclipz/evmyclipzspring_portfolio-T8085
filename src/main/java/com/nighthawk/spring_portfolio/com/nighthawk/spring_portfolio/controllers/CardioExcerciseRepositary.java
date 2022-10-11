package com.nighthawk.spring_portfolio.controllers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.sterotype.Repository;
import com.nighthawk.spring_portfolio.controllers.CardioExcercise;

@Repository
public interface CardioExcerciseRepositary extends JPARepository<CardioExercise,Long>{
    
}
