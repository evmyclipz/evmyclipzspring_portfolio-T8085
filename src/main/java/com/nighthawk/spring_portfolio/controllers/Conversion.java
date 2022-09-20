package com.nighthawk.spring_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Conversion {


    public String hexadecimal(String num) {
        System.out.println("input:"+num);
        int x = Integer.parseInt(num); //Use fo wrapper class interger to convert from string to interger
        String in = "";

        String out="";
        int a;
        for(;x>=1; x=x/16) { //decimal to hexadecimal
            a = x % 16;
            if(a>9) {
                if(a==10) { 
                    out+= 'A';//appends to string
                }
                else if(a == 11) {
                	out+= 'B';
                }
                else if(a == 12) {
                	out+= 'C';
                }
                else if(a == 13) {
                	out+= 'D';
                }
                else if(a == 14) {
                	out+= 'E';
                }
                else if(a == 15) {
                	out+= 'F';
                }
            }
            else
            	out+=String.valueOf(a);//appends to string
            
            
            
        }
        //most important line of code, hardest to use
        in = reverseString(out);
        System.out.println(in);
        return in;
    }
    
    private String reverseString(String out) 
    {
    	char[] ch = out.toCharArray();
    	int x = out.length()-1;
    	String s="";
    	for(;x>=0;x--) {
    		s+=ch[x];
    	}
    	return s;
    }


    // @GetMapping handles GET request for /greet, maps it to greeting() method
    @GetMapping("/conversion")
    // @RequestParam handles variables binding to frontend, defaults, etc
    public String number(@RequestParam(name="name", required=false, defaultValue="128") String decimal, Model model) {

        // model attributes are visible to Thymeleaf when HTML is "pre-processed"
     //   model.addAttribute("name", decimal);
        decimal = hexadecimal(decimal);
      //  System.out.println(decimal);
        model.addAttribute("name", decimal);

        // load HTML VIEW (greet.html)
        return "conversion"; 

    }

}