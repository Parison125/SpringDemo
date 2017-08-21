package org.parison.cool;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("springBeans.xml");
		Shape shape =  (Shape) context.getBean("cercle");
		shape.draw();
	}

}
