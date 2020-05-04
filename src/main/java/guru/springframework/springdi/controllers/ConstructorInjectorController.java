package guru.springframework.springdi.controllers;

import guru.springframework.springdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectorController {

    private final GreetingService greetingService;

    public ConstructorInjectorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
