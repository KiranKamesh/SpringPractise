package com.mouritech.springdiexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mouritech.springdiexample.config.AppConfiguration;
import com.mouritech.springdiexample.setterdi.SetterBasedInjectionExample;

public class TestSetterBasedInjection {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext container = new AnnotationConfigApplicationContext(AppConfiguration.class);
		SetterBasedInjectionExample sbie = container.getBean(SetterBasedInjectionExample.class);
		sbie.isShape("shape is .....");

	}

}
