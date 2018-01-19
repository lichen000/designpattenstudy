package lichen000.designpatten.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chen.li200 on 2018-01-19
 */
public class ShapeFactory {
	private static final Map<String, Shape> map = new HashMap<>();

	/**
	 *
	 * @param color
	 * @return
	 */
	public static Shape getCircle(String color) {
		Circle circle = (Circle)map.get(color);

		if (circle == null) {
			circle = new Circle(color);
			map.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}
