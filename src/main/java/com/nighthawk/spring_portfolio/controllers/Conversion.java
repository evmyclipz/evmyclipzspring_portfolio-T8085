package com.nighthawk.spring_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Conversion {


    /*private String reverseString(String out) {
        char[] ch = out.toCharArray();
        int x = out.length()-1;
        String s="";
        for(;x>=0;x--) {
            s+=ch[x];
        }
        return s;
    }*/

    @GetMapping("/conversion")
    public String number(@RequestParam(name="name") String name, Model model) {
        /*int x = Integer.parseInt(name);
        String out="";
        int a; //
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
        this.reverseString(out);*/
        name = "Hello World";
        model.


        return "conversion";
        
    
    

    }

}