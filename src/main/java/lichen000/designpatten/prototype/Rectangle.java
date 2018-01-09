package lichen000.designpatten.prototype;

/**
 * Created by chen.li200 on 2018-01-09
 */
public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("draw rectangle");
	}

}
