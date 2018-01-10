package lichen000.designpatten.bridge;

/**
 * Created by chen.li200 on 2018-01-10
 */
public class BlueCircle implements DrawAPI {

	/**
	 *
	 * @param radius
	 * @param x
	 * @param y
	 */
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Draw Circle[ color: blue, radius: " + radius + ", x: " + x + ", y: " + y + "]");
	}
}
