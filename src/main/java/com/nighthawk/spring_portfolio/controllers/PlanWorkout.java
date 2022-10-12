package com.nighthawk.spring_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class PlanWorkout {

    // CONTROLLER handles GET request for /birds, maps it to birds() method
    @GetMapping("/plan")  //fitness.html is calling plan which in turn connects to plan.html
    public String getPlan() {

        // load HTML VIEW (cities.html)
        return "plan";

    }
}
