package com.bridgelabz.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldRestControler {

    @GetMapping(value={"","/","/home"})
    public String sayHello(){
        return "Welcome to Bridgelabz Spring Boot Online Course";
    }

    @GetMapping("/welcome/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello" +name +"Welcome to" +" Spring Boot Online Course";
    }
}
