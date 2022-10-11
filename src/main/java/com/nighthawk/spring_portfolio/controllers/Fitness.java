package com.nighthawk.spring_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Fitness {

    // CONTROLLER handles GET request for /birds, maps it to birds() method
    @GetMapping("/fitness")
    public String getFitnessApp() {

        // load HTML VIEW (cities.html)
        return "fitness";

    }
}
