package com.learningspring.abhidi.controllers;

import com.learningspring.abhidi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryBeanController {
    private final GreetingService greetingService;

    public PrimaryBeanController(GreetingService greetingService) {//no @Qualifier so @Primary bean will be used here
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayHello();
    }
}
