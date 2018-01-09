package lichen000.designpatten.prototype;

/**
 * Created by chen.li200 on 2018-01-09
 */
public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("draw circle");
	}

}
