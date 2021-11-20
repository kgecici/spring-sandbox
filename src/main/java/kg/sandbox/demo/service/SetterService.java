package kg.sandbox.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SetterService implements  GreetingService{

    @Override
    public String sayHello() {
        return "Hello from SetterService";
    }
}
