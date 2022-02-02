package com.mouritech.springdiexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mouritech.springdiexample.config.AppConfiguration;
import com.mouritech.springdiexample.constructordi.ConstructorBasedDIExample;

public class TestConstructorBasedInjection {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(AppConfiguration.class);
		ConstructorBasedDIExample cbie = container.getBean(ConstructorBasedDIExample.class);
		cbie.isShape("shape is.........");

	}

}