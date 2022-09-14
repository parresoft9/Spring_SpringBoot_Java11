package com.example;

import org.springframework.stereotype.Service;

@Service
public class MyBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
