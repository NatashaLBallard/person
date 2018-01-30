package com.person.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping ("/")
    public String homePage(){

        person Natasha = new person(); //sets initial parameters; does not need return statements
        person Afua = new person("brown");

        return "index";
    }

}