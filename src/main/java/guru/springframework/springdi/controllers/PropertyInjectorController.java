package guru.springframework.springdi.controllers;

import guru.springframework.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectorController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
