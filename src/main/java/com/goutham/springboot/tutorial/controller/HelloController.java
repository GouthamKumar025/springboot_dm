package com.goutham.springboot.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   @GetMapping("/")
    public String helloWorld(){
        return "Hi this is Goutham";
    }

}
