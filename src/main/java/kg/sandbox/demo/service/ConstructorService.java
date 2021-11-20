package kg.sandbox.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello from ConstructorService ";
    }
}
