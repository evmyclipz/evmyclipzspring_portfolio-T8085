package com.nighthawk.spring_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class conversion {

    @GetMapping("/conversion")
    public String michealischinense(@RequestParam(name="name") String name, Model model) {

        //model.addAttribute("xyz", name);
        int x = Integer.parseInt(name);


        return "conversion";
        
    }
    
}
