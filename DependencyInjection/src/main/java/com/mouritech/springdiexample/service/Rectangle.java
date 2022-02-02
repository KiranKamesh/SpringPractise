package com.mouritech.springdiexample.service;

import org.springframework.stereotype.Service;

@Service("rectangle")
public class Rectangle implements Shape{
	public void isShape(String msg) {
		System.out.println(msg+".....is a rectangle shape");
		
	}

}
