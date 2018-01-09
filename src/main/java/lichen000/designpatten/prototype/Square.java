package lichen000.designpatten.prototype;

/**
 * Created by chen.li200 on 2018-01-09
 */
public class Square extends Shape {

	public Square() {
		type = "Square";
	}

	@Override
	public void draw() {
		System.out.println("draw square");
	}

}
