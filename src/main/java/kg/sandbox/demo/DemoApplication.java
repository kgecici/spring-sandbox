package kg.sandbox.demo;

import kg.sandbox.demo.controller.ConstuctorController;
import kg.sandbox.demo.controller.HelloInterface;
import kg.sandbox.demo.controller.I18nController;
import kg.sandbox.demo.controller.SetterController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		ConstuctorController c = (ConstuctorController)ctx.getBean("constuctorController");
		System.out.println(c.sayHello());


		SetterController setterController = (SetterController)ctx.getBean("setterController");
		System.out.println(setterController.sayHello());

		I18nController i18nController = (I18nController)ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

	}

}