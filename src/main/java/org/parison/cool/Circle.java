package org.parison.cool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component
public class Circle implements Shape {

	@Value("12")
	private int radius;
	
	private Point center;
	
	
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

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println(" Circle drawn with radius "+getRadius());
		System.out.println("The center is ("+getCenter().getX()+", "+getCenter().getY()+")");

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
