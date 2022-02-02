package com.mouritech.springdiexample.setterdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springdiexample.service.Shape;

@Component
public class SetterBasedInjectionExample {
	private Shape shape;

	public Shape getShape() {
		return shape;
	}

	@Autowired
	@Qualifier("rectangle")
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void isShape(String msg){
		shape.isShape(msg);
	}
	

}
