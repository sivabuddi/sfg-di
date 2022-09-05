package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController ccontroller;

    @BeforeEach
    void setUp() {
        ccontroller = new ConstructorInjectedController(new GreetingServiceImpl());

    }

    @Test
    void getGreeting() {
        System.out.println(ccontroller.getGreeting());
    }
}