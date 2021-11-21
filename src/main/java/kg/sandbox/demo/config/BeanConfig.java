package kg.sandbox.demo.config;

import kg.sandbox.demo.controller.ConstuctorController;
import kg.sandbox.demo.controller.SetterController;
import kg.sandbox.demo.service.GreetingService;
import kg.sandbox.demo.service.SetterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    GreetingService greetingService() {
        return new SetterService();
    };


    @Bean
    SetterController setterController() {
        return new SetterController();
    }

    @Bean
    ConstuctorController constuctorController() {
        return new ConstuctorController(greetingService());
    }

}
