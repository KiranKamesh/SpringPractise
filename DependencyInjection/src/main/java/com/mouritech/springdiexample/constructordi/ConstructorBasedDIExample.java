package com.mouritech.springdiexample.constructordi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springdiexample.service.Shape;

@Component
public class ConstructorBasedDIExample {
	private Shape shape;
	public ConstructorBasedDIExample(@Qualifier("circle") Shape s) {
		this.shape = s;
	}
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
