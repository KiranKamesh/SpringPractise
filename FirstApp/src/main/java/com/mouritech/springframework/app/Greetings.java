package com.mouritech.springframework.app;

import org.springframework.stereotype.Service;

@Service("greetingsService")
public class Greetings {
	private String greet;

	public String getGreet() {
		return greet;
	}

	public void setGreet(String greet) {
		this.greet = greet;
	}

}
