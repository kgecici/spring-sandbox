package kg.sandbox.demo.controller;

import kg.sandbox.demo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterController {

    @Autowired
    @Qualifier("setterService")
    private GreetingService greetingService;

    public void setGreetingService( GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayHello();
    }
}
