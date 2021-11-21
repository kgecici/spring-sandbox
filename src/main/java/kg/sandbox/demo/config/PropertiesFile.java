package kg.sandbox.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:kg-sandbox.properties")
@Configuration
public class PropertiesFile {

    @Bean
    PasswordConfig passwordConfig(@Value("${kg.username}")String username, @Value("${kg.password}") String password) {
        return new PasswordConfig(username, password);
    }

}
