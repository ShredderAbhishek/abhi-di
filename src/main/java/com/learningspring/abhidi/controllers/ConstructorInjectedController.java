package com.learningspring.abhidi.controllers;

import com.learningspring.abhidi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//most preferred way of injecting objects
@Controller
public class ConstructorInjectedController {

    GreetingService greetingService;

    @Autowired //this annotation is optional now for constructor injection
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayHello();
    }
}
