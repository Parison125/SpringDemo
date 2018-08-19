package org.parison.cool;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.Resource;

public class Triangle implements Shape{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private List<Point> pointsList;
	private ApplicationContext context = null;
	
	public Point getPointA() {
		return pointA;
	}

	@Resource(name="pointA")
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}

	@Resource(name="pointB")
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}

	@Resource(name="pointC")
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println("Point A = ("+getPointA().getX()+" , "+getPointA().getY()+" )");
		System.out.println("Point B = ("+getPointB().getX()+" , "+getPointB().getY()+" )");
		System.out.println("Point C = ("+getPointC().getX()+" , "+getPointC().getY()+" )");

		
	}

	public void listAllPoints() {
		for (Point p : pointsList) {
			System.out.println("Point = ("+p.getX()+" , "+p.getY()+" )");
		}
				
	}
	
	public List<Point> getPointsList() {
		return pointsList;
	}
	public void setPointsList(List<Point> pointsList) {
		this.pointsList = pointsList;
	}
	

}
