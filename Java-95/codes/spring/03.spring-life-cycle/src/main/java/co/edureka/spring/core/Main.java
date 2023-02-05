package co.edureka.spring.core;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//-- initialize spring container
		//ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		
		System.out.println("----------------------------------------------");		
		
		context.close();
	}

}
