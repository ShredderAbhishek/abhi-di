package com.learningspring.abhidi.controllers;

import org.springframework.stereotype.Controller;

//see in com/learningspring/abhidi/AbhiDiApplication.java ; how the object of this class is created at runtime from context
@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello from controller");
        return "Hello World1";
    }
}
