package lichen000.designpatten.abstractfactory;

/**
 * Created by chen.li200 on 2018-01-09
 */
public abstract class AbstractFactory {
	abstract Shape getShape(String shape);
	abstract Color getColor(String color);
}
