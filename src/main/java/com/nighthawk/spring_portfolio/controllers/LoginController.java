package com.nighthawk.spring_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nighthawk.spring_portfolio.mvc.User;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @PostMapping("/register")
    public String userRegistration(@ModelAttribute User user, Model model) {
        System.out.println(user.toString());
        // validate
        System.out.println(user.getFname());
        System.out.println(user.getLname());
        System.out.println(user.getDob());
        System.out.println(user.getEmail());
        System.out.println(user.getCredit());
        model.addAttribute("firstname", user.getFname());
        model.addAttribute("lastname", user.getLname());
        return "welcome";
    }
}
