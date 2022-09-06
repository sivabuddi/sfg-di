package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import java.util.Set;

@ComponentScan(basePackages = {"guru.springframework.sfgdi","com.springframework.pets"})
@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SfgDiApplication.class, args);

//		PetController petController=(PetController) context.getBean("petController");
//		System.out.println(petController.whichPetIsTheBest());

		I18nController i18nController =(I18nController)context.getBean("i18nController");
		System.out.println(i18nController.sayHello());

//		MyController myController=(MyController)context.getBean("myController");
//		System.out.println("-----Primary Bean--------------");
//		System.out.println(myController.sayHello());
//
//		System.out.println("----Property Based Controller-----");
//		PropertyInjectedController propertyInjectedController=(PropertyInjectedController) context.getBean("propertyInjectedController");
//		System.out.println(propertyInjectedController.getGreeting());
//
//		System.out.println("--Setter Based Controller----------");
//		SetterInjectedController setterInjectedController=(SetterInjectedController)context.getBean("setterInjectedController");
//		System.out.println(setterInjectedController.getGreeting());
//
//		System.out.println("----------Constructor Based Controller-----");
//		ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) context.getBean("constructorInjectedController");
//		System.out.println(constructorInjectedController.getGreeting());

	}

}
