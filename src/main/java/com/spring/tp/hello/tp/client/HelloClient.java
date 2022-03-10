package com.spring.tp.hello.tp.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.tp.annotations.bean.autowired.Salutation;
import com.spring.tp.hello.Hello;

public class HelloClient {

	public static void main(String args[]) throws Exception {

		try {

			System.out.println("Début ….");

			// Initialisation de context : Méthode 1

//			DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
//
//			XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(bf);
//
//			reader.loadBeanDefinitions(new ClassPathResource("hello.xml"));
//
//			Hello beanHello = (Hello) bf.getBean("hello");
//
//			String s = beanHello.sayHello("Mad");
//
//			System.out.println(s);

			// Initialisation de context : Méthode 2

			ClassPathXmlApplicationContext ctxt = new ClassPathXmlApplicationContext("hello.xml");

			Hello beanHello = (Hello) ctxt.getBean("hello");

			String s = beanHello.sayHello("Mad");

			System.out.println(s);

			Salutation bean1 = (Salutation) ctxt.getBean("Salutation");

			String s2 = bean1.saluer("Mad");

			System.out.println(s2);

			ctxt.close();

			System.out.println("… Fin.");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
