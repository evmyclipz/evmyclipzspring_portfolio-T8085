package com.nighthawk.spring_portfolio.controllers;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity(name = "UserInfo")
public class UserInfo {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) //primary key generation
    private Long id; // Long is declared to support big id numbers

    private String name;
    private Integer height1;
    private Integer height2;
    private Integer weight;
    private Integer freetime;

    public UserInfo()
    {
        
    }

    public UserInfo(String n1,Integer h1,Integer h2,Integer w1,Integer ft)
    {
        name=n1;
        height1=h1;
        height2=h2;
        weight=w1;
        freetime=ft;
    }

    public void setID(Long id)
    {
        this.id = id;
    }

    public Long getID()
    {
        return id;
    }

    public void setName(String n1)
    {
        name=n1;
    }

    public String getName()
    {
        return name;
    }

    public void setHeight1(Integer h1)
    {
        height1=h1;
    }

    public Integer getHeight1()
    {
        return height1;
    }

    public void setHeight2(Integer h2)
    {
        height2=h2;
    }

    public Integer getHeight2()
    {
        return height2;
    }

    public void setWeight(Integer w1)
    {
        weight=w1;
    }

    public Integer getWeight()
    {
        return weight;
    }

    public void setFreetime(Integer ft)
    {
        freetime=ft;
    }

    public Integer getFreetime()
    {
        return freetime;
    }

    @Override
    public String toString()
    {
        return "UserInfo{"+
                "Id='"+id+'\''+        
                ",Name='"+name+'\''+
                ",Height1="+height1+'\''+
                ",Height2="+height2+'\''+
                ",Weight="+weight+'\''+
                ",FreeTime="+freetime+
                "}";
    }
    
}
