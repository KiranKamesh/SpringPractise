package com.mouritech.springdiexample.service;

import org.springframework.stereotype.Service;

@Service("square")
public  class Square implements Shape{

	public void isShape(String msg) {
		System.out.println(msg+".......is a square shape");
		
	}
}
