package com.nighthawk.spring_portfolio.controllers;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

//To use the @Data annotation you should add the Lombok dependency.

@Entity(name = "Exercise")
public class Exercise {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) //primary key generation
    private Long id; // Long is declared to support big id numbers
    //Long is also wrapper class
    private String exerciseName;

    private Integer timePeriod_reps; //adv: more secure with use of wrapper class

    public Exercise()
    {
    }

    public Exercise(String eName, Integer tp)
    {
        exerciseName = eName;
        timePeriod_reps = tp;
    }

    public void setID(Long id)
    {
        this.id = id;
    }

    public Long getID()
    {
        return id;
    }

    public void setExerciseName(String eName)
    {
        exerciseName=eName;
    }

    public String getExerciseName()
    {
        return exerciseName;
    }

    public void setTimePeriodReps(Integer tp)
    {
        timePeriod_reps = tp;
    }

    public Integer getTimePeriod()
    {
        return timePeriod_reps;
    }

    @Override
    public String toString()
    {
        return "Exercise{"+
                "id="+id+
                ",ExerciseName='"+exerciseName+'\''+
                ",TimePeriod="+timePeriod_reps+
                "}";
    }
    
}

