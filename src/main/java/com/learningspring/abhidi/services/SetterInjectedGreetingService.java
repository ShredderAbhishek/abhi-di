package com.learningspring.abhidi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World from SetterInjectedGreetingServiceImpl";
    }
}
