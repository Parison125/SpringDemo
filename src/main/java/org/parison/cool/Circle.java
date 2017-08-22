package org.parison.cool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape {
	
	private int radius;
	
	private Point center;
	
	
	public Point getCenter() {
		return center;
	}
	
	@Resource(name="pointC")
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
		System.out.print("Initialization of a circle bean");
	}

	@PreDestroy
	public void destroyCircle(){
		System.out.print("Destruction of a circle bean");
	}

}
