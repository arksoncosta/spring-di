package guru.springframework.springdi;

import guru.springframework.springdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);

		I18nController i18NController = (I18nController) context.getBean("i18nController");
		System.out.println(i18NController.sayHello());

		MyController myController = (MyController) context.getBean("myController");
		System.out.println(myController.sayHello());

		PropertyInjectorController propertyInjectorController = (PropertyInjectorController) context.getBean("propertyInjectorController");
		System.out.println(propertyInjectorController.getGreeting());

		SetterInjectorController setterInjectorController = (SetterInjectorController) context.getBean("setterInjectorController");
		System.out.println(setterInjectorController.getGreeting());

		ConstructorInjectorController constructorInjectorController = (ConstructorInjectorController) context.getBean("constructorInjectorController");
		System.out.println(constructorInjectorController.getGreeting());
	}

}
