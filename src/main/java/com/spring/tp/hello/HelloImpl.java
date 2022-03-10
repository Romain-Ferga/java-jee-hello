package com.spring.tp.hello;

import org.springframework.stereotype.Component;

@Component
public class HelloImpl implements Hello {

	private String greeting = "Hello ";

	public HelloImpl() {
	}

	public HelloImpl(String a) {
		greeting = a;
	}

	public String sayHello(String a) {

		return greeting + a;

	}

	public void setGreeting(String a) {

		greeting = a;

	}

}
