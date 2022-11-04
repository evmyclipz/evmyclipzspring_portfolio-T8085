package com.nighthawk.spring_portfolio.controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface ExerciseRepository extends JpaRepository<Exercise,Long>{  //will search for excercises in sqlite
          
    //Optional<Exercise> findExerciseByExerciseName(String exerciseName);//primary key datatype
}
