package com.mouritech.springdiexample.service;

import org.springframework.stereotype.Service;

@Service("circle")
public class Circle implements Shape{

	public void isShape(String msg) {
		System.out.println(msg + "......is a circle shape");
		
	}
}
