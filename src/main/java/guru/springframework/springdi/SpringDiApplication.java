package guru.springframework.springdi;

import guru.springframework.springdi.controllers.ConstructorInjectorController;
import guru.springframework.springdi.controllers.MyController;
import guru.springframework.springdi.controllers.PropertyInjectorController;
import guru.springframework.springdi.controllers.SetterInjectorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);

		MyController myController = (MyController) context.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("----------- Property");
		PropertyInjectorController propertyInjectorController = (PropertyInjectorController) context.getBean("propertyInjectorController");
		System.out.println(propertyInjectorController.getGreeting());

		System.out.println("----------- Setter");
		SetterInjectorController setterInjectorController = (SetterInjectorController) context.getBean("setterInjectorController");
		System.out.println(setterInjectorController.getGreeting());

		System.out.println("----------- Cosnstrutor");
		ConstructorInjectorController constructorInjectorController = (ConstructorInjectorController) context.getBean("constructorInjectorController");
		System.out.println(constructorInjectorController.getGreeting());
	}

}
