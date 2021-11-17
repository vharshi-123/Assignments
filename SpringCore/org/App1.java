package com.java.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.beans.factory.BeanDefinitionStoreException;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("src/main/java/com/java/org/cap.xml");

		Applicationclass n = (Applicationclass) context.getBean("noob");
		n.walk();
		Build a = (Build) context.getBean("pro");
		a.Slow();
		Application ap = (Application) context.getBean("app");
		ap.go();
		System.out.println("DONE...");

	}
}
