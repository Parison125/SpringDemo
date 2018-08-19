package org.parison.cool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.Locale;

@Component
public class Circle implements Shape {


	private int radius;
	
	private Point center;
	
	private MessageSource lettre;

	public MessageSource getLettre() {
		return lettre;
	}

	@Autowired
	public void setLettre(MessageSource lettre) {
		this.lettre = lettre;
	}

	public Point getCenter() {
		return center;
	}
	
	@Resource(name="pointB")
	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	@Value("12")
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println(" Circle drawn with radius "+getRadius());
		System.out.println("The center is ("+getCenter().getX()+", "+getCenter().getY()+")");
		System.out.println("The message is : "+this.lettre.getMessage("greeting",null,"default message", null));
		System.out.println(this.lettre.getMessage("salution",new Object[]{"Parison","Ravalomanda"},"Default message",null));
	}

	@PostConstruct
	public void initCircle(){
		System.out.println("Initialization of a circle bean");
	}

	@PreDestroy
	public void destroyCircle(){
		System.out.println("Destruction of a circle bean");
	}

}
