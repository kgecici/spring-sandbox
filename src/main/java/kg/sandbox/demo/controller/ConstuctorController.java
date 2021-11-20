package kg.sandbox.demo.controller;

import kg.sandbox.demo.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstuctorController {


    private final GreetingService greetingService;

    public ConstuctorController(@Qualifier("constructorService")  GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayHello();
    }
}
