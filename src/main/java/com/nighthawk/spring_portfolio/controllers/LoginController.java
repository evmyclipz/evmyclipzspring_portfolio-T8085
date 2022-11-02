package com.nighthawk.spring_portfolio.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframsework.web.bind.annotation.RequestMethod;

@Controller

public class LoginController {

    @RequestMapping("/login")
    public String showForm() {

        return "login";

    }

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public String handleForm(HttpServletRequest request) {

        String email = request.getParameter("fname");
        System.out.println(email);
        return "";

    }

}
