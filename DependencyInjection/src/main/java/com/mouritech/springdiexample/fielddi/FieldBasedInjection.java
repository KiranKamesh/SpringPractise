package com.mouritech.springdiexample.fielddi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springdiexample.service.Shape;

@Component
public class FieldBasedInjection {
	@Autowired
	@Qualifier("square")
	private Shape shape;

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void isShape(String msg){
		shape.isShape(msg);
	}

}
