package com.bridgelabz.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }


    @GetMapping("/message")
    public String printMessage(Model model){
        model.addAttribute("message","Welcome to BridgeLabz");
        return  "message";
    }
}
