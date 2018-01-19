package lichen000.designpatten.flyweight;

/**
 * Created by chen.li200 on 2018-01-19
 */
public class Circle implements Shape {

	private double x;
	private double y;
	private double radius;

	private String color;

	public Circle(String color) {
		this.color = color;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 *
	 */
	@Override
	public void draw() {
		System.out.println("Circle: Draw() [Color : " + color
				+", x : " + x +", y :" + y +", radius :" + radius);
	}
}
