package kg.sandbox.demo;

import kg.sandbox.demo.config.ConstructorServiceBinding;
import kg.sandbox.demo.config.PasswordConfig;
import kg.sandbox.demo.config.PasswordConfig2;
import kg.sandbox.demo.controller.ConstuctorController;
import kg.sandbox.demo.controller.HelloInterface;
import kg.sandbox.demo.controller.I18nController;
import kg.sandbox.demo.controller.SetterController;
import kg.sandbox.demo.service.scopes.PrototypeBean;
import kg.sandbox.demo.service.scopes.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;


@EnableConfigurationProperties(ConstructorServiceBinding.class)
@ImportResource("kg-sandbox-bean-config.xml")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		ConstuctorController c = (ConstuctorController)ctx.getBean("constuctorController");
		c.incrementCounter();
		System.out.println(c.sayHello() + " Counter:" + c.getCounter());

        c = (ConstuctorController)ctx.getBean("constuctorController");
        c.incrementCounter();
        System.out.println(c.sayHello() + " Counter:" + c.getCounter());


		SetterController setterController = (SetterController)ctx.getBean("setterController");
		System.out.println(setterController.sayHello());

		I18nController i18nController = (I18nController)ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

        System.out.println("--------- BEAN Scopes -----------");
        SingletonBean s1  = (SingletonBean)ctx.getBean("singletonBean");
        System.out.println(s1.getMessage());
        SingletonBean s2  = (SingletonBean)ctx.getBean("singletonBean");
        System.out.println(s2.getMessage());

        PrototypeBean p1  = (PrototypeBean)ctx.getBean("prototypeBean");
        System.out.println(p1.getMessage());
        PrototypeBean p2  = (PrototypeBean)ctx.getBean("prototypeBean");
        System.out.println(p2.getMessage());

        System.out.println("---------  Password config from ext file -----------");
        PasswordConfig pc  =  ctx.getBean(PasswordConfig.class);
        System.out.println(pc.getUsername());

        System.out.println("---------  Password config bean -----------");
        PasswordConfig2 pc2  = ctx.getBean(PasswordConfig2.class);
        System.out.println(pc2.getUsername());


        System.out.println("---------  ConstructorServiceBinding config bean -----------");
        ConstructorServiceBinding pc3  = ctx.getBean(ConstructorServiceBinding.class);
        System.out.println(pc3.getUsername());


	}

}
