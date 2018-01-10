package lichen000.designpatten.bridge;

/**
 * Created by chen.li200 on 2018-01-10
 */
public abstract class Shape {
	protected DrawAPI drawAPI;
	public Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}
	public abstract void draw();
}
