package com.nighthawk.spring_portfolio.controllers;

import lombok.*;

import javax.persistence.*;

//To use the @Data annotation you should add the Lombok dependency.
@Entity(name = "CardioExercise")
@Table
public class CardioExercise {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id",
            updatable = false)
    private Long id;

    @Column(name = "exercise_name")
    private String exerciseName;

    @Column(name = "time_period")
    private Integer timePeriod;

    public CardioExercise()
    {
    }

    public CardioExercise(String eName, Integer tp)
    {
        exerciseName = eName;
        timePeriod = tp;
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

    public void setTimePeriod(Integer tp)
    {
        timePeriod = tp;
    }

    public Integer getTimePeriod()
    {
        return timePeriod;
    }

    @Override
    public String toString()
    {
        return "CardioExercise{"+
                "id="+id+
                ",ExerciseName='"+exerciseName+'\''+
                ",TimePeriod="+timePeriod+
                "}";
    }
    
}

