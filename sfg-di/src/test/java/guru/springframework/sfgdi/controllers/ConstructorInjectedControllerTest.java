package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController ccontroller;

    @BeforeEach
    void setUp() {
        ccontroller = new ConstructorInjectedController(new ConstructorInjectedGreetingService());

    }

    @Test
    void getGreeting() {
        System.out.println(ccontroller.getGreeting());
    }
}