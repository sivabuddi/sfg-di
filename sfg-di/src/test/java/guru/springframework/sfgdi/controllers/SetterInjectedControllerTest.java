package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController scontroller;

    @BeforeEach
    void setUp() {
        scontroller=new SetterInjectedController();
        scontroller.setGreetingService(new ConstructorInjectedGreetingService());
    }

    @Test
    void getGreeting() {
       System.out.println(scontroller.getGreeting());
    }
}