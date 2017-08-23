package org.parison.cool;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("springBeans.xml");
		context.registerShutdownHook();
		Shape shape =  (Shape) context.getBean("circle");
		shape.draw();
	}

}
