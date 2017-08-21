package org.parison.cool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {
	
	private int radius;
	
	private Point center;
	
	
	public Point getCenter() {
		return center;
	}
	
	@Autowired
	@Qualifier("circleRelated")
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

}
