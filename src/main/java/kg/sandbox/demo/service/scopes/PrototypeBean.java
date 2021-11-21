package kg.sandbox.demo.service.scopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {

    public PrototypeBean() {
        System.out.println("PrototypeBean is creating");
    }
    public String getMessage() {
        return "I'm PrototypeBean";
    }
}
