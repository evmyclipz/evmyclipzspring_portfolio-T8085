package com.nighthawk.spring_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.nighthawk.spring_portfolio.controllers.UserService;
import java.util.List;


@Controller
public class Fitness {

    
    private final UserService userService;

    @Autowired
    public Fitness(UserService us)
    {
        userService=us;
    }

    // CONTROLLER handles GET request for /birds, maps it to birds() method
    @GetMapping("/fitness")  //connects to fitness.html
    public String getFitnessApp() {

        // load HTML VIEW (cities.html)
        return "fitness";
    }

    @PostMapping("/signup")
    public String getUserInfo(@ModelAttribute UserInfo user,Model model)
    {
                
        if(!userService.userExists(user.getName()))
        {
            UserInfo newUser = userService.saveUser(user);

            model.addAttribute("name",newUser.getName());
            model.addAttribute("height",newUser.getHeight1()+"'"+newUser.getHeight2()+"\"");
            model.addAttribute("weight",newUser.getWeight());
            model.addAttribute("freetime",newUser.getFreetime());

            System.out.println(newUser.toString());
      
            return "newuser";
      
        }
        else{
            model.addAttribute("message","User Already Exists");
            return "fitness";
        }
    }

}
