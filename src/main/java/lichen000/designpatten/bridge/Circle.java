package lichen000.designpatten.bridge;

/**
 * Created by chen.li200 on 2018-01-10
 */
public class Circle extends Shape {
	private int x;
	private int y;
	private int radius;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	/**
	 *
	 */
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}

}
