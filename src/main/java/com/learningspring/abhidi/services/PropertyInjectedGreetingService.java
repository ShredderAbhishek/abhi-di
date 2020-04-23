package com.learningspring.abhidi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World from PropertyInjectedGreetingServiceImpl";
    }
}
