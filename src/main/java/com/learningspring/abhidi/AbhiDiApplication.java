package com.learningspring.abhidi;

import com.learningspring.abhidi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AbhiDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AbhiDiApplication.class, args);
		MyController controller = (MyController)ctx.getBean("myController");
		String msg = controller.sayHello();
		System.out.println(msg);

		//Now annotating all the controllers and services for DI from Spring, making them spring managed beans in order
		//to use them from context (ApplicationContext) here

		System.out.println("--------------------PropertyInjection");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------------------SetterInjection");
		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--------------------ConstructorInjection");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("--------------------PrimaryBeanInjection");
		PrimaryBeanController primaryBeanController = (PrimaryBeanController) ctx.getBean("primaryBeanController");
		System.out.println(primaryBeanController.getGreeting());

		System.out.println("--------------------Active Profile based DI");
		I18nController i18nController = (I18nController)ctx.getBean("i18nController");
		System.out.println(i18nController.getGreeting());

	}



}
