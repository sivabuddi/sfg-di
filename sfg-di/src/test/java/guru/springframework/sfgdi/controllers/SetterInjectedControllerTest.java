package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    SetterInjectedController scontroller;

    @BeforeEach
    void setUp() {
        scontroller=new SetterInjectedController();
        scontroller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
       System.out.println(scontroller.getGreeting());
    }
}