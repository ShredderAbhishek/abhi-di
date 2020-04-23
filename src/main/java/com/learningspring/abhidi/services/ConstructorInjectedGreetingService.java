package com.learningspring.abhidi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World from ConstructorInjectedGreetingServiceImpl";
    }
}