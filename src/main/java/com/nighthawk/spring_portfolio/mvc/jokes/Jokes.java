package com.nighthawk.spring_portfolio.mvc.jokes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data  // Annotations to simplify writing code (ie constructors, setters)
@NoArgsConstructor
@AllArgsConstructor
@Entity // Annotation to simplify creating an entity, which is a lightweight persistence domain object. Typically, an entity represents a table in a relational database, and each entity instance corresponds to a row in that table.
public class Jokes { //you can get a database table created w/o any effort
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO) //taking to the database, so dont have to worry about unique ID of data
    // normally databases have a unique id generator, but the above line of cod makes it for us.

    private Long id;

    @Column(unique=true)
    private String joke;
}
