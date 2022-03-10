package com.spring.tp.annotations.bean.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.tp.hello.Hello;

@Component("Salutation")
public class Salutation {

	@Autowired
	Hello hello;

	public String saluer(String s) {

		return hello.sayHello(s).toUpperCase();

	}

}
