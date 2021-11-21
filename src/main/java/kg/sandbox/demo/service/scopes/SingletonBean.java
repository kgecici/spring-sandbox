package kg.sandbox.demo.service.scopes;

import org.springframework.stereotype.Service;

@Service
public class SingletonBean {

    public SingletonBean() {
        System.out.println("SingletonBean is creating");
    }

    public String getMessage() {
        return "I'm SingletonBean";
    }
}
